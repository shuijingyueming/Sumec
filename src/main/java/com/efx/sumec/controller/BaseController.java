package com.efx.sumec.controller;


import com.efx.sumec.model.*;
import com.efx.sumec.pub.properConfig;
import com.efx.sumec.service.*;
import com.efx.sumec.until.EncrpytUtil;
import com.efx.sumec.until.RSACoder;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Controller
public class BaseController {
    @Autowired
    properConfig config;//配置信息

    @Autowired
    protected YluseService useService;//用户信息
    @Autowired
    protected YlxxzService xxzService;//网站信息
    @Autowired
    protected YljseService jseService;//关于我们
    @Autowired
    protected YljsdService jsdService;//广告
    @Autowired
    protected YlwzbService wzbService;//产品标签
    @Autowired
    protected YlwzaService wzaService;//产品标签对应
    @Autowired
    protected YlusfService usfService;//规格名称
    @Autowired
    protected YljbbService jbbService;//规格产品对应
    @Autowired
    protected YlutaService utaService;//订单
    @Autowired
    protected YlxtfService xtfService;//产品类别
    @Autowired
    protected YljsbService jsbService;//产品
    @Autowired
    protected YljscService jscService;


    //静态公共时间格式对象     调用BaseController.DATE
    protected final static SimpleDateFormat DATE = new SimpleDateFormat("yyyy-MM-dd");
    protected final static SimpleDateFormat DATE1 = new SimpleDateFormat("yyyyMM");
    protected final static SimpleDateFormat DATE2 = new SimpleDateFormat("MM.dd");
    protected final static SimpleDateFormat TIMEHOUR = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    protected final static SimpleDateFormat TIMEMIAO = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected final static SimpleDateFormat TIMEMIAO1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    protected final static SimpleDateFormat TIME_MIAO = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    protected final static SimpleDateFormat TIME_ORDER = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    protected final static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    protected final static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    protected final static DecimalFormat numberdf = new DecimalFormat("#.0000");

    protected final static SimpleDateFormat DATE3 = new SimpleDateFormat("yyyy/MM/dd");
    protected final static SimpleDateFormat sdf1 = new SimpleDateFormat("yyMMddHHmmss");

    protected final static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
    protected final static SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM");

    protected final static SimpleDateFormat sdf4 = new SimpleDateFormat("MM月");

    protected final static SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy年MM月");
    protected final static SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy年MM月dd日");

    protected final static DecimalFormat num1 = new DecimalFormat("0.0");

    /**
     * 输出流输出父级返回login
     *
     * @throws Exception
     */
    protected void SystemTZYM(HttpServletResponse response, String error)
            throws Exception {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<script>");
        out.println("window.parent.location='/toLogin?error=" + error + "';");
        out.println("</script>");
        out.println("</html>");
        out.flush();
    }

    /**
     * 解码session内的用户id
     * 返回登录用户id
     */
    protected int Decrypt(String code) throws Exception {
        int id = 0;
        if(code!=null&&!code.trim().isEmpty()){
            byte[] decodedData = RSACoder.decryptByPrivateKey(RSACoder.decryptBASE64(code), EncrpytUtil.privateKey);
            id = Integer.parseInt(new String(decodedData));
        }
        return id;
    }

    /**
     * 获取所有线程
     *
     * @return
     */
    public static Thread[] findAllThread() {
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        while (currentGroup.getParent() != null) {
            // 返回此线程组的父线程组
            currentGroup = currentGroup.getParent();
        }
        //此线程组中活动线程的估计数
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        //把对此线程组中的所有活动子组的引用复制到指定数组中。
        currentGroup.enumerate(lstThreads);
//	   for (Thread thread : lstThreads) {
//	      System.out.println("线程数量："+noThreads+" 线程id：" + thread.getId() + " 线程名称：" + thread.getName() + " 线程状态：" + thread.getState());
//	   }
        return lstThreads;
    }

    protected void delsession(HttpSession session, String fhlx)throws Exception {
        if(fhlx==null||fhlx.indexOf("JG")<0)session.removeAttribute("JGpb");//机构}
        if(fhlx==null||fhlx.indexOf("NJ")<0)session.removeAttribute("NJpb");//年级}
        if(fhlx==null||fhlx.indexOf("XX")<0)session.removeAttribute("XXpb");//用户}
        if(fhlx==null||fhlx.indexOf("STJ")<0)session.removeAttribute("STJpb");//社区统计}
    }

    protected void uploadpic(String newFilePath, MultipartFile upfile, String oldFilePath) throws Exception{
        String fpath = LoginController.class.getClass().getResource("/").getPath();
        fpath = fpath.substring(1,fpath.length())+"static/";
        //删除原文件
        if (oldFilePath != null) {
            File oldFile = new File(fpath+oldFilePath);
            oldFile.delete();
        }
        //上传新文件
        if (newFilePath != null && upfile != null) {
            File file = new File(fpath+newFilePath);
            if (!file.exists()) {
                file.mkdirs();
            }
            try {
                upfile.transferTo(file);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }

    public void downloadLocal(String path,String name,HttpServletResponse response, HttpServletRequest request) throws Exception {
        String fileName = name.toString();
        // 读到流中
        InputStream inStream = new FileInputStream(path);// 文件的存放路径
        //获得浏览器代理信息
        final String userAgent = request.getHeader("USER-AGENT");
        //判断浏览器代理并分别设置响应给浏览器的编码格式
        String finalFileName = null;
        if(StringUtils.contains(userAgent, "MSIE")||StringUtils.contains(userAgent,"Trident")){//IE浏览器
            finalFileName = URLEncoder.encode(fileName,"UTF8");
        }else if(StringUtils.contains(userAgent, "Mozilla")){//google,火狐浏览器
            finalFileName = new String(fileName.getBytes(), "ISO8859-1");
        }else{
            finalFileName = URLEncoder.encode(fileName,"UTF8");//其他浏览器
        }
        // 设置输出的格式
        response.reset();
        response.addHeader("content-type","application/x-msdownload");
        response.addHeader("Content-Disposition", "attachment; filename=" + finalFileName);
        // 循环取出流中的数据
        byte[] b = new byte[100];
        int len;
        try {
            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getTimeInterval(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几天
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // System.out.println("要计算日期为:" + sdf.format(cal.getTime())); // 输出要计算日期
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        //String imptimeBegin = TIMEMIAO1.format(cal.getTime());
        // System.out.println("所在周星期一的日期：" + imptimeBegin);
        //cal.add(Calendar.DATE, 6);
        //String imptimeEnd = TIMEMIAO1.format(cal.getTime());
        // System.out.println("所在周星期日的日期：" + imptimeEnd);
        String time=DATE.format(cal.getTime());
        for(int i=0;i<6;i++){
            cal.add(Calendar.DATE, 1);
            time+=","+DATE.format(cal.getTime());
        }
        return time;
    }

    public String getLastTimeInterval() {
        Calendar cal = Calendar.getInstance();
//        Calendar calendar2 = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;
        int offset1 = 1 - dayOfWeek;
//        int offset2 = 7 - dayOfWeek;
        cal.add(Calendar.DATE, offset1 - 7);
//        calendar2.add(Calendar.DATE, offset2 - 7);
////        System.out.println(sdf.format(cal.getTime()));// last Monday
//        String lastBeginDate = sdf.format(cal.getTime());
//        // System.out.println(sdf.format(calendar2.getTime()));// last Sunday
//        String lastEndDate = sdf.format(calendar2.getTime());
//        return lastBeginDate + "," + lastEndDate;
        String time=DATE.format(cal.getTime());
        for(int i=0;i<6;i++){
            cal.add(Calendar.DATE, 1);
            time+=","+DATE.format(cal.getTime());
        }
        return time;
    }

    public List<String> getMonths(Date start,Date end) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        // 获取开始年份和开始月份
        int startYear = calendar.get(Calendar.YEAR);
        int startMonth = calendar.get(Calendar.MONTH);
        // 获取结束年份和结束月份
        calendar.setTime(end);
        int endYear = calendar.get(Calendar.YEAR);
        int endMonth = calendar.get(Calendar.MONTH);
        //
        List<String> list = new ArrayList<String>();
        for (int i = startYear; i <= endYear; i++) {
            String date = "";
            if (startYear == endYear) {
                for (int j = startMonth; j <= endMonth; j++) {
                    if (j < 9) {
                        date = i + "-0" + (j + 1);
                    } else {
                        date = i + "-" + (j + 1);
                    }
                    list.add(date);
                }

            } else {
                if (i == startYear) {
                    for (int j = startMonth; j < 12; j++) {
                        if (j < 9) {
                            date = i + "-0" + (j + 1);
                        } else {
                            date = i + "-" + (j + 1);
                        }
                        list.add(date);
                    }
                } else if (i == endYear) {
                    for (int j = 0; j <= endMonth; j++) {
                        if (j < 9) {
                            date = i + "-0" + (j + 1);
                        } else {
                            date = i + "-" + (j + 1);
                        }
                        list.add(date);
                    }
                } else {
                    for (int j = 0; j < 12; j++) {
                        if (j < 9) {
                            date = i + "-0" + (j + 1);
                        } else {
                            date = i + "-" + (j + 1);
                        }
                        list.add(date);
                    }
                }

            }
        }
        return list;
    }

    /**
     * @param cntDateBeg 开始时间
     * @param cntDateEnd 结束时间
     * @return
     */
    public static List<String> addDates(String cntDateBeg, String cntDateEnd) {
        List<String> list = new ArrayList<>();
        //拆分成数组
        String[] dateBegs = cntDateBeg.split("-");
        String[] dateEnds = cntDateEnd.split("-");
        //开始时间转换成时间戳
        Calendar start = Calendar.getInstance();
        start.set(Integer.valueOf(dateBegs[0]), Integer.valueOf(dateBegs[1]) - 1, Integer.valueOf(dateBegs[2]));
        Long startTIme = start.getTimeInMillis();
        //结束时间转换成时间戳
        Calendar end = Calendar.getInstance();
        end.set(Integer.valueOf(dateEnds[0]), Integer.valueOf(dateEnds[1]) - 1, Integer.valueOf(dateEnds[2]));
        Long endTime = end.getTimeInMillis();
        //定义一个一天的时间戳时长
        Long oneDay = 1000 * 60 * 60 * 24l;
        Long time = startTIme;
        //循环得出
        while (time <= endTime) {
            list.add(new SimpleDateFormat("yyyy-MM-dd").format(new Date(time)));
            time += oneDay;
        }
        return list;
    }

    /**
     * 以周分割时间段
     *
     * @param startDate     开始时间
     * @param endDate       结束时间
     * @param beginDateList 开始段时间戳 和 结束段时间戳 一一对应
     * @param endDateList   结束段时间戳 和 开始段时间戳 一一对应
     */
    public static void getIntervalTimeByWeek(Date startDate,  Date endDate, List<Date> beginDateList, List<Date> endDateList) {

        SimpleDateFormat sdw = new SimpleDateFormat("E");
        Calendar calendar = Calendar.getInstance();
        String begin = sdw.format(startDate);
        calendar.setTime(startDate);
        beginDateList.add(calendar.getTime());
        if ("星期一".equals(begin)) {
            addTimeStamp(beginDateList, endDateList, startDate, endDate, sdw, calendar);
        } else {
            if ("星期日".equals(sdw.format(startDate))) {
                Calendar special = Calendar.getInstance();
                special.setTime(startDate);
                special.set(Calendar.HOUR_OF_DAY, 23);
                special.set(Calendar.MINUTE, 59);
                special.set(Calendar.SECOND, 59);
                endDateList.add(special.getTime());
            }
            addTimeStamp(beginDateList, endDateList, startDate, endDate, sdw, calendar);
        }
    }

    /**
     * 按照月份分割一段时间
     *
     * @param startDate     开始时间
     * @param endDate       结束时间
     * @param beginDateList 开始段时间戳 和 结束段时间戳 一一对应
     * @param endDateList   结束段时间戳 和 开始段时间戳 一一对应
     */
    public static void getIntervalTimeByMonth(Date startDate,  Date endDate, List<Date> beginDateList, List<Date> endDateList) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        beginDateList.add(calendar.getTime());
        while (calendar.getTimeInMillis() < endDate.getTime()) {
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.add(Calendar.DATE, -1);
            calendar.set(Calendar.HOUR_OF_DAY, 13);
            calendar.set(Calendar.MINUTE, 59);
            calendar.set(Calendar.SECOND, 59);
            if(calendar.getTimeInMillis() < endDate.getTime()){
                endDateList.add(calendar.getTime());
            } else {
                endDateList.add(endDate);
                break;
            }
            calendar.add(Calendar.DATE, 1);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            beginDateList.add(calendar.getTime());
        }
    }

    private static void addTimeStamp(List<Date> beginDateList, List<Date> endDateList, Date startDate, Date endDate, SimpleDateFormat sdw, Calendar calendar) {
        while (startDate.getTime() < endDate.getTime()) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            startDate = calendar.getTime();
            if ("星期一".equals(sdw.format(startDate))) {
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);
                beginDateList.add(calendar.getTime());
            } else if ("星期日".equals(sdw.format(startDate)) || startDate.getTime() >= endDate.getTime()) {
                if (startDate.getTime() <= endDate.getTime()) {
                    calendar.set(Calendar.HOUR_OF_DAY, 23);
                    calendar.set(Calendar.MINUTE, 59);
                    calendar.set(Calendar.SECOND, 59);
                    endDateList.add(calendar.getTime());
                } else {
                    endDateList.add(endDate);
                }
            }
        }
    }

    /**
     * 获取登录用户
     */
    protected yluse getUse(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        yluse use=useService.getByid(Decrypt(session.getAttribute("user").toString()));
        return use;
    }

    public String getRemortlP(HttpServletRequest request){
        if (request.getHeader("x-forwarded-for") == null){
            return request.getRemoteAddr();
        }
        return request.getHeader("x-forwarded-for");
    }

    protected user getUser() throws Exception {
        user user = new user();
        ylxxz xxz = xxzService.selGetAll();
        user.setZt(xxz.getXxz002());
        user.setTitle(xxz.getXxz005());
        user.setKeyword(xxz.getXxz006());
        user.setWebjj(xxz.getXxz007());
        user.setWeb(xxz.getXxz010());
        user.setEmail(xxz.getXxz011());
        user.setTel(xxz.getXxz012());
        user.setAdd(xxz.getXxz013());
        user.setCpyst(xxz.getXxz016());
        user.setCpys(xxz.getXxz017());
        user.setBqlist(wzbService.serachAll());
        user.setFllist(xtfService.selectBytype());
        return user;
    }

    /**
     *
     * 上传文件
     * @throws IOException
     */
    protected Map scwj1(MultipartFile file,Date date,String jtp,String wjjm,HttpServletRequest request,String[] arr, long desFileSize) throws IOException{
        String path = LoginController.class.getClass().getResource("/").getPath();
        path = path.substring(1,path.length())+"static/";
                            String jtps = null!=jtp&&!jtp.toString().trim().isEmpty()?path+wjjm+"/"+jtp:null;
        Map map = new HashMap();

        String filejw = (file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."))).toLowerCase();
        String filename = TIME_ORDER.format(date)+filejw;

        if(!Arrays.asList(arr).contains(filejw)){
            map.put("error", "1");
            return map;
        }

        if (jtps != null) {
            File oldFile = new File(jtps);
            oldFile.delete();
        }

        byte[] byt;

        byt = file.getBytes();

        File fil = new File(path+wjjm);
        if (!fil.exists()) {
            fil.mkdirs();
        }

        fil = new File(path+wjjm+"/"+filename);

        FileImageOutputStream imageOutput = new FileImageOutputStream(fil);
        imageOutput.write(byt, 0, byt.length);
        imageOutput.close();

        map.put("error", "0");
        map.put("fileName", filename);
        return map;
    }

}

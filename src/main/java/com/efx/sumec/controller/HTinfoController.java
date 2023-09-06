package com.efx.sumec.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.efx.sumec.model.*;
import com.efx.sumec.pub.Datamsg;
import com.efx.sumec.until.EncrpytUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/toHt")
public class HTinfoController extends BaseController {

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private TemplateEngine templateEngine;


    @RequestMapping("/toHTindex")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    /**
     * 进入管理员管理页面
     * othersql:登录名  othersql1:真实姓名  othersql2:电话 othersql3:职位
     * @return 用户页面
     */
    @RequestMapping("/indexi")
    public ModelAndView indexi(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        mav.setViewName("index_i");
        return mav;
    }

    /**
     * 进入管理员管理页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping("/staff")
    public ModelAndView staff(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }else{
            userid = Decrypt(session.getAttribute("user").toString());
            yluse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
            mav.addObject("msg", request.getParameter("msg"));
            PageBean pb = new PageBean();
            if(request.getParameter("zt") != null && !request.getParameter("zt").toString().isEmpty()){
                if(request.getParameter("zt").equals("U")){
                    yluse use =useService.getByid(Integer.parseInt(request.getParameter("id")));
                    use.setUse008(request.getParameter("type"));
                    useService.update(use);
                    mav.addObject("msg","C");
                }else if(request.getParameter("zt").equals("R")){
                    yluse use = useService.getByid(Integer.valueOf(request.getParameter("id")));
                    use.setUse003(EncrpytUtil.getSHA256("123456"));
                    useService.update(use);
                    mav.addObject("msg","M");
                }
            }
            if (request.getParameter("pages") != null && !request.getParameter("pages").toString().isEmpty())
                pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
            else
                pb.setCurrentPage(1);
            if (request.getParameter("name") != null && !request.getParameter("name").toString().isEmpty()) {
                pb.setOthersql(request.getParameter("name"));
            }
            if (request.getParameter("phone") != null && !request.getParameter("phone").toString().isEmpty()) {
                pb.setOthersql1(request.getParameter("phone"));
            }
            delsession(session,request.getParameter("fh"));
            mav.addObject("pageobj", useService.selectPageBean(pb));
        }
        mav.setViewName("staff");
        return mav;
    }

    /**
     * 修改后台用户信息
     * 2021-05-09
     * 王新苗
     */
    @ResponseBody
    @RequestMapping("/updateUseXx")
    public JSONObject updateUseXx(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        yluse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        Map map = new HashMap();
        String log = "修改管理员信息:";
        if (user == null) {
            map.put("msg", "登录失效");
        }
        if (request.getParameter("truename") != null && StringUtils.isNotEmpty(request.getParameter("truename"))) {
            user.setUse004(request.getParameter("truename"));
        }
        if (request.getParameter("phone") != null && StringUtils.isNotEmpty(request.getParameter("phone"))) {
            user.setUse005(request.getParameter("phone"));
        }
        boolean rows = useService.update(user);
        if (rows) {
            map.put("msg", "0");
            response.getWriter().print(new JSONObject(map));
        } else{
            map.put("msg", "1");
            response.getWriter().print(new JSONObject(map));
        }

        return null;
    }


    /**
     * 根据id获取用户
     * 2023-03-24
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/serachyh",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String serachyh(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer id = Integer.valueOf(request.getParameter("id"));
        HashMap result = new HashMap();yluse use=useService.getByid(id);
        result.put("item",use);
        return JSON.toJSONString(result);
    }

    /**
     * 修改账户
     * 2023-03-24
     * 王新苗
     * @param request
     * @param response
     */
    @RequestMapping(value = "/xgzh")
    public ModelAndView xgzh(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        yluse use = new yluse();
        //修改
        use.setUse002(request.getParameter("t1"));
        use.setUse004(request.getParameter("t2"));
        use.setUse005(request.getParameter("t3"));

        if(request.getParameter("id")!=null&&!request.getParameter("id").isEmpty()){
            use.setUse001(Integer.valueOf((request.getParameter("id"))));
            useService.update(use);
            mav.addObject("msg", "U");
        }else{
            use.setUse003(EncrpytUtil.getSHA256("123456"));
            use.setUse008("A");
            use.setUse007(new Date());
            use = useService.insert(use);
            mav.addObject("msg", "I");
        }
        mav.addObject("pages", request.getParameter("pages"));
        mav.addObject("phone", request.getParameter("phone"));
        mav.addObject("name", request.getParameter("name"));
        mav.setViewName("redirect:/toHt/staff");
        return mav;
    }

    /**
     * 获取数据备份信息
     * 王新苗
     */
    @RequestMapping(value="/selsjbf")
    public ModelAndView selsjbf(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if(null==session.getAttribute("user")){
            SystemTZYM(response,"登录失效");
            return null;
        }
        mav.addObject("xxz", xxzService.selGetAll());
        mav.addObject("msg", request.getParameter("msg"));
        delsession(session,request.getParameter("fh"));
        mav.setViewName("sjbf");
        return mav;
    }

    /**
     * 数据库自动备份
     * 王新苗
     */
    @RequestMapping("/xgbf")
    public ModelAndView xgbf(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if(null==session.getAttribute("user")){
            SystemTZYM(response,"登录失效");
            return null;
        }
        ylxxz xxz = new ylxxz();
		/*xxz.setXxz010(request.getParameter("sjkname"));
		xxz.setXxz011(request.getParameter("dlname"));
		xxz.setXxz012(request.getParameter("dlmima"));
		xxz.setXxz015(request.getParameter("sjkdz"));*/
        if(null!=request.getParameter("bfts")&&!request.getParameter("bfts").toString().isEmpty())
            xxz.setXxz004(Integer.valueOf(request.getParameter("bfts")));
        else
            xxz.setXxz004(1);
        if(null!=request.getParameter("sjbfid")&&!request.getParameter("sjbfid").toString().isEmpty()){
            xxz.setXxz001(Integer.valueOf(request.getParameter("sjbfid")));
            xxzService.update(xxz);
        }/*else{
            xxzService.insert(xxz);
            addLog(getUse(request).getUse002(),"对数据库备份进行了添加"+request.getParameter("bfts"));
        }*/
        PubMessage.setXxz(xxzService.selGetAll());
        Thread[] lstThreads = findAllThread();
        for (Thread thread : lstThreads) {
            if(thread.getName().equals("beifen")){
                thread.interrupt();
            }
        }
        new Thread(){
            public void run(){
                this.setName("beifen");
                while (true) {
                    try {
                        long current = System.currentTimeMillis();// 当前时间毫秒数
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(Calendar.DAY_OF_MONTH, 1);
                        calendar.set(Calendar.HOUR_OF_DAY, 0);
                        calendar.set(Calendar.MINUTE, 0);
                        calendar.set(Calendar.SECOND, 0);
                        calendar.set(Calendar.MILLISECOND, 0);
                        long tomorrowzero = calendar.getTimeInMillis();
                        long tomorrowzeroSeconds = (tomorrowzero- current);
                        //按天算+早上2：00
                        Thread.sleep(((PubMessage.getXxz().getXxz004()-1)*86400000)+7200000+tomorrowzeroSeconds);
                        if (Datamsg.exportDatabaseTool(config.getJdbcurl(), config.getJdbcdk(),
                                config.getUsername(),config.getPassword(),
                                "c:\\backup\\","xhh("+TIME_ORDER.format(new Date())+").sql",config.getDataname(),
                                this.getClass().getResource("/").getPath()+"\\")) {
                            System.out.println("数据库成功备份！！！");
                        } else {
                            System.out.println("数据库备份失败！！！");
                        }
                    } catch (InterruptedException e) { }
                }
            }
        }.start();
        mav.addObject("msg", "H");
        mav.setViewName("redirect:/toHt/selsjbf");
        return mav;

    }

    /**
     * 手动备份后并下载
     * 王新苗
     * 注意 mysqldump有没有放在quality/target/classes下
     */
    @RequestMapping("/backupdownload")
    public void backupdownload(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Datamsg.beifenMysql(request, response,config,this.getClass().getResource("/").getPath()+"\\");
    }

    /**
     * 网站信息
     * 王新苗
     */
    @RequestMapping(value="/wzxx")
    public ModelAndView towzxx(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if(null==session.getAttribute("user")){
            SystemTZYM(response,"登录失效");
            return null;
        }
        mav.addObject("item", xxzService.selGetAll());
        mav.addObject("msg", request.getParameter("msg"));
        mav.setViewName("wzxx");
        return mav;
    }

    /**
     * 网站信息新增/修改
     * 王新苗
     */
	@RequestMapping(value="/xgwz")
	public ModelAndView xgwz(HttpServletRequest request,HttpServletResponse response)throws Exception{
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		if(null==session.getAttribute("user")){
				SystemTZYM(response,"登录失效");
				return null;
		}
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
        ylxxz xxz = new ylxxz();
		MultipartFile file = multipartHttpServletRequest.getFile("up");
		if(null!=file.getOriginalFilename()&&!file.getOriginalFilename().toString().isEmpty()){
			uploadpic("upload/mapimg/clogo.png",file,null);
		}
        MultipartFile file1 = multipartHttpServletRequest.getFile("up1");
        if(null!=file1.getOriginalFilename()&&!file1.getOriginalFilename().toString().isEmpty()){
            uploadpic("upload/mapimg/hmap.jpg ",file1,null);
        }
        MultipartFile file2 = multipartHttpServletRequest.getFile("up2");
        if(null!=file2.getOriginalFilename()&&!file2.getOriginalFilename().toString().isEmpty()){
            uploadpic("assets/favicon.ico",file2,null);
        }
        MultipartFile file3 = multipartHttpServletRequest.getFile("up3");
        if(null!=file3.getOriginalFilename()&&!file3.getOriginalFilename().toString().isEmpty()){
            String filename=sdf.format(new Date())+file3.getOriginalFilename().substring(file3.getOriginalFilename().lastIndexOf("."));
            uploadpic("upload/mapimg/"+filename,file3,"upload/mapimg/"+request.getParameter("t16"));
            xxz.setXxz016(filename);
        }
        xxz.setXxz002(request.getParameter("t1"));
        xxz.setXxz005(request.getParameter("t2"));
        xxz.setXxz006(request.getParameter("t3"));
        xxz.setXxz007(request.getParameter("t4"));
		xxz.setXxz010(request.getParameter("t5"));
		xxz.setXxz011(request.getParameter("t6"));
        xxz.setXxz012(request.getParameter("t7"));
        xxz.setXxz013(request.getParameter("t8"));
        xxz.setXxz017(request.getParameter("t9"));
		if(null!=request.getParameter("sjbfid")&&!request.getParameter("sjbfid").toString().isEmpty()){
			xxz.setXxz001(Integer.valueOf(request.getParameter("sjbfid")));
            xxz.setXxz008(getUse(request).getUse001());
            xxz.setXxz009(new Date());
			xxzService.update(xxz);
		}
		PubMessage.setXxz( xxzService.selGetAll());
		ServletContext context = session.getServletContext();
		context.setAttribute("item", PubMessage.getXxz());
		mav.addObject("msg", "C");
		mav.setViewName("redirect:/toHt/wzxx");
		return mav;
	}

    /**
     * 关于我们
     * 王新苗
     */
    @RequestMapping(value="/about")
    public ModelAndView toabout(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if(null==session.getAttribute("user")){
            SystemTZYM(response,"登录失效");
            return null;
        }
        mav.addObject("item", jseService.selGetAll());
        mav.setViewName("about");
        return mav;
    }

    /**
     * 关于我们新增/修改
     * 王新苗
     */
    @RequestMapping(value="/xgabout")
    public ModelAndView xgabout(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if(null==session.getAttribute("user")){
            SystemTZYM(response,"登录失效");
            return null;
        }
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
        yljse item = new yljse();
        item.setJse002(request.getParameter("t1"));
        item.setJse003(request.getParameter("t2"));
        item.setJse004(request.getParameter("t3"));
        if(null!=request.getParameter("id")&&!request.getParameter("id").toString().isEmpty()){
            item.setJse001(Integer.valueOf(request.getParameter("id")));
            item.setJse005(getUse(request).getUse001());
            item.setJse006(new Date());
            jseService.update(item);
        }
        mav.addObject("item", jseService.selGetAll());
        mav.addObject("msg", "C");
        mav.setViewName("redirect:/toHt/about");
        return mav;
    }

    /**
     * 进入广告页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping(value ="/togg")
    public ModelAndView togg(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }else{
            userid = Decrypt(session.getAttribute("user").toString());
            mav.addObject("msg",request.getParameter("msg") );
            if(request.getParameter("zt") != null && !request.getParameter("zt").toString().isEmpty()){
                if(request.getParameter("zt").equals("D")){
                    yljsd jsd=jsdService.getByid(Integer.parseInt(request.getParameter("id")));
                    uploadpic(null, null, "upload/ggimg/"+jsd.getJsd002());
                    jsdService.deleteById(Integer.parseInt(request.getParameter("id")));
                    mav.addObject("msg","D");
                }else if(request.getParameter("zt").equals("AD")){
                    List<yljsd> list=jsdService.getByid(request.getParameter("id"));
                    for(yljsd jsd:list){
                        uploadpic(null, null, "upload/ggimg/"+jsd.getJsd002());
                    }
                    jsdService.deleteById(request.getParameter("id"));
                    mav.addObject("msg","D");
                }
            }
            PageBean pb = new PageBean();
            if (request.getParameter("pages") != null && !request.getParameter("pages").toString().isEmpty())
                pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
            else
                pb.setCurrentPage(1);
            if (request.getParameter("name") != null && !request.getParameter("name").toString().isEmpty()) {
                pb.setOthersql(request.getParameter("name"));
            }
            mav.addObject("pageobj", jsdService.selectPageBean(pb));
        }
        mav.setViewName("HTgg");
        return mav;
    }


    /**
     * 根据id获取广告
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/serachgg",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String serachxz(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer id = Integer.valueOf(request.getParameter("id"));
        HashMap result = new HashMap();yljsd jsd=jsdService.getByid(id);
        result.put("item",jsd);
        return JSON.toJSONString(result);
    }
    /**
     * 修改广告
     * 王新苗
     * @param request
     * @param response
     */
    @RequestMapping(value = "/xggg")
    public ModelAndView xggg(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        yljsd item = new yljsd();
        //修改
        Date date = new Date();
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
        MultipartFile file = multipartHttpServletRequest.getFile("t1");
        if(null!=file.getOriginalFilename()&&!file.getOriginalFilename().toString().isEmpty()){
            String filename = sdf.format(date)+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            item.setJsd002(filename);
            uploadpic("upload/ggimg/"+filename,file,"upload/ggimg/"+request.getParameter("t2"));
        }
        if(request.getParameter("id")!=null&&!request.getParameter("id").isEmpty()){
            item.setJsd001(Integer.valueOf((request.getParameter("id"))));
            jsdService.update(item);
            mav.addObject("msg","U");
        }else{
            item = jsdService.insert(item);
            mav.addObject("msg","I");
        }
        mav.addObject("pages", request.getParameter("pages"));
//        mav.addObject("name", request.getParameter("name"));
        mav.setViewName("redirect:/toHt/togg");
        return mav;
    }
}

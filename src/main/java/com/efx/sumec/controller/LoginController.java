package com.efx.sumec.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.efx.sumec.model.*;
import com.efx.sumec.until.EncrpytUtil;
import com.efx.sumec.until.RSACoder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;

@Controller
public class LoginController extends BaseController {

    private final HttpServletRequest request;
    private final HttpServletResponse response;
    private final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    char[] codeSequence = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


    public LoginController(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }
    // private HttpServletResponse response;

    /**
     * 访问网站后台，检测用户session是否存在，不存在跳转到登陆页面
     *
     * @return
     */
    @RequestMapping(value = "*")
    public ModelAndView toLoginnew() throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (null == session.getAttribute("user")) {
            mav.addObject("error", request.getParameter("error"));
            session.setAttribute("dnumn", 0);
            mav.setViewName("HTlogin");
            return mav;
        }
        mav.setViewName("redirect:/toHt/toIndex");
        return mav;
    }


    /**
     * 访问网站后台，检测用户session是否存在，不存在跳转到登陆页面
     *
     * @return
     */
    @RequestMapping(value = "/toLogin")
    public ModelAndView toLogin() throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (null == session.getAttribute("user")) {
            mav.addObject("error", request.getParameter("error"));
            session.setAttribute("dnumn", 0);
            mav.setViewName("HTlogin");
            return mav;
        }
        mav.setViewName("redirect:/toHt/toIndex");
        return mav;
    }

    @RequestMapping("/code.do")
    public void getCode(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uname = req.getParameter("uname");
        // 定义图像buffer
        BufferedImage buffImg = new BufferedImage(120, 50, BufferedImage.TYPE_INT_RGB);
        Graphics gd = buffImg.getGraphics();
        // 创建一个随机数生成器类
        Random random = new Random();
        // 将图像填充为白色
        gd.setColor(Color.WHITE);
        gd.fillRect(0, 0, 120, 50);
        // 创建字体，字体的大小应该根据图片的高度来定。
        Font font = new Font("Fixedsys", Font.BOLD, 38);
        // 设置字体。
        gd.setFont(font);
        // 画边框。
        gd.setColor(Color.BLACK);
        gd.drawRect(0, 0, 120 - 1, 50 - 1);
        // 随机产生40条干扰线，使图象中的认证码不易被其它程序探测到。
        gd.setColor(Color.BLACK);
        for (int i = 0; i < 40; i++) {
            int x = random.nextInt(120);
            int y = random.nextInt(50);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            gd.drawLine(x, y, x + xl, y + yl);
        }
        // randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
        StringBuffer randomCode = new StringBuffer();
        int red = 0, green = 0, blue = 0;
        HttpSession session = req.getSession();
        // 随机产生codeCount数字的验证码。
        String[] sp = null;


        for (int i = 0; i < 4; i++) {
            // 得到随机产生的验证码数字。
            String code = "";
            if (sp != null) code = sp[i];
            else code = String.valueOf(codeSequence[random.nextInt(codeSequence.length - 1)]);
            // 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
            red = random.nextInt(255);
            green = random.nextInt(255);
            blue = random.nextInt(255);
            // 用随机产生的颜色将验证码绘制到图像中。
            gd.setColor(new Color(red, green, blue));
            gd.drawString(code, i == 0 ? 10 : (i + 1) * 20, 40);
            // 将产生的四个随机数组合在一起。
            randomCode.append(code);
        }
        // 将四位数字的验证码保存到Session中。
        PubMessage.dlmap.put(uname + "bcode", randomCode.toString());
        // session.setAttribute("code", randomCode.toString());
        // 禁止图像缓存。
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", 0);
        resp.setContentType("image/jpeg");
        // 将图像输出到Servlet输出流中。
        ServletOutputStream sos = resp.getOutputStream();
        ImageIO.write(buffImg, "jpeg", sos);
        sos.close();
    }

    /**
     * 校验登陆
     */
    @RequestMapping(value = "/checkLogin")
    public ModelAndView checkLogin() throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        String name = request.getParameter("username");
        String pwd = request.getParameter("userpwd");
        String ycode = request.getParameter("ycode");
        name = EncrpytUtil.decode(name);
        pwd = EncrpytUtil.decode(pwd);
        // System.out.println(name+"---"+pwd);
        boolean isok = true;
        request.getHeader("");
        //是否锁定账号
        if (PubMessage.dlmap.get(name + "dnumn") != null && Integer.parseInt(PubMessage.dlmap.get(name + "dnumn").toString()) >= 5) {
            if (PubMessage.dlmap.get(name) == null) {
                PubMessage.dlmap.put(name, sf.format(new Date()));
                mav.addObject("error", "您因多次登录失败，已被锁定。");
                isok = false;
                mav.setViewName("HTlogin");
            } else if (PubMessage.dlmap.get(name) != null) {
                //判断是否过期
                String dtaetime = PubMessage.dlmap.get(name).toString();
                Date d1 = new Date();
                Date d2 = sf.parse(dtaetime);
                if ((d2.getTime() + 600000) < d1.getTime()) {
                    isok = true;
                    PubMessage.dlmap.remove(name);
                    PubMessage.dlmap.put(name + "dnumn", 0);
                } else {
                    isok = false;
                    mav.setViewName("HTlogin");
                    session.setAttribute("dnumn", PubMessage.dlmap.get(name + "dnumn").toString());
                    mav.addObject("error", "您因多次登录失败，已被锁定。");
                }
            }
        }
        //  System.out.println(ycode+"----"+isok);
        // System.out.println(PubMessage.dlmap.get(name+"bcode").toString());
        if (isok) {
            if (PubMessage.dlmap.get(name + "bcode") == null) {
                mav.setViewName("HTlogin");
            }/*else if (!ycode.toUpperCase().equals(PubMessage.dlmap.get(name + "bcode").toString())) { //todo
                if (PubMessage.dlmap.get(name + "dnumn") == null) PubMessage.dlmap.put(name + "dnumn", 1);
                else
                    PubMessage.dlmap.put(name + "dnumn", Integer.parseInt(PubMessage.dlmap.get(name + "dnumn").toString()) + 1);

                if (Integer.parseInt(PubMessage.dlmap.get(name + "dnumn").toString()) >= 5) {
                    //保存一个时间
                    PubMessage.dlmap.put(name, sf.format(new Date()));
                }
                mav.addObject("error", "验证码错误");
                session.setAttribute("dnumn", PubMessage.dlmap.get(name + "dnumn").toString());
                mav.setViewName("HTlogin");
                isok = false;
            }else*/ if (null != name && !name.trim().isEmpty() && null != pwd && !pwd.trim().isEmpty()) {
                //cduse use = useService.getLogin(name, EncrpytUtil.getSHA256(pwd));
                //System.out.println(EncrpytUtil.getSHA256(pwd)+"-----");
//                if (null != use) {
//                        // 会话失效
//                        session.invalidate();
//                        // 会话重建
//                        PubMessage.dlmap.remove(name);
//                        PubMessage.dlmap.remove(name + "dnumn");
//                        PubMessage.dlmap.remove(name + "bcode");
//                        session = request.getSession(true);
//                        //用户id加密处理并保存
//                        String inputStr = use.getUse001() + "";
//                        byte[] encodedData = RSACoder.encryptByPublicKey(inputStr, EncrpytUtil.publicKey);
//                        session.setAttribute("user", RSACoder.encryptBASE64(encodedData));
//                        //用户信息
//                        user user = new user();
//                        user.setUname(use.getUse005());
//                        user.setJstype(use.getUse006());
//                        if (use.getUse006().equals("A")) user.setJs("平台管理员");
//                        else if (use.getUse006().equals("B")) user.setJs("街道管理员");
//                        else if (use.getUse006().equals("C")) {
//                            if(use.getUsd()!=null&&use.getUsd().getUsd014()!="B"){
//
//                                user.setJs("学校/社区");
//                            }
//                            else if (use.getUse006().equals("D")) user.setJs("老师");
//                            else if (use.getUse006().equals("E")) user.setJs("网格管理员");
//                            else user.setJs("微网格管理员");
//                        }
//                        cdusa usa = usaService.getByid(use.getUse008());
//                        user.setJsqx(use.getUse002().equals("admin")?"admin":
//                                (usa!=null?usa.getUsa002().equals("street")?"street":
//                                        (usa.getUsa002().equals("school")?"school":(usa.getUsa004()!=null?usa.getUsa004():"")):""));
//                        if(use.getUsd()!=null){
//                            user.setJname(use.getUsd().getUsd002());
//                            user.setJtype(use.getUsd().getUsd014());
//                        }
//                        session.setAttribute("umsg", user);
//                        if(use.getUsd()!=null&&use.getUsd().getUsd014()!="B"){
//                            mav.setViewName("redirect:/toxxHt/toHTindex");
//                        }else{
//                            mav.setViewName("redirect:/toHt/toHTindex");
//                        }
//                        addLog(use.getUse002(), "登录管理系统");
//                        isok = true;
//                } else {
//                    if (PubMessage.dlmap.get(name + "dnumn") == null) PubMessage.dlmap.put(name + "dnumn", 1);
//                    else
//                        PubMessage.dlmap.put(name + "dnumn", Integer.parseInt(PubMessage.dlmap.get(name + "dnumn").toString()) + 1);
//
//                    if (Integer.parseInt(PubMessage.dlmap.get(name + "dnumn").toString()) >= 5) {
//                        //保存一个时间
//                        PubMessage.dlmap.put(name, TIMEHOUR.format(new Date()));
//                    }
//                    session.setAttribute("dnumn", PubMessage.dlmap.get(name + "dnumn").toString());
//                    session.setAttribute("uname", name);
//                    mav.addObject("error", "用户名或密码错误");
//                    mav.setViewName("HTlogin");
//                    isok = false;
//                }
            } else {
                mav.setViewName("HTlogin");
            }
            if (isok) {
                PubMessage.dlmap.remove(name + "bcode");
            }
        }
        return mav;
    }

    /**
     * 退出
     */
    @ResponseBody
    @RequestMapping(value = "/toHTtuichu")
    public ModelAndView toHTtuichu() throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.removeAttribute("umsg");
        // 会话失效
        session.invalidate();
        // 会话重建
        session = request.getSession(true);
        mav.addObject("error", "退出成功");
        mav.setViewName("redirect:/toHt/toLogin");
        return mav;
    }

}

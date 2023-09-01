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
@RequestMapping("/toPr")
public class ProductController extends BaseController {

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private TemplateEngine templateEngine;

    /**
     * 进入标签页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping(value ="/tobq")
    public ModelAndView tobq(HttpServletRequest request,HttpServletResponse response) throws Exception{
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
                    wzaService.deleteById(Integer.parseInt(request.getParameter("id")));
                    wzbService.deleteById(Integer.parseInt(request.getParameter("id")));
                    mav.addObject("msg","D");
                }else if(request.getParameter("zt").equals("AD")){
                    wzaService.deleteById(request.getParameter("id"));
                    wzbService.deleteById(request.getParameter("id"));
                    mav.addObject("msg","D");
                }
            }
            PageBean pb = new PageBean();
            if (request.getParameter("pages") != null && !request.getParameter("pages").toString().isEmpty())
                pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
            else
                pb.setCurrentPage(1);
            /*if (request.getParameter("name") != null && !request.getParameter("name").toString().isEmpty()) {
                pb.setOthersql(request.getParameter("name"));
            }*/
            mav.addObject("pageobj", wzbService.selectPageBean(pb));
        }
        mav.setViewName("HTbq");
        return mav;
    }


    /**
     * 根据id获取标签
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/serachbq",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String serachbq(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer id = Integer.valueOf(request.getParameter("id"));
        HashMap result = new HashMap();ylwzb item=wzbService.getByid(id);
        result.put("item",item);
        return JSON.toJSONString(result);
    }
    /**
     * 修改标签
     * 王新苗
     * @param request
     * @param response
     */
    @RequestMapping(value = "/xgbq")
    public ModelAndView xgbq(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        ylwzb item = new ylwzb();
        item.setWzb002(request.getParameter("t1"));
        if(request.getParameter("id")!=null&&!request.getParameter("id").isEmpty()){
            item.setWzb001(Integer.valueOf((request.getParameter("id"))));
            wzbService.update(item);
            mav.addObject("msg","U");
        }else{
            item = wzbService.insert(item);
            mav.addObject("msg","I");
        }
        mav.addObject("pages", request.getParameter("pages"));
//        mav.addObject("name", request.getParameter("name"));
        mav.setViewName("redirect:/toPr/tobq");
        return mav;
    }

    /**
     * 进入规格页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping(value ="/tosp")
    public ModelAndView tosp(HttpServletRequest request,HttpServletResponse response) throws Exception{
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
                    jbbService.deleteById(Integer.parseInt(request.getParameter("id")));
                    usfService.deleteById(Integer.parseInt(request.getParameter("id")));
                    mav.addObject("msg","D");
                }else if(request.getParameter("zt").equals("AD")){
                    jbbService.deleteById(request.getParameter("id"));
                    usfService.deleteById(request.getParameter("id"));
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
            mav.addObject("pageobj", usfService.selectPageBean(pb));
        }
        mav.setViewName("HTsp");
        return mav;
    }


    /**
     * 根据id获取规格
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/serachsp",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String serachsp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer id = Integer.valueOf(request.getParameter("id"));
        HashMap result = new HashMap();ylusf item=usfService.getByid(id);
        result.put("item",item);
        return JSON.toJSONString(result);
    }

    /**
     * 修改规格
     * 王新苗
     * @param request
     * @param response
     */
    @RequestMapping(value = "/xgsp")
    public ModelAndView xgsp(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        ylusf item = new ylusf();
        item.setUsf002(request.getParameter("t1"));
        if(request.getParameter("id")!=null&&!request.getParameter("id").isEmpty()){
            item.setUsf001(Integer.valueOf((request.getParameter("id"))));
            usfService.update(item);
            mav.addObject("msg","U");
        }else{
            item = usfService.insert(item);
            mav.addObject("msg","I");
        }
        mav.addObject("pages", request.getParameter("pages"));
//        mav.addObject("name", request.getParameter("name"));
        mav.setViewName("redirect:/toPr/tosp");
        return mav;
    }

    /**
     * 进入产品类别页面
     * othersql:登录名  othersql1:评价分类
     * @return 用户页面
     */
    @RequestMapping(value ="/toca")
    public ModelAndView toca(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }else{
            userid = Decrypt(session.getAttribute("user").toString());
            if (request.getParameter("zt") != null && !request.getParameter("zt").toString().isEmpty()) {
                if (request.getParameter("zt").equals("D")) {
                    jsbService.deleteBylxid(Integer.parseInt(request.getParameter("id")));
                    xtfService.deleteById(Integer.parseInt(request.getParameter("id")));
                    xtfService.delete(Integer.parseInt(request.getParameter("id")));
                    mav.addObject("msg", "D");
                }
            }
            List<ylxtf>list=xtfService.selectBytype();
            mav.addObject("list", list);
            mav.setViewName("HTca");
        }
        return mav;
    }

    /**
     * 根据id获取产品类别
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/serachca",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String serachca(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        ylxtf item=xtfService.getByid(Integer.valueOf(request.getParameter("id")));
        result.put("item",item);
        return JSON.toJSONString(result);
    }
    /**
     * 修改产品类别
     * 王新苗
     * @param request
     * @param response
     */
    @RequestMapping(value = "/xgca")
    public ModelAndView xgca(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        ylxtf item = new ylxtf();
        //修改
        if(!request.getParameter("t1").isEmpty())item.setXtf002(request.getParameter("t1"));
        if(!request.getParameter("sjid").isEmpty())item.setXtf003(Integer.valueOf(request.getParameter("sjid")));
        if(request.getParameter("id")!=null&&!request.getParameter("id").isEmpty()){
            item.setXtf001(Integer.valueOf((request.getParameter("id"))));
            xtfService.update(item);
            mav.addObject("msg","U");
        }else{
            item = xtfService.insert(item);
            mav.addObject("msg","I");
        }
        mav.setViewName("redirect:/toPr/toca");
        return mav;
    }
    /**
     * 进入产品页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping(value ="/tocp")
    public ModelAndView tocp(HttpServletRequest request,HttpServletResponse response) throws Exception{
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
                    utaService.deleteBycpid(Integer.parseInt(request.getParameter("id")));
                    jsbService.deleteById(Integer.parseInt(request.getParameter("id")));
                    mav.addObject("msg","D");
                }else if(request.getParameter("zt").equals("AD")){
                    utaService.deleteBycpid(request.getParameter("id"));
                    jsbService.deleteById(request.getParameter("id"));
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
            mav.addObject("pageobj", jsbService.selectPageBean(pb));
            mav.addObject("xtflist", xtfService.selectBysjid(null));
            mav.addObject("wzblist", wzbService.serachAll());
            mav.addObject("usflist", usfService.serachAll());
        }
        mav.setViewName("HTcp");
        return mav;
    }


    /**
     * 根据id获取产品
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/serachcp",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String serachcp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer id = Integer.valueOf(request.getParameter("id"));
        HashMap result = new HashMap();yljsb item=jsbService.getByid(id);
        result.put("item",item);
        return JSON.toJSONString(result);
    }
    /**
     * 修改产品
     * 王新苗
     * @param request
     * @param response
     */
    @RequestMapping(value = "/xgcp")
    public ModelAndView xgcp(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        yljsb item = new yljsb();
        item.setJsb002(request.getParameter("t1"));
        item.setJsb003(request.getParameter("t2"));
        item.setJsb004(Integer.valueOf(!request.getParameter("t31").isEmpty()?request.getParameter("t31"):(
                                         !request.getParameter("t32").isEmpty()?request.getParameter("t32"):(
                                          !request.getParameter("t33").isEmpty()?request.getParameter("t33"):null))));
        item.setJsb005(DATE.parse(request.getParameter("t4")));
        item.setJsb006(request.getParameter("t5"));
        item.setJsb007(request.getParameter("t6"));
        item.setJsb008(request.getParameter("t7"));
        if(request.getParameter("id")!=null&&!request.getParameter("id").isEmpty()){
            item.setJsb001(Integer.valueOf((request.getParameter("id"))));
            jsbService.update(item);
            mav.addObject("msg","U");
        }else{
            item.setJsb009(getUse(request).getUse001());
            item.setJsb010(new Date());
            item.setJsb011(0);
            item = jsbService.insert(item);
            mav.addObject("msg","I");
        }
        wzaService.deleteBycpId(item.getJsb001());
        String[] cplist=request.getParameter("t8").split("#");
        for(String s:cplist){
            if(!s.isEmpty()){
                ylwza wza=new ylwza();
                wza.setWza002(item.getJsb001());
                wza.setWza003(Integer.valueOf(s));
                wzaService.insert(wza);
            }
        }

        jbbService.deleteBycpId(item.getJsb001());
        String[] cas=request.getParameterValues("ca");
        String[] t9s=request.getParameterValues("t9");
        for(int i=0;i<cas.length;i++){
            if(!cas[i].isEmpty()&&!t9s[i].isEmpty()){
                yljbb jbb=new yljbb();
                jbb.setJbb002(Integer.valueOf(cas[i]));
                jbb.setJbb003(item.getJsb001());
                jbb.setJbb004(t9s[i]);
                jbbService.insert(jbb);
            }
        }
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> t1 = multipartRequest.getFiles("t11");
        if(t1!=null&&t1.size()>0&&!t1.get(0).getOriginalFilename().isEmpty()){
            List<yljsc> tplist=jscService.seleteBycpId(item.getJsb001());
            for(yljsc jsc:tplist){
                uploadpic(null, null, "upload/pimg/"+jsc.getJsc003());
            }
            jscService.deleteById(item.getJsb001());
            Date date = new Date();
            yljsc jsc = new yljsc();
            int i=0;
            for(MultipartFile show:t1){
                jsc = new yljsc();i++;
                if (show.getOriginalFilename()!=null && !show.getOriginalFilename().isEmpty()) {
                    String filehz=(show.getOriginalFilename().substring(show.getOriginalFilename().lastIndexOf("."))).toLowerCase();
                    String filename = sdf.format(date)+i+filehz;
                    uploadpic("upload/pimg/"+filename, show, null);
                    jsc.setJsc002(item.getJsb001());
                    jsc.setJsc003(filename);
                    jscService.insert(jsc);
                }

            }
        }
        mav.addObject("pages", request.getParameter("pages"));
        mav.addObject("name", request.getParameter("name"));
        mav.setViewName("redirect:/toPr/tocp");
        return mav;
    }

    /**
     * 进入订单页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping(value ="/todd")
    public ModelAndView todd(HttpServletRequest request,HttpServletResponse response) throws Exception{
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
                if(request.getParameter("zt").equals("U")){
                    yluta uta =utaService.getByid(request.getParameter("id"));
                    uta.setUta004(request.getParameter("type"));
                    uta.setUta013(new Date());
                    uta.setUta014(getUse(request).getUse001());
                    utaService.update(uta);
                    mav.addObject("msg","C");
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
            mav.addObject("pageobj", utaService.selectPageBean(pb));
        }
        mav.setViewName("HTdd");
        return mav;
    }

    /**
     * 根据id获取规格
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/serachdd",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String serachdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();yluta item=utaService.getByid(request.getParameter("id"));
        result.put("item",item);
        return JSON.toJSONString(result);
    }
}

package com.efx.sumec.controller;

import com.alibaba.fastjson.JSON;
import com.efx.sumec.model.user;
import com.efx.sumec.model.yluta;
import com.efx.sumec.model.ylxtf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/toApp")
public class AppController extends BaseController {

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private TemplateEngine templateEngine;


    @ResponseBody
    @RequestMapping(value = "/toindex",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String toindex(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        user user = getUser() ;
        result.put("qtuser", user);
        result.put("item", jseService.selGetAll());
//        result.put("gglist", jsdService.serachAll());
        List<ylxtf> fllist=xtfService.selectBysjid(null);
        for(ylxtf xtf:fllist){
            xtf.setJsblist(jsbService.serachAll(xtf.getXtf001(),null,null,null,1, null));
        }
        result.put("fllist", fllist);
//        result.put("cplist", jsbService.serachAll(null,null,null,null,1, null));
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping(value = "/toproducts",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String toproducts(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        user user = getUser() ;
        result.put("qtuser", user);
        Integer yjid=(null!=request.getParameter("yjid")&&!request.getParameter("yjid").isEmpty()?Integer.valueOf(request.getParameter("yjid")):null);
        Integer ejid=(null!=request.getParameter("ejid")&&!request.getParameter("ejid").isEmpty()?Integer.valueOf(request.getParameter("ejid")):null);
        Integer sjid=(null!=request.getParameter("sjid")&&!request.getParameter("sjid").isEmpty()?Integer.valueOf(request.getParameter("sjid")):null);
        Integer bqid=(null!=request.getParameter("bqid")&&!request.getParameter("bqid").isEmpty()?Integer.valueOf(request.getParameter("bqid")):null);
        String name=(null!=request.getParameter("name")&&!request.getParameter("name").isEmpty()?request.getParameter("name"):null);
        result.put("yjid", yjid);
        result.put("ejid", ejid);
        result.put("sjid", sjid);
        result.put("bqid", bqid);
        result.put("cplist", jsbService.serachAll(yjid,ejid,sjid,bqid,yjid==null&&ejid==null&&sjid==null&&bqid==null&&name==null?1:null,name));
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping(value = "/todetail",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String todetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        user user = getUser() ;
        result.put("qtuser", user);
        result.put("item", jsbService.getByid(Integer.valueOf(request.getParameter("id"))));
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping(value = "/toabout",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String toabout(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        user user = getUser() ;
        result.put("qtuser", user);
        result.put("item", jseService.selGetAll());
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping(value = "/tocontact",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String tocontact(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        user user = getUser() ;
        result.put("qtuser", user);
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping(value = "/toorder",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String toorder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        user user = getUser() ;
        result.put("qtuser", user);
        result.put("item", jsbService.getByid(Integer.valueOf(request.getParameter("id"))));
        result.put("msg", request.getParameter("msg"));
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping(value="/xgdd",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String xgdd(HttpServletRequest request,HttpServletResponse response)throws Exception{
        HashMap result = new HashMap();
        user user = getUser() ;
        result.put("qtuser", user);
        
        yluta item=new yluta();
        item.setUta001(UUID.randomUUID().toString().replace("-",""));
        item.setUta002(TIME_ORDER.format(new Date()));
        item.setUta003(Integer.valueOf(request.getParameter("id")));
        item.setUta004("A");
        item.setUta005(request.getParameter("t1"));
        item.setUta006(new Date());
        item.setUta007(request.getParameter("t2"));
        item.setUta008(request.getParameter("t3"));
        item.setUta009(request.getParameter("t4"));
        item.setUta010(request.getParameter("t5"));
        item.setUta011(request.getParameter("t6"));
        item.setUta012(request.getParameter("t7"));
        item.setUta017(request.getParameter("t17"));
        item=utaService.insert(item);
        result.put("id", item.getUta003());
        result.put("msg", "C");
        return JSON.toJSONString(result);
    }
}

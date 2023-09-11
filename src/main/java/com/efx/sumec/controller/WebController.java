package com.efx.sumec.controller;

import com.efx.sumec.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/toWeb")
public class WebController extends BaseController {

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private TemplateEngine templateEngine;


    @RequestMapping("/toindex")
    public ModelAndView toindex(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        user user = getUser() ;
        mav.addObject("qtuser", user);
        if(user.getZt().equals("B")){
            mav.setViewName("405");
            return mav;
        }
        mav.addObject("item", jseService.selGetAll());
        mav.addObject("gglist", jsdService.serachAll());
        mav.addObject("cplist", jsbService.serachAll(null,null,null,null,1, null));
        mav.setViewName("QThome");
        return mav;
    }
    @RequestMapping("/toproducts")
    public ModelAndView toproducts(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        user user = getUser() ;
        mav.addObject("qtuser", user);
        if(user.getZt().equals("B")){
            mav.setViewName("405");
            return mav;
        }
        Integer yjid=(null!=request.getParameter("yjid")&&!request.getParameter("yjid").isEmpty()?Integer.valueOf(request.getParameter("yjid")):null);
        Integer ejid=(null!=request.getParameter("ejid")&&!request.getParameter("ejid").isEmpty()?Integer.valueOf(request.getParameter("ejid")):null);
        Integer sjid=(null!=request.getParameter("sjid")&&!request.getParameter("sjid").isEmpty()?Integer.valueOf(request.getParameter("sjid")):null);
        Integer bqid=(null!=request.getParameter("bqid")&&!request.getParameter("bqid").isEmpty()?Integer.valueOf(request.getParameter("bqid")):null);
        String name=null!=request.getParameter("name")&&!request.getParameter("name").isEmpty()?request.getParameter("name"):null;
        mav.addObject("yjid", yjid);
        mav.addObject("ejid", ejid);
        mav.addObject("sjid", sjid);
        mav.addObject("bqid", bqid);
        mav.addObject("cplist", jsbService.serachAll(yjid,ejid,sjid,bqid,yjid==null&&ejid==null&&sjid==null&&bqid==null&&name==null?1:null,name));
        mav.setViewName("QTproducts");
        return mav;
    }
    @RequestMapping("/todetail")
    public ModelAndView todetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        user user = getUser() ;
        mav.addObject("qtuser", user);
        if(user.getZt().equals("B")){
            mav.setViewName("405");
            return mav;
        }
        mav.addObject("item", jsbService.getByid(Integer.valueOf(request.getParameter("id"))));
        mav.setViewName("QTdetail");
        return mav;
    }
    @RequestMapping("/toabout")
    public ModelAndView toabout(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        user user = getUser() ;
        mav.addObject("qtuser", user);
        if(user.getZt().equals("B")){
            mav.setViewName("405");
            return mav;
        }
        mav.addObject("item", jseService.selGetAll());
        mav.setViewName("QTabout");
        return mav;
    }

    @RequestMapping("/tocontact")
    public ModelAndView tocontact(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        user user = getUser() ;
        mav.addObject("qtuser", user);
        if(user.getZt().equals("B")){
            mav.setViewName("405");
            return mav;
        }
        mav.setViewName("QTcontcat");
        return mav;
    }

    @RequestMapping("/toorder")
    public ModelAndView toorder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        user user = getUser() ;
        mav.addObject("qtuser", user);
        if(user.getZt().equals("B")){
            mav.setViewName("405");
            return mav;
        }
        mav.addObject("item", jsbService.getByid(Integer.valueOf(request.getParameter("id"))));
        mav.addObject("msg", request.getParameter("msg"));
        mav.setViewName("QTorder");
        return mav;
    }

    @RequestMapping(value="/xgdd")
    public ModelAndView xgdd(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        user user = getUser() ;
        mav.addObject("qtuser", user);
        if(user.getZt().equals("B")){
            mav.setViewName("405");
            return mav;
        }
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
        item=utaService.insert(item);
        mav.addObject("id", item.getUta003());
        mav.addObject("msg", "C");
        mav.setViewName("redirect:/toWeb/toorder");
        return mav;
    }
}

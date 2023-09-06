package com.efx.sumec.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Sunweifeng
 * @Date 2023/3/16 11:16
 */
public class user implements Serializable {

    private static final long serialVersionUID=1L;

    private String uname;//用户名称

    private String js;//角色名称

    private String title;//网站标题

    private String keyword;//网站标题
    private String zt;

    private String add;//地址

    private String web;//网站名称

    private String email;//电子邮件

    private String tel;//电话

    private String webjj;//

    public String getWebjj() {
        return webjj;
    }
    public String cpyst;//产品优势图
    public String cpys;//产品优势

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCpyst() {
        return cpyst;
    }

    public void setCpyst(String cpyst) {
        this.cpyst = cpyst;
    }

    public String getCpys() {
        return cpys;
    }

    public void setCpys(String cpys) {
        this.cpys = cpys;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public void setWebjj(String webjj) {
        this.webjj = webjj;
    }

    private List<ylwzb> bqlist;//标签

    private List<ylxtf> fllist;//分类

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<ylwzb> getBqlist() {
        return bqlist;
    }

    public void setBqlist(List<ylwzb> bqlist) {
        this.bqlist = bqlist;
    }

    public List<ylxtf> getFllist() {
        return fllist;
    }

    public void setFllist(List<ylxtf> fllist) {
        this.fllist = fllist;
    }
}

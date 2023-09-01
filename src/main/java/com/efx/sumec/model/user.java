package com.efx.sumec.model;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * @Author Sunweifeng
 * @Date 2023/3/16 11:16
 */
public class user implements Serializable {

    private static final long serialVersionUID=1L;

    private String uname;//用户名称

    private String js;//角色名称

    private String add;//角色类型

    private String web;//机构名称

    private String eamil;//机构类型

    private String tel;//机构类型

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

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

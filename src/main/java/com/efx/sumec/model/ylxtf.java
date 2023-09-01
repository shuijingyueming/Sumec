package com.efx.sumec.model;

import java.util.List;

public class ylxtf {
    private  ylxtf xtf;
    private List<ylxtf> xtflist;

    public ylxtf getXtf() {
        return xtf;
    }

    public void setXtf(ylxtf xtf) {
        this.xtf = xtf;
    }

    public List<ylxtf> getXtflist() {
        return xtflist;
    }

    public void setXtflist(List<ylxtf> xtflist) {
        this.xtflist = xtflist;
    }

    private Integer xtf001;

    private String xtf002;

    private Integer xtf003;

    private String xtf004;

    private Integer xtf005;

    private String xtf006;

    public Integer getXtf001() {
        return xtf001;
    }

    public void setXtf001(Integer xtf001) {
        this.xtf001 = xtf001;
    }

    public String getXtf002() {
        return xtf002;
    }

    public void setXtf002(String xtf002) {
        this.xtf002 = xtf002 == null ? null : xtf002.trim();
    }

    public Integer getXtf003() {
        return xtf003;
    }

    public void setXtf003(Integer xtf003) {
        this.xtf003 = xtf003;
    }

    public String getXtf004() {
        return xtf004;
    }

    public void setXtf004(String xtf004) {
        this.xtf004 = xtf004 == null ? null : xtf004.trim();
    }

    public Integer getXtf005() {
        return xtf005;
    }

    public void setXtf005(Integer xtf005) {
        this.xtf005 = xtf005;
    }

    public String getXtf006() {
        return xtf006;
    }

    public void setXtf006(String xtf006) {
        this.xtf006 = xtf006 == null ? null : xtf006.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", xtf001=").append(xtf001);
        sb.append(", xtf002=").append(xtf002);
        sb.append(", xtf003=").append(xtf003);
        sb.append(", xtf004=").append(xtf004);
        sb.append(", xtf005=").append(xtf005);
        sb.append(", xtf006=").append(xtf006);
        sb.append("]");
        return sb.toString();
    }
}
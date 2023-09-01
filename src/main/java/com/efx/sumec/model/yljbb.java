package com.efx.sumec.model;

public class yljbb {
    private ylusf usf;
    private yljsb jsb;

    public ylusf getUsf() {
        return usf;
    }

    public void setUsf(ylusf usf) {
        this.usf = usf;
    }

    public yljsb getJsb() {
        return jsb;
    }

    public void setJsb(yljsb jsb) {
        this.jsb = jsb;
    }

    private Integer jbb001;

    private Integer jbb002;

    private Integer jbb003;

    private String jbb004;

    private String jbb005;

    public Integer getJbb001() {
        return jbb001;
    }

    public void setJbb001(Integer jbb001) {
        this.jbb001 = jbb001;
    }

    public Integer getJbb002() {
        return jbb002;
    }

    public void setJbb002(Integer jbb002) {
        this.jbb002 = jbb002;
    }

    public Integer getJbb003() {
        return jbb003;
    }

    public void setJbb003(Integer jbb003) {
        this.jbb003 = jbb003;
    }

    public String getJbb004() {
        return jbb004;
    }

    public void setJbb004(String jbb004) {
        this.jbb004 = jbb004 == null ? null : jbb004.trim();
    }

    public String getJbb005() {
        return jbb005;
    }

    public void setJbb005(String jbb005) {
        this.jbb005 = jbb005 == null ? null : jbb005.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jbb001=").append(jbb001);
        sb.append(", jbb002=").append(jbb002);
        sb.append(", jbb003=").append(jbb003);
        sb.append(", jbb004=").append(jbb004);
        sb.append(", jbb005=").append(jbb005);
        sb.append("]");
        return sb.toString();
    }
}
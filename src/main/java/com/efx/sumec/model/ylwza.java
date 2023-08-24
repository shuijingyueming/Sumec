package com.efx.sumec.model;

public class ylwza {
    private Integer wza001;

    private Integer wza002;

    private Integer wza003;

    private Integer wza004;

    private String wza005;

    private String wza006;

    public Integer getWza001() {
        return wza001;
    }

    public void setWza001(Integer wza001) {
        this.wza001 = wza001;
    }

    public Integer getWza002() {
        return wza002;
    }

    public void setWza002(Integer wza002) {
        this.wza002 = wza002;
    }

    public Integer getWza003() {
        return wza003;
    }

    public void setWza003(Integer wza003) {
        this.wza003 = wza003;
    }

    public Integer getWza004() {
        return wza004;
    }

    public void setWza004(Integer wza004) {
        this.wza004 = wza004;
    }

    public String getWza005() {
        return wza005;
    }

    public void setWza005(String wza005) {
        this.wza005 = wza005 == null ? null : wza005.trim();
    }

    public String getWza006() {
        return wza006;
    }

    public void setWza006(String wza006) {
        this.wza006 = wza006 == null ? null : wza006.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wza001=").append(wza001);
        sb.append(", wza002=").append(wza002);
        sb.append(", wza003=").append(wza003);
        sb.append(", wza004=").append(wza004);
        sb.append(", wza005=").append(wza005);
        sb.append(", wza006=").append(wza006);
        sb.append("]");
        return sb.toString();
    }
}
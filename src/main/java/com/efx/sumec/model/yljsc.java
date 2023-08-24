package com.efx.sumec.model;

public class yljsc {
    private Integer jsc001;

    private Integer jsc002;

    private String jsc003;

    private Integer jsc004;

    private String jsc005;

    public Integer getJsc001() {
        return jsc001;
    }

    public void setJsc001(Integer jsc001) {
        this.jsc001 = jsc001;
    }

    public Integer getJsc002() {
        return jsc002;
    }

    public void setJsc002(Integer jsc002) {
        this.jsc002 = jsc002;
    }

    public String getJsc003() {
        return jsc003;
    }

    public void setJsc003(String jsc003) {
        this.jsc003 = jsc003 == null ? null : jsc003.trim();
    }

    public Integer getJsc004() {
        return jsc004;
    }

    public void setJsc004(Integer jsc004) {
        this.jsc004 = jsc004;
    }

    public String getJsc005() {
        return jsc005;
    }

    public void setJsc005(String jsc005) {
        this.jsc005 = jsc005 == null ? null : jsc005.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jsc001=").append(jsc001);
        sb.append(", jsc002=").append(jsc002);
        sb.append(", jsc003=").append(jsc003);
        sb.append(", jsc004=").append(jsc004);
        sb.append(", jsc005=").append(jsc005);
        sb.append("]");
        return sb.toString();
    }
}
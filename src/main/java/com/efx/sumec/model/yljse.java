package com.efx.sumec.model;

import java.util.Date;

public class yljse {
    private Integer jse001;

    private String jse002;

    private String jse003;

    private String jse004;

    private Integer jse005;

    private Date jse006;

    public Integer getJse001() {
        return jse001;
    }

    public void setJse001(Integer jse001) {
        this.jse001 = jse001;
    }

    public String getJse002() {
        return jse002;
    }

    public void setJse002(String jse002) {
        this.jse002 = jse002 == null ? null : jse002.trim();
    }

    public String getJse003() {
        return jse003;
    }

    public void setJse003(String jse003) {
        this.jse003 = jse003 == null ? null : jse003.trim();
    }

    public String getJse004() {
        return jse004;
    }

    public void setJse004(String jse004) {
        this.jse004 = jse004 == null ? null : jse004.trim();
    }

    public Integer getJse005() {
        return jse005;
    }

    public void setJse005(Integer jse005) {
        this.jse005 = jse005;
    }

    public Date getJse006() {
        return jse006;
    }

    public void setJse006(Date jse006) {
        this.jse006 = jse006;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jse001=").append(jse001);
        sb.append(", jse002=").append(jse002);
        sb.append(", jse003=").append(jse003);
        sb.append(", jse004=").append(jse004);
        sb.append(", jse005=").append(jse005);
        sb.append(", jse006=").append(jse006);
        sb.append("]");
        return sb.toString();
    }
}
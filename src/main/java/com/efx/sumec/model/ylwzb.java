package com.efx.sumec.model;

public class ylwzb {
    private Integer wzb001;

    private String wzb002;

    private Integer wzb003;

    private String wzb004;

    private Integer wzb005;

    private String wzb006;

    public Integer getWzb001() {
        return wzb001;
    }

    public void setWzb001(Integer wzb001) {
        this.wzb001 = wzb001;
    }

    public String getWzb002() {
        return wzb002;
    }

    public void setWzb002(String wzb002) {
        this.wzb002 = wzb002 == null ? null : wzb002.trim();
    }

    public Integer getWzb003() {
        return wzb003;
    }

    public void setWzb003(Integer wzb003) {
        this.wzb003 = wzb003;
    }

    public String getWzb004() {
        return wzb004;
    }

    public void setWzb004(String wzb004) {
        this.wzb004 = wzb004 == null ? null : wzb004.trim();
    }

    public Integer getWzb005() {
        return wzb005;
    }

    public void setWzb005(Integer wzb005) {
        this.wzb005 = wzb005;
    }

    public String getWzb006() {
        return wzb006;
    }

    public void setWzb006(String wzb006) {
        this.wzb006 = wzb006 == null ? null : wzb006.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wzb001=").append(wzb001);
        sb.append(", wzb002=").append(wzb002);
        sb.append(", wzb003=").append(wzb003);
        sb.append(", wzb004=").append(wzb004);
        sb.append(", wzb005=").append(wzb005);
        sb.append(", wzb006=").append(wzb006);
        sb.append("]");
        return sb.toString();
    }
}
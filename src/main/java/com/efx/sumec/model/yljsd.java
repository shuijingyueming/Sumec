package com.efx.sumec.model;

public class yljsd {
    private Integer jsd001;

    private String jsd002;

    private String jsd003;

    private Integer jsd004;

    private String jsd005;

    private String jsd006;

    public Integer getJsd001() {
        return jsd001;
    }

    public void setJsd001(Integer jsd001) {
        this.jsd001 = jsd001;
    }

    public String getJsd002() {
        return jsd002;
    }

    public void setJsd002(String jsd002) {
        this.jsd002 = jsd002 == null ? null : jsd002.trim();
    }

    public String getJsd003() {
        return jsd003;
    }

    public void setJsd003(String jsd003) {
        this.jsd003 = jsd003 == null ? null : jsd003.trim();
    }

    public Integer getJsd004() {
        return jsd004;
    }

    public void setJsd004(Integer jsd004) {
        this.jsd004 = jsd004;
    }

    public String getJsd005() {
        return jsd005;
    }

    public void setJsd005(String jsd005) {
        this.jsd005 = jsd005 == null ? null : jsd005.trim();
    }

    public String getJsd006() {
        return jsd006;
    }

    public void setJsd006(String jsd006) {
        this.jsd006 = jsd006 == null ? null : jsd006.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jsd001=").append(jsd001);
        sb.append(", jsd002=").append(jsd002);
        sb.append(", jsd003=").append(jsd003);
        sb.append(", jsd004=").append(jsd004);
        sb.append(", jsd005=").append(jsd005);
        sb.append(", jsd006=").append(jsd006);
        sb.append("]");
        return sb.toString();
    }
}
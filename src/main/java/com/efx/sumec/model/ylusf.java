package com.efx.sumec.model;

public class ylusf {
    private Integer usf001;

    private String usf002;

    public Integer getUsf001() {
        return usf001;
    }

    public void setUsf001(Integer usf001) {
        this.usf001 = usf001;
    }

    public String getUsf002() {
        return usf002;
    }

    public void setUsf002(String usf002) {
        this.usf002 = usf002 == null ? null : usf002.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usf001=").append(usf001);
        sb.append(", usf002=").append(usf002);
        sb.append("]");
        return sb.toString();
    }
}
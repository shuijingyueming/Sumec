package com.efx.sumec.model;

import java.util.HashMap;
import java.util.Map;

public class PubMessage {
    public static Map dlmap = new HashMap();


    public static String serverUrl = "http://pvmall.com.cn";


    private static ylxxz xxz;

    public static ylxxz getXxz() {
        return xxz;
    }

    public static void setXxz(ylxxz xxz) {
        PubMessage.xxz = xxz;
    }


}

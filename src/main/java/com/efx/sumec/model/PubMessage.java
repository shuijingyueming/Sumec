package com.efx.sumec.model;

import java.util.HashMap;
import java.util.Map;

public class PubMessage {
    public static Map dlmap = new HashMap();
    public static String serverUrl = "https://xhh.nbefx.com";
//    小程序
    public static String appid = "wx7070e33478430053";
    public static String secret = "b8619427a12602ad66e19dbfbfe049cf";

    public static String access_token = "";
    public static String refresh_token = "";

    public static String access_tokenxx = "";


    public static String getAccess_token() {
        return access_token;
    }

    public static void setAccess_token(String access_token) {
        PubMessage.access_token = access_token;
    }

    public static String getRefresh_token() {
        return refresh_token;
    }

    public static void setRefresh_token(String refresh_token) {
        PubMessage.refresh_token = refresh_token;
    }


}
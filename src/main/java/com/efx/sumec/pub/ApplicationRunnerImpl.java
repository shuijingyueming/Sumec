package com.efx.sumec.pub;


import com.efx.sumec.model.PubMessage;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    private final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmssSSS");


    protected final static SimpleDateFormat DATE1 = new SimpleDateFormat("yyyy-MM");
    // protected final static SimpleDateFormat DATE2 = new SimpleDateFormat("yyyy-MM");
    @Autowired
    properConfig config;

    //tomcat启动执行此方法
    @Override
    public void run(ApplicationArguments args) throws Exception {



    }

}

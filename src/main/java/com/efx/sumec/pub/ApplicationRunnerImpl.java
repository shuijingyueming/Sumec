package com.efx.sumec.pub;


import com.efx.sumec.model.PubMessage;
import com.efx.sumec.model.ylxxz;
import com.efx.sumec.service.YlxxzService;
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
    @Autowired
    private YlxxzService xxzService;

    protected final static SimpleDateFormat DATE1 = new SimpleDateFormat("yyyy-MM");
    // protected final static SimpleDateFormat DATE2 = new SimpleDateFormat("yyyy-MM");
    @Autowired
    properConfig config;

    //tomcat启动执行此方法
    @Override
    public void run(ApplicationArguments args) throws Exception {
            ylxxz xxz = xxzService.selGetAll();
            //数据备份
            new Thread(){
                public void run(){
                    this.setName("beifen");
                    while (true) {
                        try {
                            long current = System.currentTimeMillis();// 当前时间毫秒数
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(Calendar.DAY_OF_MONTH, 1);
                            calendar.set(Calendar.HOUR_OF_DAY, 0);
                            calendar.set(Calendar.MINUTE, 0);
                            calendar.set(Calendar.SECOND, 0);
                            calendar.set(Calendar.MILLISECOND, 0);
                            long tomorrowzero = calendar.getTimeInMillis();
                            long tomorrowzeroSeconds = (tomorrowzero- current);
                            //按天算+早上2：00,睡眠毫秒数
                            Thread.sleep(((xxz.getXxz004()-1)*86400000)+tomorrowzeroSeconds);
                            if (Datamsg.exportDatabaseTool(config.getJdbcurl(), config.getJdbcdk(),
                                    config.getUsername(),config.getPassword(),
                                    "c:\\backup\\","smd("+sdf1.format(new Date())+").sql",config.getDataname(),
                                    this.getClass().getResource("/").getPath()+"\\")) {
                                System.out.println("数据库成功备份！！！");
                            } else {
                                System.out.println("数据库备份失败！！！");
                            }
                        } catch (InterruptedException e) { }
                    }
                }
            }.start();
    }

}

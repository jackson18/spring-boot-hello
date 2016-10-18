package com.qijiabin.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午10:51:13
 * 版 本：1.0.0
 * 类说明：定时任务
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
   
    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }
    
}

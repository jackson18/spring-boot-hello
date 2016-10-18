package com.qijiabin;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ========================================================
 * 日 期：2016年10月18日 下午1:41:48
 * 版 本：1.0.0
 * 类说明：服务启动执行
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Component
@Order(value=1)
public class MyStartupRunner2 implements CommandLineRunner {
 
    @Override
    public void run(String... args) throws Exception {
    	System.out.println(Arrays.asList(args));
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 22222222 <<<<<<<<<<<<<");
    }
 
}

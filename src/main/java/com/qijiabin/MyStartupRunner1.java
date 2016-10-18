package com.qijiabin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ========================================================
 * 日 期：2016年10月18日 下午1:39:30
 * 版 本：1.0.0
 * 类说明：服务启动执行
 * 在项目服务启动的时候就去加载一些数据或做一些事情这样的需求。 为了解决这样的问题，Spring Boot 为我们提供了一个方法，通过实现接口 CommandLineRunner 来实现。
 * 用@Order注解（或者实现Order接口）来规定所有CommandLineRunner实例的运行顺序。
 * ========================================================
 * 修订日期     修订人    描述
 */
@Component
@Order(value=2)
public class MyStartupRunner1 implements CommandLineRunner {
 
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 11111111<<<<<<<<<<<<<");
    }
 
}

package com.qijiabin.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * ========================================================
 * 日 期：2016年10月18日 下午12:13:39
 * 版 本：1.0.0
 * 类说明：使用@WebListener注解，实现ServletContextListener接口
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContex销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContex初始化");
	}
	
}

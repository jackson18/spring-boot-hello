package com.qijiabin.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * ========================================================
 * 日 期：2016年10月18日 下午12:14:37
 * 版 本：1.0.0
 * 类说明：监听Session的创建与销毁
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
 
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session 被创建");
    }
 
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("ServletContex初始化");
    }
 
}

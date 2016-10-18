package com.qijiabin.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午9:29:50
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public void defaultErrorHandler(HttpServletRequest req, Exception e) {

		// 打印异常信息：
		e.printStackTrace();
		System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");

		/*
		 * 返回json数据或者String数据： 那么需要在方法上加上注解：@ResponseBody 添加return即可。
		 */

		/*
		 * 返回视图： 定义一个ModelAndView即可， 然后return;
		 * 定义视图文件(比如：error.html,error.ftl,error.jsp);
		 *
		 */
	}

}

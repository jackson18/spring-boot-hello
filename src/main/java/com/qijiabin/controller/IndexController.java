package com.qijiabin.controller;

import java.util.Date;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qijiabin.entity.User;

/**
 * ========================================================
 * 日 期：2016年10月17日 下午2:13:13
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {
	
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);
	
	@Value(value = "${hello.secret}")
	private String secret;
	
	@Value(value = "${hello.number}")
	private int id;
	
	@Value(value = "${hello.desc}")
	private String desc;

	@RequestMapping
	public String index() {
		return "hello world";
	}

	// @RequestParam 简单类型的绑定，可以出来get和post
	@RequestMapping(value = "/get")
	public HashMap<String, Object> get(@RequestParam String name) {
		log.info("调用IndexController.get()方法。。。");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "hello world");
		map.put("name", name);
		map.put("secret", secret);
		map.put("id", id);
		map.put("desc", desc);
		return map;
	}

	// @PathVariable 获得请求url中的动态参数
	@RequestMapping(value = "/get/{id}/{name}")
	public User getUser(@PathVariable int id, @PathVariable String name) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setDate(new Date());
		return user;
	}

}


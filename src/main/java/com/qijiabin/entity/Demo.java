package com.qijiabin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午10:12:14
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Entity //加入这个注解，Demo就会进行持久化了，在这里没有对@Table进行配置，请自行配置。
public class Demo {

	@Id
	@GeneratedValue
	private long id;// 主键.
	private String name;// 测试名称.

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package com.qijiabin.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qijiabin.dao.DemoDao;
import com.qijiabin.dao.DemoRepository;
import com.qijiabin.entity.Demo;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午10:31:46
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Service
public class Demo2Service {

	@Resource
	private DemoRepository demoRepository;

	@Resource
	private DemoDao demoDao;

	public void save(Demo demo) {
		demoRepository.save(demo);
	}

	public Demo getById(long id) {
		// demoRepository.findOne(id);
		// 在demoRepository可以直接使用findOne进行获取.
		return demoDao.getById(id);
	}

}

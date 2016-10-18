package com.qijiabin.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.qijiabin.dao.DemoRepository;
import com.qijiabin.entity.Demo;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午10:16:42
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Service
public class DemoService {

	@Resource
	private DemoRepository demoRepository;

	@Transactional
	public void save(Demo demo) {
		demoRepository.save(demo);
	}
	
}

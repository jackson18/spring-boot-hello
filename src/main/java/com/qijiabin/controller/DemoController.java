package com.qijiabin.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qijiabin.entity.Demo;
import com.qijiabin.service.DemoService;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午10:18:00
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	
    @Resource
    private DemoService demoService;
   
    /**
     * 测试保存数据方法.
     * @return
     */
    @RequestMapping("/save")
    public String save(){
       Demo d = new Demo();
       d.setName("Angel");
       demoService.save(d);//保存数据.
       return"ok.Demo2Controller.save";
    }
   
}

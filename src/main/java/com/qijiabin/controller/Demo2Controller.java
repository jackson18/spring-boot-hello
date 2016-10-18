package com.qijiabin.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qijiabin.entity.Demo;
import com.qijiabin.service.Demo2Service;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午10:34:39
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
	
    @Resource
    private Demo2Service demo2Service;
   
    /**
     * 测试保存数据方法.
     * @return
     */
    @RequestMapping("/save")
    public String save(){
       Demo d = new Demo();
       d.setName("Angel");
       demo2Service.save(d);//保存数据.
       return"ok.Demo2Controller.save";
    }
   
    //地址：http://127.0.0.1:8080/demo2/getById?id=1
    @RequestMapping("/getById")
    public Demo getById(long id){
       return demo2Service.getById(id);
    }
   
}


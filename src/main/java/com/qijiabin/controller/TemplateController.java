package com.qijiabin.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午11:12:51
 * 版 本：1.0.0
 * 类说明：模板测试
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Controller
@RequestMapping("/template")
public class TemplateController {
   
    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
       map.put("hello","from TemplateController.helloHtml");
       return"/hello";
    }
    
    /**
     * 返回ftl模板.
     */
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
       map.put("hello","from TemplateController.helloFtl");
       return"/helloFtl";
    }
   
}

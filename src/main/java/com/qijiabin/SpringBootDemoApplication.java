package com.qijiabin;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * ========================================================
 * 日 期：2016年10月17日 下午2:13:26
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
// 其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
@SpringBootApplication
// 这个就是扫描相应的Servlet包
@ServletComponentScan
public class SpringBootDemoApplication {
	
	/**
	 * 文件上传设置
	 * @return
	 */
	@Bean 
    public MultipartConfigElement multipartConfigElement() { 
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
        factory.setMaxFileSize("128KB"); //KB,MB
        // 设置总上传数据总大小
        factory.setMaxRequestSize("256KB"); 
        // factory.setLocation("路径地址");
        return factory.createMultipartConfig(); 
    } 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, new String[]{"hello","林峰"});
	}
	
}

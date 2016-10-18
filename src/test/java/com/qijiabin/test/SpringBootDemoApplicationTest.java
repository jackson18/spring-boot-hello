package com.qijiabin.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.qijiabin.controller.IndexController;

/**
 * ========================================================
 * 日 期：2016年10月17日 下午4:47:07
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
// SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTest {
	
	private MockMvc mvc;

	@Before
	public void setup() {
		this.mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
	}

	@Test
	public void contextLoads() throws Exception {
		RequestBuilder request = get("/index");
		mvc.perform(request).andExpect(status().isOk()).andExpect(content().string("hello world"));
	}

}

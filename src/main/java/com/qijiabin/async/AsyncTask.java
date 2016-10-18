package com.qijiabin.async;

import java.util.Random;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * ========================================================
 * 日 期：2016年10月18日 下午2:53:36
 * 版 本：1.0.0
 * 类说明：异步任务
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Component
public class AsyncTask {
	
	// 定义一个随机对象.
	public static Random random = new Random();

	// 任务一;
	@Async
	public void doTaskOne() throws Exception {
		System.out.println("开始做任务一");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
	}

	// 任务二;
	@Async
	public void doTaskTwo() throws Exception {
		System.out.println("开始做任务二");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
	}

	// 任务3;
	@Async
	public void doTaskThree() throws Exception {
		System.out.println("开始做任务三");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
	}

}


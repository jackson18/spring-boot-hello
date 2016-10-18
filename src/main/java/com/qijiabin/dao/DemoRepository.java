package com.qijiabin.dao;

import org.springframework.data.repository.CrudRepository;

import com.qijiabin.entity.Demo;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午10:13:51
 * 版 本：1.0.0
 * 类说明：在CrudRepository自带常用的crud方法.
 * 这样一个基本dao就写完了.
 * Spring Data的核心接口里面Repository是最基本的接口了, spring提供了很多实现了该接口的基本接口,
 * 如:CrudRepository，PagingAndSortingRepository，SimpleJpaRepository，QueryDslJpaRepository等大量查询接口.
 * ========================================================
 * 修订日期     修订人    描述
 */
public interface DemoRepository extends CrudRepository<Demo, Long>{
 
}

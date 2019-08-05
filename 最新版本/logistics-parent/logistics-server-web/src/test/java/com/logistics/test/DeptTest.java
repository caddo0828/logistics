package com.logistics.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.logistics.mapper.DeptMapper;
import com.logistics.pojo.Dept;
import com.logistics.service.DeptService;
import com.logistics.service.impl.DeptServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DeptTest {
	@Autowired
	private DeptService deptServiceImpl;
	
	@Test
	public void findOne() {
		Dept dept = deptServiceImpl.findById("null");
		
		
		
	}
}

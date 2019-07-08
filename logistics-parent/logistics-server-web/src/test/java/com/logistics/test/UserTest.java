package com.logistics.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.logistics.pojo.UserChild;
import com.logistics.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
	@Autowired
	private UserService userService;
	
	
	@Test
	public void selById() {
		UserChild child = userService.selById("9fe270f8-f682-4126-92aa-604d945c95f1");
		System.out.println(child.getName());
		System.out.println(child.getUserName());
	}
		
}

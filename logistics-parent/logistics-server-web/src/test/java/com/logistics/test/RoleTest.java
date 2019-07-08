package com.logistics.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.logistics.mapper.RoleUserMapper;
import com.logistics.pojo.Role;
import com.logistics.pojo.RoleUserExample;
import com.logistics.pojo.RoleUserKey;
import com.logistics.service.RoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RoleTest {
	@Autowired
	private RoleService roleService;
	@Autowired
	private RoleUserMapper roleUserMapper;
	
	
	@Test
	public void deleteTest() {
		/*Role role = roleService.findById("cf0015d3-bcdd-433b-889d-808b53b72640");
		RoleUserExample example = new RoleUserExample();
		example.createCriteria().andRoleIdEqualTo(role.getRoleId());
		int index = roleUserMapper.deleteByExample(example);
		System.out.println("index="+index);*/
	}
}

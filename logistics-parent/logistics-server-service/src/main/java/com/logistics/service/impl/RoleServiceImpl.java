package com.logistics.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.mapper.RoleMapper;
import com.logistics.mapper.RoleModuleMapper;
import com.logistics.mapper.RoleUserMapper;
import com.logistics.pojo.Role;
import com.logistics.pojo.RoleExample;
import com.logistics.pojo.RoleModule;
import com.logistics.pojo.RoleModuleExample;
import com.logistics.pojo.RoleUserExample;
import com.logistics.pojo.RoleUserKey;
import com.logistics.service.RoleService;
import com.logistics.utils.PageUtil;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private RoleUserMapper roleUserMapper;
	@Autowired
	private RoleModuleMapper roleModuleMapper;
	
	
	@Override
	public PageUtil<Role> findAll(int pageNo) {
		PageUtil<Role> pageUtil = new PageUtil<>();
		//设置分页条件
		PageHelper.startPage(pageNo, pageUtil.getPageSize());
		
		//默认查询全部,按照排序编号降序排序
		RoleExample example = new RoleExample();
		example.setOrderByClause("order_no desc");
		List<Role> list = roleMapper.selectByExample(example );
		//合并查询条件
		PageInfo<Role> info = new PageInfo<>(list);
		
		pageUtil.setResults(info.getList());
		pageUtil.setTotalPage(info.getPages());
		pageUtil.setTotalRecord(info.getTotal());
		pageUtil.setUrl("roleAction_list");
		return pageUtil;
	}

	@Override
	public Role findById(String id) {
		return roleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Role role) throws Exception {
		//修改原对象中值不为空的数据
		Date date = new Date();
		role.setUpdateTime(date);
		
		int index = roleMapper.updateByPrimaryKeySelective(role);
		if(index>0) {
			return 1;
		}else {
			throw new Exception("修改数据失败");
		}
	}

	@Override
	public int delete(List<String> list) throws Exception {
		int num = list.size(); //初始的数据库查询出的要删除的记录总数
		int index = 0; //真正删除的记录总数
		//遍历角色id集合
		for (String id : list) {
			index += roleMapper.deleteByPrimaryKey(id);
			//根据当前的角色查询角色_用户表,获取list集合,判断list的个数，再进行批量example删除
			RoleUserExample example = new RoleUserExample();
			example.createCriteria().andRoleIdEqualTo(id);
			List<RoleUserKey> roleUserList = roleUserMapper.selectByExample(example);
			if(roleUserList!=null&&roleUserList.size()>0) {
				num += roleUserList.size();
				//批量删除角色_用户表数据
				index += roleUserMapper.deleteByExample(example);
			}
			//查询角色_模块下的所有数据，获取list集合，判断集合长度，根据example进行批量删除
			RoleModuleExample roleModuleExample = new RoleModuleExample();
			roleModuleExample.createCriteria().andRoleIdEqualTo(id);
			List<RoleModule> roleModuleList = roleModuleMapper.selectByExample(roleModuleExample );
			if(roleModuleList!=null&&roleModuleList.size()>0) {
				num += roleModuleList.size();
				//批量删除角色_模块表数据
				index += roleModuleMapper.deleteByExample(roleModuleExample);
			}
		}
		
		//判断真正删除的记录数与数据库原始总记录数是否相等; 相等: 删除成功 ， 不等： 有数据删除失败
		if(index==num) {
			return 1;
		}else {
			throw new Exception("删除数据失败");
		}
	}

	
	@Override
	public int insert(Role role) throws Exception {
		Date date = new Date();
		role.setRoleId(UUID.randomUUID().toString());
		role.setCreateTime(date);
		role.setUpdateTime(date);
		
		int index = roleMapper.insertSelective(role);
		if(index>0) {
			return 1;
		}else {
			throw new Exception("数据新增失败");
		}
	}

}

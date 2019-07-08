package com.logistics.service;

import java.util.List;

import com.logistics.pojo.Role;
import com.logistics.utils.PageUtil;

public interface RoleService {
	/**
	 * 分页查询角色列表
	 * @param pageNo
	 * @return
	 */
	PageUtil<Role> findAll(int pageNo);
	
	/**
	 * 根据id查询单个角色
	 * @param id
	 * @return
	 */
	Role findById(String id);
	
	/**
	 * 更新角色信息
	 * @param role
	 * @return
	 */
	int update(Role role)throws Exception;
	
	/**
	 * 批量删除角色（同时删除角色表、角色_用户表、角色_模块表）
	 * @param list
	 * @return
	 */
	int delete(List<String> list)throws Exception;
	
	/**
	 * 新增角色
	 * @param role
	 * @return
	 */
	int insert(Role role)throws Exception;
	
}

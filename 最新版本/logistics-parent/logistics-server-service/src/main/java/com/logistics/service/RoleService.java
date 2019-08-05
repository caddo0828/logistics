package com.logistics.service;

import java.util.List;

import com.logistics.pojo.Role;
import com.logistics.pojo.RoleModule;
import com.logistics.utils.PageUtil;

public interface RoleService {
	/**
	 * 分页查询角色列表
	 * @param pageNo
	 * @return
	 */
	PageUtil<Role> findAll(int pageNo);

	/**
	 * 默认查询所有角色列表
	 * @return
	 */
	List<Role> findAll();
	
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
	
	/**
	 * 根据角色id,查询角色对应的模块集合
	 * @param roleId
	 * @return
	 */
	List<RoleModule> findRoleModuleList(String roleId);
	
	/**
	 * 修改指定角色下对应的模块
	 * @param moduleIds
	 * @return
	 */
	int updateRoleModule(String moduleIds,String roleId)throws Exception;
	
}

package com.logistics.service;

import java.util.List;

import com.logistics.pojo.Module;
import com.logistics.utils.PageUtil;

public interface ModuleService {
	/**
	 * 分页查询模块列表
	 * @param pageNo
	 * @return
	 */
	PageUtil<Module> findAll(int pageNo);
	
	/**
	 * 默认查询全部模块信息
	 * @return
	 */
	List<Module> findAll();
	
	/**
	 * 根据id查询模块对象
	 * @param id
	 * @return
	 */
	Module findById(String id);
	
	/**
	 * 修改模块信息
	 * @param module
	 * @return
	 */
	int update(Module module)throws Exception ;
	
	/**
	 * 批量删除模块数据
	 * @param list
	 * @return
	 */
	int delete(List<String> list)throws Exception;
	
	/**
	 * 根据模块名查询是否存在对应模块数据
	 * @param name
	 * @return
	 */
	Module findByName(String name);
	
	/**
	 * 新增模块
	 * @param module
	 * @return
	 */
	int insert(Module module)throws Exception;
} 

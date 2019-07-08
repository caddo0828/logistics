package com.logistics.service;

import java.util.List;

import com.logistics.pojo.Dept;
import com.logistics.pojo.DeptChild;
import com.logistics.utils.PageUtil;

public interface DeptService {
	/**
	 * 分页显示部门信息
	 * @param pageNo
	 * @return
	 */
	PageUtil<DeptChild> findAll(int pageNo);
	
	/**
	 * 无条件查询出所有的部门列表
	 * @return
	 */
	List<Dept> findAll();
	
	/**
	 * 根据id查询部门对象
	 * @param id
	 * @return
	 */
	Dept findById(String id);
	
	/**
	 * 根据id查询部门信息（并且查询出对应的父部门的名称）
	 * @param id
	 * @return
	 */
	DeptChild selById(String id);
	
	/**
	 * 新增部门
	 * @param dept
	 * @return
	 */
	int insDept(Dept dept)throws Exception ;
	
	/**
	 * 修改部门信息
	 * @param dept
	 * @return
	 */
	int updDept(Dept dept)throws Exception;
	
	/**
	 * 批量删除部门信息
	 * @param ids
	 * @return
	 */
	int delDepts(List<String> ids)throws Exception;
}

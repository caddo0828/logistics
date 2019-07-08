package com.logistics.service;

import java.util.List;

import com.logistics.pojo.User;
import com.logistics.pojo.UserChild;
import com.logistics.pojo.UserInfo;
import com.logistics.utils.PageUtil;

public interface UserService {
	/**
	 * 分页显示用户列表
	 * @param pageNo
	 * @return
	 */
	PageUtil<Object> findAll(int pageNo);
	
	/**
	 * 默认查询用户列表（并且查询出对应的用户真实姓名）
	 * @return
	 */
	List<UserChild> findAll();
	
	/**
	 * 根据用户id,查询单个用户对象（单表操作）
	 * @param userId
	 * @return
	 */
	User findOne(String userId);
	
	/**
	 * 根据id查询用户（并且查询出用户真实姓名）
	 * @param userInfoId
	 * @return
	 */
	UserChild selById(String userInfoId);
	
	/**
	 * 修改用户信息（user表、userInfo表）
	 * @param user
	 * @param info
	 * @return
	 */
	int update(User user,UserInfo info) throws Exception ;
	
	/**
	 * 用户批量删除
	 * @param list
	 * @return
	 */
	int delete(List<String> list)throws Exception;
	
	/**
	 * 新增用户，用户详细信息
	 * @param user
	 * @param info
	 * @return
	 */
	int insert(User user,UserInfo info)throws Exception;
}

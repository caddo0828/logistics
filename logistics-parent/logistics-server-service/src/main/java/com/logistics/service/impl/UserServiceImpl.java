package com.logistics.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.mapper.UserInfoMapper;
import com.logistics.mapper.UserMapper;
import com.logistics.pojo.User;
import com.logistics.pojo.UserChild;
import com.logistics.pojo.UserExample;
import com.logistics.pojo.UserInfo;
import com.logistics.service.UserService;
import com.logistics.utils.PageUtil;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public PageUtil<Object> findAll(int pageNo) {
		PageUtil<Object> pageUtil = new PageUtil<>();
		//设置分页条件
		PageHelper.startPage(pageNo, pageUtil.getPageSize());
		
		//查询启用状态下的用户
		UserExample example = new UserExample();
		example.createCriteria().andStateEqualTo(1);
		List<User> list = userMapper.selectByExample(example);
		
		//分页处理
		PageInfo<User> info = new PageInfo<>(list);
		
		//分装分页后数据（即包含了用户对象，也包含了用户信息对象）
		ArrayList<Object> arr = new ArrayList<>();
		
		List<User> userList = info.getList();
		if(userList!=null&&userList.size()>0) {
			for (User user : userList) {
				UserChild child = selById(user.getUserId());
				arr.add(child);
			}
		}
		pageUtil.setResults(arr);
		pageUtil.setTotalPage(info.getPages());
		pageUtil.setTotalRecord(info.getTotal());
		pageUtil.setUrl("userAction_list");
		return pageUtil;
	}

	@Override
	public User findOne(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	
	@Override
	public UserChild selById(String userInfoId) {
		User user = findOne(userInfoId); //从用户表中查询出用户信息数据
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(user.getUserId()); //从userInfo表中查询用户具体信息
		
		UserChild child = new UserChild();
		if(userInfo==null) {
			child.setName("");
		}else {
			child.setName(userInfo.getName());
		}
		child.setUserId(user.getUserId());
		child.setDeptId(user.getDeptId());
		child.setUserName(user.getUserName());
		child.setState(user.getState());
		child.setCreateTime(user.getCreateTime());
		return child;
	}

	
	@Override
	public int update(User user, UserInfo info) throws Exception {
		Date date = new Date();
		
		user.setUpdateTime(date);
		info.setUserInfoId(user.getUserId());
		info.setUpdateTime(date);
		
		int index = userMapper.updateByPrimaryKeySelective(user);
		index += userInfoMapper.updateByPrimaryKeySelective(info);
		if(index==2) {
			return 1;
		}else {
			throw new Exception("修改用户数据失败,数据回滚");
		}
	}

	@Override
	public int delete(List<String> list) throws Exception {
		int index = 0;
		if(list!=null&&list.size()>0) {
			for (String id : list) {
				//删除用户的同时，删除用户详细信息数据
				index += userMapper.deleteByPrimaryKey(id);
				index += userInfoMapper.deleteByPrimaryKey(id);
			}
		}
		
		if(index==list.size()*2) {
			return 1;
		}else {
			throw new Exception("删除用户信息失败,数据回滚");
		}
	}

	@Override
	public List<UserChild> findAll() {
		UserExample example = new UserExample();
		example.createCriteria().andStateEqualTo(1);
		List<User> list = userMapper.selectByExample(example);
		
		ArrayList<UserChild> arrayList = new ArrayList<>();
		if(list!=null&&list.size()>0) {
			for (User user : list) {
				UserChild child = selById(user.getUserId());
				arrayList.add(child);
			}
		}
		return arrayList;
	}

	@Override
	public int insert(User user, UserInfo info) throws Exception {
		String id = UUID.randomUUID().toString();
		Date date = new Date();
		
		user.setUserId(id);
		user.setCreateTime(date);
		user.setUpdateTime(date);
		
		info.setUserInfoId(id);
		info.setCreateTime(date);
		info.setUpdateTime(date);
		
		int index = userMapper.insertSelective(user);
		index += userInfoMapper.insertSelective(info);
		
		if(index==2) {
			return 1;
		}else {
			throw new Exception("用户新增失败");
		}
	}


}

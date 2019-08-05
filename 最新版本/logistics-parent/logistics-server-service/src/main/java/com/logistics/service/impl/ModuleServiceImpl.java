package com.logistics.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.mapper.ModuleMapper;
import com.logistics.pojo.Module;
import com.logistics.pojo.ModuleExample;
import com.logistics.service.ModuleService;
import com.logistics.utils.PageUtil;

@Service
public class ModuleServiceImpl implements ModuleService{
	@Autowired
	private ModuleMapper moduleMapper;
	
	@Override
	public PageUtil<Module> findAll(int pageNo) {
		PageUtil<Module> pageUtil = new PageUtil<>();
		PageHelper.startPage(pageNo, pageUtil.getPageSize());
		ModuleExample example = new ModuleExample();
		example.createCriteria().andStateEqualTo(1);
		List<Module> list = moduleMapper.selectByExample(example);
		PageInfo<Module> info = new PageInfo<>(list);
		
		//分装分页数据
		pageUtil.setResults(info.getList());
		pageUtil.setTotalRecord(info.getTotal());
		pageUtil.setTotalPage(info.getPages());
		pageUtil.setPageNo(pageNo);
		pageUtil.setUrl("moduleAction_list");
		
		return pageUtil;
	}

	@Override
	public Module findById(String id) {
		return moduleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Module module) throws Exception {
		Date date = new Date();
		module.setUpdateTime(date);
		int index = moduleMapper.updateByPrimaryKeySelective(module);
		if(index>0) {
			return 1;
		}else {
			throw new Exception("修改模块数据失败");
		}
	}

	@Override
	public int delete(List<String> list) throws Exception {
		int index = 0;
		if(list!=null&&list.size()>0) {
			for (String id : list) {
				index += moduleMapper.deleteByPrimaryKey(id);
			}
		}
		
		if(index==list.size()) {
			return 1;
		}else {
			throw new Exception("删除模块数据失败");
		}
	}

	@Override
	public List<Module> findAll() {
		ModuleExample example = new ModuleExample();
		example.createCriteria().andStateEqualTo(1);
		return moduleMapper.selectByExample(example);
	}

	@Override
	public Module findByName(String name) {
		ModuleExample example = new ModuleExample();
		example.createCriteria().andNameEqualTo(name);
		List<Module> list = moduleMapper.selectByExample(example);
		if(list!=null&&list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public int insert(Module module) throws Exception {
		//判断是否选择了父模块,根据父模块名称查找对应的模块名
		if(module.getParentId()!=null&&!module.getParentId().equals("")) {
			//根据module的id查询对应的模块名，作为父模块信息存储
		   Module module2 = findById(module.getParentId());
		   module.setParentId(module2.getModuleId());
		   module.setParentName(module2.getParentName());
		}
		Date date = new Date();
		module.setModuleId(UUID.randomUUID().toString());
		module.setCreateTime(date);
		module.setUpdateTime(date);
		int index = moduleMapper.insertSelective(module);
		if(index>0) {
			return 1;
		}else {
			throw new Exception("新增失败");
		}
	}
}

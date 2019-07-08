package com.logistics.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.mapper.DeptMapper;
import com.logistics.pojo.Dept;
import com.logistics.pojo.DeptChild;
import com.logistics.pojo.DeptExample;
import com.logistics.service.DeptService;
import com.logistics.utils.PageUtil;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public PageUtil<DeptChild> findAll(int pageNo) {
		PageUtil<DeptChild> pageUtil = new PageUtil<>();
		//设置分页条件
		PageHelper.startPage(pageNo, pageUtil.getPageSize());
		
		//查询所有部门中为启用状态的部门信息
		DeptExample example = new DeptExample();
		example.createCriteria().andStateEqualTo(1);
		List<Dept> list = deptMapper.selectByExample(example);
		
		//综合分页数据
		PageInfo<Dept> info = new PageInfo<>(list);
		
		ArrayList<DeptChild> childs = new ArrayList<>();
		//获取分页后的全部数据
		List<Dept> resultList = info.getList();
		//遍历集合，获取每个父部门id,根据父部门id查询对应的部门对象，获取部门对象的名称
		if(resultList!=null&&resultList.size()>0) {
			for (Dept dept : resultList) {
				DeptChild child = selById(dept.getDeptId());
				childs.add(child);
			}
		}
		
		//封装分页后的数据
		pageUtil.setResults(childs);
		pageUtil.setTotalPage(info.getPages());
		pageUtil.setTotalRecord(info.getTotal());
		
		//用于在上一页下一页跳转时判断需要进行跳转的路径
		pageUtil.setUrl("deptAction_list"); 
		return pageUtil;
	}

	@Override
	public Dept findById(String id) {
		return deptMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Dept> findAll() {
		//查询所有部门信息，遍历输出对应的数据, 部门状态为1的才能被使用
		DeptExample example = new DeptExample();
		example.createCriteria().andStateEqualTo(1);
		return deptMapper.selectByExample(example);
	}

	@Override
	public int insDept(Dept dept) throws Exception {
		//新增部门默认状态为1
		dept.setState(1);
		dept.setDeptId(UUID.randomUUID().toString());
		int index = deptMapper.insertSelective(dept);
		if(index>0) {
			return 1; //新增成功
		}else {
			throw new Exception("新增数据失败");
		}
	}

	@Override
	public DeptChild selById(String id) {
		Dept dept = deptMapper.selectByPrimaryKey(id);
		DeptChild child = new DeptChild();
		child.setDeptId(dept.getDeptId());
		child.setDeptName(dept.getDeptName());
		child.setParentId(dept.getParentId());
		child.setState(dept.getState());
		child.setParentName(dept.getParentId()==null||dept.getParentId()=="null" ? "" : findById(dept.getParentId())==null ? "" : findById(dept.getParentId()).getDeptName());
		return child;
	}
	
	@Override
	public int updDept(Dept dept) throws Exception {
		int index = deptMapper.updateByPrimaryKeySelective(dept);
		if(index>0) {
			return 1;
		}else {
			throw new Exception("修改部门信息失败");
		}
	}

	
	@Override
	public int delDepts(List<String> ids) throws Exception{
		int index = 0;
		for (String id : ids) {
			index +=  deptMapper.deleteByPrimaryKey(id);
		}
		if(index==ids.size()) {
			return 1;
		}else {
			throw new Exception("删除数据失败");
		}
	}

	
}

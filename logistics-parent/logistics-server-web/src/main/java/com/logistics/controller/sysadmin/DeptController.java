package com.logistics.controller.sysadmin;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.logistics.pojo.Dept;
import com.logistics.pojo.DeptChild;
import com.logistics.service.DeptService;
import com.logistics.utils.PageUtil;

@Controller
@RequestMapping("/sysadmin/")
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	/**
	 * 分页显示部门信息
	 * @param pageNo
	 * @param request
	 * @return
	 */
	@RequestMapping("deptAction_list")
	public String  getList(@RequestParam(value="pageNo",defaultValue="1") int pageNo,HttpServletRequest request) {
		PageUtil<DeptChild> pageUtil = deptService.findAll(pageNo);
		request.setAttribute("pageUtil", pageUtil);
		return "sysadmin/dept/jDeptList";
	}
	
	/**
	 * 查看单个部门信息
	 * @param id
	 * @return
	 */
	@RequestMapping("deptAction_toview")
	public String showView(String id,HttpServletRequest request) {
		DeptChild child = deptService.selById(id);
		request.setAttribute("dept", child);
		return "sysadmin/dept/jDeptView";
	}
	
	/**
	 * 显示新增页面
	 * @return
	 */
	@RequestMapping("deptAction_tocreate")
	public String toCreate(HttpServletRequest request) {
		List<Dept> list = deptService.findAll();
		request.setAttribute("list", list);
		return "sysadmin/dept/jDeptCreate";
	}
	
	/**
	 * 新增部门
	 * @param dept
	 * @return
	 */
	@RequestMapping("deptAction_insert")
	public String insert(Dept dept,HttpServletRequest request) {
		try {
			deptService.insDept(dept);
		} catch (Exception e) {
			request.setAttribute("error", "修改部门信息出错,请与管理员进行联系");
			e.printStackTrace();
		}
		return "forward:/sysadmin/deptAction_list";
	}
	
	/**
	 * 显示修改页面
	 * @param id
	 * @return
	 */
	@RequestMapping("deptAction_toupdate")
	public String toUpdate(String id,HttpServletRequest request) {
		DeptChild child = deptService.selById(id);
		List<Dept> list = deptService.findAll();
		//遍历所有部门，清除掉当前当前部门本身（不能作为父部门使用）
		Dept d = new Dept();
		for (Dept dept : list) {
			if(dept.getDeptId().equals(child.getDeptId())) {
				d = dept;
			}
		}
		list.remove(d);
		request.setAttribute("list",list);
		request.setAttribute("d",child);
		return "sysadmin/dept/jDeptUpdate";
	}
	
	/**
	 * 修改部门信息
	 * @param dept
	 * @return
	 */
	@RequestMapping("deptAction_update")
	public String update(Dept dept,HttpServletRequest request) {
		try {
			deptService.updDept(dept);
		} catch (Exception e) {
			request.setAttribute("error", "修改部门信息出错,请与管理员进行联系");
			e.printStackTrace();
		}
		return "forward:/sysadmin/deptAction_list";
	}
	
	/**
	 * 批量删除部门信息
	 * @param id
	 * @return
	 */
	@RequestMapping("deptAction_delete")
	public String delete(@RequestParam("id")List<String> id) {
		try {
			deptService.delDepts(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/deptAction_list";
	}
}

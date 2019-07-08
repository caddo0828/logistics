package com.logistics.controller.sysadmin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.logistics.pojo.Role;
import com.logistics.service.RoleService;
import com.logistics.utils.PageUtil;

@Controller
@RequestMapping("/sysadmin/")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	/**
	 * 分页查询角色列表信息
	 * @param pageNo
	 * @param request
	 * @return
	 */
	@RequestMapping("roleAction_list")
	public String getList(@RequestParam(value="pageNo",defaultValue="1") int pageNo,HttpServletRequest request) {
		request.setAttribute("pageUtil", roleService.findAll(pageNo));
		return "sysadmin/role/jRoleList";
	}
	
	/**
	 * 显示角色具体信息页面
	 * @param roleId
	 * @return
	 */
	@RequestMapping("roleAction_toview")
	public String toView(String roleId,HttpServletRequest request) {
		Role role = roleService.findById(roleId);
		request.setAttribute("name", role.getName());
		request.setAttribute("remark", role.getRemark());
		return "sysadmin/role/jRoleView";
	}
	
	/**
	 * 显示角色而修改页面
	 * @param roleId
	 * @param request
	 * @return
	 */
	@RequestMapping("roleAction_toupdate")
	public String toUpdate(String roleId,HttpServletRequest request) {
		Role role = roleService.findById(roleId);
		request.setAttribute("roleId", role.getRoleId());
		request.setAttribute("name", role.getName());
		request.setAttribute("remark", role.getRemark());
		return "sysadmin/role/jRoleUpdate";
	}
	
	/**
	 * 修改角色信息
	 * @param role
	 * @return
	 */
	@RequestMapping("roleAction_update")
	public String update(Role role) {
		try {
			roleService.update(role);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/roleAction_list";
	}
	
	/**
	 * 显示角色新增页面
	 * @return
	 */
	@RequestMapping("roleAction_tocreate")
	public String toCreate() {
		return "sysadmin/role/jRoleCreate";
	}
	
	/**
	 * 角色新增
	 * @param role
	 * @return
	 */
	@RequestMapping("roleAction_insert")
	public String insert(Role role) {
		try {
			roleService.insert(role);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/roleAction_list";
	}
	
	/**
	 * 批量删除角色
	 * @param list
	 * @return
	 */
	@RequestMapping("roleAction_delete")
	public String delete(@RequestParam("roleId") List<String> list) {
		try {
			roleService.delete(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/roleAction_list";
	}
	
}

package com.logistics.controller.sysadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.logistics.pojo.Module;
import com.logistics.pojo.Role;
import com.logistics.pojo.RoleModule;
import com.logistics.service.ModuleService;
import com.logistics.service.RoleService;

@Controller
@RequestMapping("/sysadmin/")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@Autowired
	private ModuleService moduleService;
	
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
	
	/**
	 * 显示权限页面
	 * @param roleId
	 * @return
	 */
	@RequestMapping("roleAction_tomodule")
	public String toModule(String roleId,HttpServletRequest request) {
		request.setAttribute("role",roleService.findById(roleId) );
		return "sysadmin/role/jRoleModule";
	}
	
	/**
	 * 返回角色对应的模块列表
	 * 	a:查询对应的角色所具有的模块列表信息
	 *  b:查询所有的模块列表,遍历对应的数据，如果用户包含当前的模块信息，则check属性值为true,否则为false
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="roleAction_genzTreeNodes")
	@ResponseBody
	public List<Map<String, Object>> getModuleTree(String roleId) {
		/**
		 * 返回格式
		 * [{"id": "11","pId": "1","name": "随意勾选 1-1"},
		 * {"id": "111","pId": "11","name": "随意勾选 1-1-1","checked": "true"}]
		 */
		List<Map<String, Object>> results = new ArrayList<>();
	
		//该角色所对应的模块数据
		List<RoleModule> list = roleService.findRoleModuleList(roleId);
		
		//查询所有的模块数据
		List<Module> moduleList = moduleService.findAll();
		for (Module module : moduleList) {
			Map<String, Object> map = new HashMap<>();
			map.put("id", module.getModuleId());
			map.put("pId", module.getParentId());
			map.put("name", module.getName());
			if(list!=null&&list.size()>0) {
				for (RoleModule roleModule : list) {
					if(module.getModuleId().equals(roleModule.getModuleId())) {
						//代表当前角色所对应的模块应该被选中
						map.put("checked", "true");
					}
				}
			}
			results.add(map);
		}
		return results;
	}
	
	/**
	 * 修改角色对应的模块
	 * @param roleId
	 * @param moduleIds
	 * @return
	 */
	@RequestMapping("roleAction_module")
	public String updRoleModule(String roleId,String moduleIds) {
		try {
			roleService.updateRoleModule(moduleIds, roleId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/roleAction_list";
	}
}

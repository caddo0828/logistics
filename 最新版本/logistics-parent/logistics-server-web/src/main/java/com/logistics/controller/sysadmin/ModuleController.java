package com.logistics.controller.sysadmin;

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
import com.logistics.service.ModuleService;

@Controller
@RequestMapping("/sysadmin/")
public class ModuleController {
	@Autowired
	private ModuleService moduleService;
	
	/**
	 * 分页显示部门列表信息
	 * @param pageNo
	 * @param request
	 * @return
	 */
	@RequestMapping("moduleAction_list")
	public String getList(@RequestParam(value="pageNo",defaultValue="1")int pageNo,HttpServletRequest request) {
		request.setAttribute("pageUtil", moduleService.findAll(pageNo));
		return "sysadmin/module/jModuleList";
	}
	
	/**
	 * 跳转部门详细信息页面
	 * @param moduleId
	 * @param request
	 * @return
	 */
	@RequestMapping("moduleAction_toview")
	public String toView(String moduleId,HttpServletRequest request) {
		request.setAttribute("module", moduleService.findById(moduleId));
		return "sysadmin/module/jModuleView";
	}
	
	/**
	 * 显示模块修改页面
	 * @param moduleId
	 * @return
	 */
	@RequestMapping("moduleAction_toupdate")
	public String toUpdate(String moduleId,HttpServletRequest request) {
		request.setAttribute("module", moduleService.findById(moduleId));
		return "sysadmin/module/jModuleUpdate";
	}
	
	/**
	 * 修改模块信息
	 * @param module
	 * @return
	 */
	@RequestMapping("moduleAction_update")
	public String update(Module module) {
		try {
			moduleService.update(module);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/moduleAction_list";
	}
	
	/**
	 * 批量删除模块信息
	 * @param list
	 * @return
	 */
	@RequestMapping("moduleAction_delete")
	public String delete(@RequestParam("moduleId") List<String> list) {
		try {
			moduleService.delete(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/moduleAction_list";
	}
	
	/**
	 * 显示新增页面
	 * @return
	 */
	@RequestMapping("moduleAction_tocreate")
	public String toCreate(HttpServletRequest request) {
		//查询所有的模块信息
		request.setAttribute("list", moduleService.findAll());
		return "sysadmin/module/jModuleCreate";
	}
	
	/**
	 * 判断新增时模块名是否已经存在
	 * @param name
	 * @return
	 */
	@RequestMapping("moduleAction_serachName")
	@ResponseBody
	public Map<String, Object> searchName(String name) {
		Map<String, Object> map = new HashMap<>();
		Module module = moduleService.findByName(name);
		if(module==null) {
			//表示不存在同名的模块数据
			map.put("result", 200);
		}else {
			map.put("result", 500);
		}
		return map;
	}
	

	/**
	 * 模块新增
	 * @param module
	 * @return
	 */
	@RequestMapping("moduleAction_insert")
	public String insert(Module module) {
		try {
			moduleService.insert(module);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/moduleAction_list";
	}
	
	
}

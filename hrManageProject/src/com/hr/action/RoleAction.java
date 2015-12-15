package com.hr.action;

import java.util.List;

import com.hr.biz.RoleService;
import com.hr.entity.Role;
import com.hr.entity.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RoleAction extends ActionSupport implements ModelDriven<Role>{
	private Role role;
	private List<Role> rolelist;
	private RoleService roleService;
	public List<Role> getRolelist() {
		return rolelist;
	}
	public void setRolelist(List<Role> rolelist) {
		this.rolelist = rolelist;
	}
	public RoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Role getModel() {
		if(role == null) role = new Role();
		return role;
	}
	
	public String toRoleAllList() throws Exception{
		rolelist = roleService.getRoleAllList();
		return "toRoleAllList";
	}
}

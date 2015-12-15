package com.hr.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hr.biz.imp.IUsersService;
import com.hr.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages;

public class UsersAction extends ActionSupport  implements ModelDriven<Users>{
	private Users users;
	private IUsersService usersService;
	private List<Users> usersList;
	public void setUsersService(IUsersService usersService) {
		this.usersService = usersService;
	}

	public Users getModel() {
		if (users == null) users = new Users();
		return users;
	}
	public String getUsersByLogin() throws Exception{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("uName", users.getUserName());
		map.put("uPassWord", users.getUserPassword());
		Users rusers = usersService.getUsersByLogin(map);
		if (rusers!=null) {
			ActionContext ctx = ActionContext.getContext();																										
			Map<String, Object> session = ctx.getSession();																							
			session.put("UsersLogin", rusers);	
			System.out.println("==========="+rusers+""+session.size());
			return "doLogin";
		}
		return "toLogin";
	}
	public void validateGetUsersByLogin() {
		System.out.println(users.getUserName()+"_== "+users.getUserPassword());
		if (users.getUserName()==null) {
			addFieldError("userName.error","«Îƒ˙ ‰»Î’À∫≈£°");
		}
		if (users.getUserPassword()==null) {
			addFieldError("userPwd.error","«Îƒ˙ ‰»Î√‹¬Î£°");
		}
	}
	//YZT---
	public String toUsersAllList() throws Exception {
		usersList = usersService.getUsersAllList();
		return "toUsersAllList";
	}

	
	
	
	//---------------------------------------get Or set Met
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<Users> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}

	public IUsersService getUsersService() {
		return usersService;
	}
	
}

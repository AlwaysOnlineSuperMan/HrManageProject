package com.hr.entity;

import java.util.Date;

public class Users {
    private Short userId;

    private String userName;

    private String userTrueName;

    private String userPassword;

    private Date updateDatetime;
  @Override
	public String toString() {
		return "Users [role=" + role + ", updateDatetime=" + updateDatetime
				+ ", userId=" + userId + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", userTrueName="
				+ userTrueName + "]";
	}

public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	//  private Short uRoleId;
    private Role role;
    
    
    
    

	public Short getUserId() {
		return userId;
	}

	public void setUserId(Short userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserTrueName() {
		return userTrueName;
	}

	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
    
    
   
    
    
}
package com.hr.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Role {
    private Short roleId;

    private String roleName;

    private String roleDesc;

    private Integer roleFlag;

    private Date updateDatetime;
	private Set<RoleRight> roleRights = new HashSet<RoleRight>(0);
	private Set<Users> userses = new HashSet<Users>(0);

    public Set<RoleRight> getRoleRights() {
		return roleRights;
	}

	public void setRoleRights(Set<RoleRight> roleRights) {
		this.roleRights = roleRights;
	}

	public Set<Users> getUserses() {
		return userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Integer getRoleFlag() {
        return roleFlag;
    }

    public void setRoleFlag(Integer roleFlag) {
        this.roleFlag = roleFlag;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

	@Override
	public String toString() {
		return "Role [roleDesc=" + roleDesc + ", roleFlag=" + roleFlag
				+ ", roleId=" + roleId + ", roleName=" + roleName
				+ ", roleRights=" + roleRights + ", updateDatetime="
				+ updateDatetime + ", userses=" + userses + "]";
	}

	

	
}
package com.hr.biz.imp;

import java.util.List;

import com.hr.entity.Role;

public interface IRoleService {
	public abstract List<Role> getRoleAllList() throws Exception;
}

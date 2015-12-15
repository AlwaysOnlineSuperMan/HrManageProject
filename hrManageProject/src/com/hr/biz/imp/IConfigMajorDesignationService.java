package com.hr.biz.imp;

import java.util.List;

import com.hr.entity.ConfigMajorDesignation;

public interface IConfigMajorDesignationService {

	public abstract List<ConfigMajorDesignation> getConfigMajorDesignationList()
			throws Exception;

}
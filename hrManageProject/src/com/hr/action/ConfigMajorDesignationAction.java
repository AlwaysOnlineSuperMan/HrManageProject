package com.hr.action;

import java.util.List;

import com.hr.biz.imp.IConfigMajorDesignationService;
import com.hr.entity.ConfigMajorDesignation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigMajorDesignationAction extends ActionSupport implements
		ModelDriven<ConfigMajorDesignation> {
	private ConfigMajorDesignation configMajorDesignation;
	private List<ConfigMajorDesignation> configMajorDesignations;
	private IConfigMajorDesignationService configMajorDesignationService;
	
	
	
	
	public String toProfessionDesign()throws Exception{
		configMajorDesignations = configMajorDesignationService.getConfigMajorDesignationList();
		return "toProfessionDesign";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ConfigMajorDesignation getConfigMajorDesignation() {
		return configMajorDesignation;
	}

























	public void setConfigMajorDesignation(
			ConfigMajorDesignation configMajorDesignation) {
		this.configMajorDesignation = configMajorDesignation;
	}

























	public List<ConfigMajorDesignation> getConfigMajorDesignations() {
		return configMajorDesignations;
	}

























	public void setConfigMajorDesignations(
			List<ConfigMajorDesignation> configMajorDesignations) {
		this.configMajorDesignations = configMajorDesignations;
	}

























	public IConfigMajorDesignationService getConfigMajorDesignationService() {
		return configMajorDesignationService;
	}

























	public void setConfigMajorDesignationService(
			IConfigMajorDesignationService configMajorDesignationService) {
		this.configMajorDesignationService = configMajorDesignationService;
	}

























	public ConfigMajorDesignation getModel() {
		// TODO Auto-generated method stub
		if(configMajorDesignation==null)configMajorDesignation = new ConfigMajorDesignation();
		return configMajorDesignation;
	}
	

}

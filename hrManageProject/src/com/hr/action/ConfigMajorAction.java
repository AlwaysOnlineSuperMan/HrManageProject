package com.hr.action;

import java.util.HashMap;
import java.util.List;

import com.hr.biz.imp.IConfigMajorKindService;
import com.hr.biz.imp.IConfigMajorService;
import com.hr.entity.ConfigMajor;
import com.hr.entity.ConfigMajorKind;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigMajorAction extends ActionSupport implements
		ModelDriven<ConfigMajor> {
	
	private IConfigMajorService configMajorService;
	private IConfigMajorKindService    configMajorKindService;
	
	private List<ConfigMajorKind>  configMajorKinds;
	private List<ConfigMajor>      configMajors;
	private ConfigMajor configMajor;
	
	public String doMajorAdd()throws Exception{
		System.out.println(configMajor);
		configMajorService.insertSelective(configMajor);
		return "doMajorAdd";
	}
	public String toMajorAdd()throws Exception{
		configMajorKinds = configMajorKindService.getConfigMajorKindList();
		configMajor.setMajorId(System.currentTimeMillis()+"");
		return "toMajorAdd";
	}
	public String toMajor()throws Exception{
		HashMap<String, Object> map = new HashMap<String, Object>();
		configMajors  = configMajorService.getConfigMajorListAll(map);
		return "toMajor";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ConfigMajor getModel() {
		// TODO Auto-generated method stub
		if(configMajor==null)configMajor = new ConfigMajor();
		return configMajor;
	}















	public IConfigMajorService getConfigMajorService() {
		return configMajorService;
	}















	public void setConfigMajorService(IConfigMajorService configMajorService) {
		this.configMajorService = configMajorService;
	}















	public IConfigMajorKindService getConfigMajorKindService() {
		return configMajorKindService;
	}















	public void setConfigMajorKindService(
			IConfigMajorKindService configMajorKindService) {
		this.configMajorKindService = configMajorKindService;
	}















	public List<ConfigMajorKind> getConfigMajorKinds() {
		return configMajorKinds;
	}















	public void setConfigMajorKinds(List<ConfigMajorKind> configMajorKinds) {
		this.configMajorKinds = configMajorKinds;
	}















	public List<ConfigMajor> getConfigMajors() {
		return configMajors;
	}















	public void setConfigMajors(List<ConfigMajor> configMajors) {
		this.configMajors = configMajors;
	}















	public ConfigMajor getConfigMajor() {
		return configMajor;
	}















	public void setConfigMajor(ConfigMajor configMajor) {
		this.configMajor = configMajor;
	}

}

package com.hr.action;

import java.util.List;

import com.hr.biz.imp.IConfigMajorKindService;
import com.hr.entity.ConfigMajorKind;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigMajorKindAction extends ActionSupport implements
		ModelDriven<ConfigMajorKind> {
	private ConfigMajorKind configMajorKind;
	private IConfigMajorKindService configMajorKindService;
	private List<ConfigMajorKind> ConfigMajorKinds;
	
	

	public String doMajorKindAdd()throws Exception{
		System.out.println(configMajorKind);
		configMajorKindService.insertSelective(configMajorKind);
		return "doMajorKindAdd";
	}
	
	public String toMajorKindAdd()throws Exception{
		configMajorKind.setMajorKindId(System.currentTimeMillis()+"");
		return "toMajorKindAdd";
	}
	public String toMajorKind()throws Exception{
		ConfigMajorKinds = configMajorKindService.getConfigMajorKindList();
		return "toMajorKind";
	}
	
	
	public ConfigMajorKind getModel() {
		if (configMajorKind==null) configMajorKind = new ConfigMajorKind();
		return configMajorKind;
	}


	public ConfigMajorKind getConfigMajorKind() {
		return configMajorKind;
	}


	public void setConfigMajorKind(ConfigMajorKind configMajorKind) {
		this.configMajorKind = configMajorKind;
	}


	public IConfigMajorKindService getConfigMajorKindService() {
		return configMajorKindService;
	}


	public void setConfigMajorKindService(
			IConfigMajorKindService configMajorKindService) {
		this.configMajorKindService = configMajorKindService;
	}


	public List<ConfigMajorKind> getConfigMajorKinds() {
		return ConfigMajorKinds;
	}


	public void setConfigMajorKinds(List<ConfigMajorKind> configMajorKinds) {
		ConfigMajorKinds = configMajorKinds;
	}

}

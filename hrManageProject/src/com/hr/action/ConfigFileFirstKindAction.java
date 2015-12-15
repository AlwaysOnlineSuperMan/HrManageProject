package com.hr.action;

import java.util.List;

import com.hr.biz.ConfigFileFirstKindService;
import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigFileFirstKindAction extends ActionSupport implements ModelDriven<ConfigFileFirstKindWithBLOBs>{
	private ConfigFileFirstKindWithBLOBs configFileFirstKind;
	private List<ConfigFileFirstKindWithBLOBs> configFileFirstKindList;
	private ConfigFileFirstKindService configFileFirstKindService;
	
	
	
	
	
	
	
	public String toFirstKindChange(){
		System.out.println(configFileFirstKind.getFfkId());
		configFileFirstKind = configFileFirstKindService.getConfigFileFirstKindWithBLOBsByfffId(configFileFirstKind.getFfkId());
		System.out.println(configFileFirstKind);
		return "toFirstKindChange";
	}
	public String doFirstKindChange(){
		System.out.println(configFileFirstKind);
		configFileFirstKindService.updateByPrimaryKeySelective(configFileFirstKind);
		return "doFirstKindChange";
	}
	public String toFirsKindList(){
		configFileFirstKindList = configFileFirstKindService.getConfigFileFirstKindWithBLOBsList();
		return "toFirsKindList";
	}
	
	
	public String toFirstKindRegister(){
		configFileFirstKind.setFirstKindId(System.currentTimeMillis()+"");
		return "toFirstKindRegister";
	}
	
	
	public String doFirstKindRegister(){
		System.out.println(configFileFirstKind);
		configFileFirstKindService.insertSelective(configFileFirstKind);
		return "doFirstKindRegister";
	}
	

	

	public List<ConfigFileFirstKindWithBLOBs> getConfigFileFirstKindList() {
		return configFileFirstKindList;
	}


	public void setConfigFileFirstKindList(
			List<ConfigFileFirstKindWithBLOBs> configFileFirstKindList) {
		this.configFileFirstKindList = configFileFirstKindList;
	}


	public ConfigFileFirstKindService getConfigFileFirstKindService() {
		return configFileFirstKindService;
	}


	public void setConfigFileFirstKindService(
			ConfigFileFirstKindService configFileFirstKindService) {
		this.configFileFirstKindService = configFileFirstKindService;
	}


	public ConfigFileFirstKindWithBLOBs getConfigFileFirstKind() {
		return configFileFirstKind;
	}

	public void setConfigFileFirstKind(
			ConfigFileFirstKindWithBLOBs configFileFirstKind) {
		this.configFileFirstKind = configFileFirstKind;
	}

	public ConfigFileFirstKindWithBLOBs getModel() {
		// TODO Auto-generated method stub
		if (configFileFirstKind==null) configFileFirstKind = new ConfigFileFirstKindWithBLOBs();
		return configFileFirstKind;
	}
	
	
	
	






	














	
	
	
}

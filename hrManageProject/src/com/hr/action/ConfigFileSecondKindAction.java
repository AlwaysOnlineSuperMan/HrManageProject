package com.hr.action;

import java.util.List;

import com.hr.biz.ConfigFileFirstKindService;
import com.hr.biz.imp.IConfigFileSecondKindService;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileSecondKindWithBLOBs;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigFileSecondKindAction extends ActionSupport implements
		ModelDriven<ConfigFileSecondKindWithBLOBs> {
	private IConfigFileSecondKindService configFileSecondKindService;
	private ConfigFileFirstKindService configFileFirstKindService;
	private List<ConfigFileSecondKindWithBLOBs> configFileSecondKindWithBLOBsList;
	private List<ConfigFileFirstKindWithBLOBs> configFileFirstKindList;
	private ConfigFileSecondKindWithBLOBs configFileSecondKindWithBLOBs;


	
	
	
	
	public String doSecondKindChange()throws Exception{
	 configFileSecondKindService.updateByPrimaryKeySelective(configFileSecondKindWithBLOBs);
		return "doSecondKindChange";
	} 
	public String toSecondKindChange()throws Exception{
		configFileFirstKindList = configFileFirstKindService.getConfigFileFirstKindWithBLOBsList();
		configFileSecondKindWithBLOBs = configFileSecondKindService.getSelectByPrimaryKey(configFileSecondKindWithBLOBs.getFskId());
		return "toSecondKindChange";
	} 
	public String toSecondKindRegister()throws Exception{
		configFileFirstKindList = configFileFirstKindService.getConfigFileFirstKindWithBLOBsList();
		configFileSecondKindWithBLOBs.setSecondKindId(System.currentTimeMillis()+"");
		return "toSecondKindRegister";
	} 
	public String doSecondKindRegister()throws Exception{
		System.out.println(configFileSecondKindWithBLOBs);
		configFileSecondKindService.insertSelective(configFileSecondKindWithBLOBs);
		return "doSecondKindRegister";
	} 
	
	public String toSecondKind()throws Exception{
		configFileSecondKindWithBLOBsList = configFileSecondKindService.getConfigFileSecondKindByListAll();
		return "toSecondKind";
	} 

	
	public List<ConfigFileSecondKindWithBLOBs> getConfigFileSecondKindWithBLOBsList() {
		return configFileSecondKindWithBLOBsList;
	}

	public void setConfigFileSecondKindWithBLOBsList(
			List<ConfigFileSecondKindWithBLOBs> configFileSecondKindWithBLOBsList) {
		this.configFileSecondKindWithBLOBsList = configFileSecondKindWithBLOBsList;
	}

	public IConfigFileSecondKindService getConfigFileSecondKindService() {
		return configFileSecondKindService;
	}

	public void setConfigFileSecondKindService(
			IConfigFileSecondKindService configFileSecondKindService) {
		this.configFileSecondKindService = configFileSecondKindService;
	}

	public ConfigFileSecondKindWithBLOBs getConfigFileSecondKindWithBLOBs() {
		return configFileSecondKindWithBLOBs;
	}

	public void setConfigFileSecondKindWithBLOBs(
			ConfigFileSecondKindWithBLOBs configFileSecondKindWithBLOBs) {
		this.configFileSecondKindWithBLOBs = configFileSecondKindWithBLOBs;
	}

	public ConfigFileSecondKindWithBLOBs getModel() {
		// TODO Auto-generated method stub
		if(configFileSecondKindWithBLOBs==null)configFileSecondKindWithBLOBs = new ConfigFileSecondKindWithBLOBs();
		return configFileSecondKindWithBLOBs;
	}
	public ConfigFileFirstKindService getConfigFileFirstKindService() {
		return configFileFirstKindService;
	}
	public void setConfigFileFirstKindService(
			ConfigFileFirstKindService configFileFirstKindService) {
		this.configFileFirstKindService = configFileFirstKindService;
	}
	public List<ConfigFileFirstKindWithBLOBs> getConfigFileFirstKindList() {
		return configFileFirstKindList;
	}
	public void setConfigFileFirstKindList(
			List<ConfigFileFirstKindWithBLOBs> configFileFirstKindList) {
		this.configFileFirstKindList = configFileFirstKindList;
	}
	
	
	

}

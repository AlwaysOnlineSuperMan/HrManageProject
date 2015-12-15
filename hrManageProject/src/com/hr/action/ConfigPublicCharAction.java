package com.hr.action;

import java.util.List;

import com.hr.biz.imp.IConfigPublicCharService;
import com.hr.entity.ConfigPublicChar;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigPublicCharAction extends ActionSupport implements
		ModelDriven<ConfigPublicChar> {
	private ConfigPublicChar configPublicChar;
	private IConfigPublicCharService configPublicCharService;
	private List<ConfigPublicChar> configPublicChars;
	
	
	
	public String toPublicCharAdd()throws Exception{
		return "toPublicCharAdd";
	}
	public String doPublicCharAdd()throws Exception{
		configPublicCharService.insertSelective(configPublicChar);
		return "doPublicCharAdd";
	}
	public String toPublicChar()throws Exception{
		configPublicChars = configPublicCharService.getConfigPublicCharByListAll();
		return "toPublicChar";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ConfigPublicChar getModel() {
		// TODO Auto-generated method stub
		if(configPublicChar==null)configPublicChar = new ConfigPublicChar();
		return configPublicChar;
	}



	public ConfigPublicChar getConfigPublicChar() {
		return configPublicChar;
	}



	public void setConfigPublicChar(ConfigPublicChar configPublicChar) {
		this.configPublicChar = configPublicChar;
	}



	public IConfigPublicCharService getConfigPublicCharService() {
		return configPublicCharService;
	}



	public void setConfigPublicCharService(
			IConfigPublicCharService configPublicCharService) {
		this.configPublicCharService = configPublicCharService;
	}



	public List<ConfigPublicChar> getConfigPublicChars() {
		return configPublicChars;
	}



	public void setConfigPublicChars(List<ConfigPublicChar> configPublicChars) {
		this.configPublicChars = configPublicChars;
	}

}

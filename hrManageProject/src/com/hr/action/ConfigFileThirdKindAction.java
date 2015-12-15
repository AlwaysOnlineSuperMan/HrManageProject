package com.hr.action;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.hr.biz.ConfigFileFirstKindService;
import com.hr.biz.ConfigFileThirdKindService;
import com.hr.biz.imp.IConfigFileFirstKindService;
import com.hr.biz.imp.IConfigFileSecondKindService;
import com.hr.biz.imp.IConfigFileThirdKindService;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileSecondKindWithBLOBs;
import com.hr.entity.ConfigFileThirdKind;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigFileThirdKindAction extends ActionSupport implements
		ModelDriven<ConfigFileThirdKind> {
	
	
	private IConfigFileSecondKindService configFileSecondKindService;
	private IConfigFileFirstKindService configFileFirstKindService;
	private IConfigFileThirdKindService configFileThirdKindService;
	
	private List<ConfigFileFirstKindWithBLOBs> configFileFirstKindWithBLOBsList;
	private List<ConfigFileSecondKind> configFileSecondKindList;
	private List<ConfigFileThirdKind> configFileThirdKindList;
	private ConfigFileThirdKind configFileThirdKind;

	
	
	
	public String doThirdKindChange()throws Exception{
			System.out.println(configFileThirdKind);
			configFileThirdKindService.updateByPrimaryKeySelective(configFileThirdKind);
		return "doThirdKindChange";
		
	}
	
	
	public String toThirdKindChange()throws Exception{
		configFileFirstKindWithBLOBsList = configFileFirstKindService.getConfigFileFirstKindWithBLOBsList();
		
		configFileThirdKind = configFileThirdKindService.getSelectByPrimaryKey(configFileThirdKind.getFtkId());
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstKindId", configFileThirdKind.getFirstKindId());
		configFileSecondKindList =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		
		
		
		return "toThirdKindChange";
		
	}
	public String doThirdKindRegister()throws Exception{
		System.out.println(configFileThirdKind);
		configFileThirdKindService.insertSelective(configFileThirdKind);
		return "doThirdKindRegister";
		
	}
	
	public String toThirdKindRegister()throws Exception{
		configFileFirstKindWithBLOBsList = configFileFirstKindService.getConfigFileFirstKindWithBLOBsList();
		configFileThirdKind.setThirdKindId(System.currentTimeMillis()+"");
		return "toThirdKindRegister";
		
	}
	public String toThirdKind()throws Exception{
		
		configFileThirdKindList = configFileThirdKindService.getConfigFileThirdKindByListAll();
		return "toThirdKind";
		
	}
	
	
	
	public void doChangeFirstKind() throws Exception{
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstKindId", configFileThirdKind.getFirstKindId());
		configFileSecondKindList = configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		StringBuilder sb = new StringBuilder();
		sb.append("<items>");
			for (ConfigFileSecondKind CurrConfigFileSecondKindObject : configFileSecondKindList) {
				sb.append("<item id='"+CurrConfigFileSecondKindObject.getSecondKindId()+"'  name='"+CurrConfigFileSecondKindObject.getSecondKindName()+"'>");
				sb.append("</item>");
			}
		sb.append("</items>");
		System.out.println(sb.toString());
		ActionContext ctx = ActionContext.getContext();																										
		HttpServletResponse response = (HttpServletResponse) ctx.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
	    response.setContentType("text/xml;charset=utf-8");
		 PrintWriter pw=response.getWriter();
		 pw.write(sb.toString());
		 pw.flush();
		 pw.close();
	}
	
	
	
	
	public ConfigFileThirdKind getModel() {
		// TODO Auto-generated method stub
		if (configFileThirdKind==null) configFileThirdKind = new ConfigFileThirdKind();
		return null;
	}

	public IConfigFileSecondKindService getConfigFileSecondKindService() {
		return configFileSecondKindService;
	}

	public void setConfigFileSecondKindService(
			IConfigFileSecondKindService configFileSecondKindService) {
		this.configFileSecondKindService = configFileSecondKindService;
	}



	public IConfigFileFirstKindService getConfigFileFirstKindService() {
		return configFileFirstKindService;
	}








	public void setConfigFileFirstKindService(
			IConfigFileFirstKindService configFileFirstKindService) {
		this.configFileFirstKindService = configFileFirstKindService;
	}








	public IConfigFileThirdKindService getConfigFileThirdKindService() {
		return configFileThirdKindService;
	}








	public void setConfigFileThirdKindService(
			IConfigFileThirdKindService configFileThirdKindService) {
		this.configFileThirdKindService = configFileThirdKindService;
	}


















	public List<ConfigFileSecondKind> getConfigFileSecondKindList() {
		return configFileSecondKindList;
	}
	public void setConfigFileSecondKindList(
			List<ConfigFileSecondKind> configFileSecondKindList) {
		this.configFileSecondKindList = configFileSecondKindList;
	}
	public List<ConfigFileFirstKindWithBLOBs> getConfigFileFirstKindWithBLOBsList() {
		return configFileFirstKindWithBLOBsList;
	}
	public void setConfigFileFirstKindWithBLOBsList(
			List<ConfigFileFirstKindWithBLOBs> configFileFirstKindWithBLOBsList) {
		this.configFileFirstKindWithBLOBsList = configFileFirstKindWithBLOBsList;
	}
	public List<ConfigFileThirdKind> getConfigFileThirdKindList() {
		return configFileThirdKindList;
	}








	public void setConfigFileThirdKindList(
			List<ConfigFileThirdKind> configFileThirdKindList) {
		this.configFileThirdKindList = configFileThirdKindList;
	}








	public ConfigFileThirdKind getConfigFileThirdKind() {
		return configFileThirdKind;
	}

	public void setConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		this.configFileThirdKind = configFileThirdKind;
	}

	

}

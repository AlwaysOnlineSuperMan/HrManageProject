package com.hr.action;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.hr.biz.ConfigFileFirstKindService;
import com.hr.biz.ConfigFileSecondKindService;
import com.hr.biz.ConfigFileThirdKindService;
import com.hr.biz.imp.IConfigMajorDesignationService;
import com.hr.biz.imp.IConfigMajorKindService;
import com.hr.biz.imp.IConfigMajorService;
import com.hr.biz.imp.IEngageMajorReleaseService;
import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileThirdKind;
import com.hr.entity.ConfigMajor;
import com.hr.entity.ConfigMajorDesignation;
import com.hr.entity.ConfigMajorKind;
import com.hr.entity.EngageMajorRelease;
import com.hr.entity.EngageMajorReleaseWithBLOBs;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EngageMajorReleaseAction extends ActionSupport implements
		ModelDriven<EngageMajorRelease> {
	private EngageMajorReleaseWithBLOBs engageMajorRelease;
	private ConfigFileFirstKindService configFileFirstKindService;
	private ConfigFileSecondKindService configFileSecondKindService;
	private ConfigFileThirdKindService configFileThirdKindService;

	private IEngageMajorReleaseService engageMajorReleaseService;
	private IConfigMajorDesignationService configMajorDesignationService; 
	private IConfigMajorKindService    configMajorKindService;
	private IConfigMajorService configMajorService;
	
	private List<ConfigFileFirstKind> configFileFirstKinds;
	private List<ConfigFileSecondKind> configFileSecondKinds;
	private List<ConfigFileThirdKind> configFileThirdKinds;
	private List<ConfigMajor> configMajors;
	private List<ConfigMajorKind>  configMajorKinds;
	private List<ConfigMajorDesignation> configMajorDesignations;
	private List<EngageMajorReleaseWithBLOBs> engageMajorReleaselist;
	
	public IEngageMajorReleaseService getEngageMajorReleaseService() {
		return engageMajorReleaseService;
	}
	public void setEngageMajorReleaseService(
			IEngageMajorReleaseService engageMajorReleaseService) {
		this.engageMajorReleaseService = engageMajorReleaseService;
	}

	private ConfigMajor configMajor;
	private ConfigFileSecondKind configFileSecondKind;
	private ConfigFileThirdKind configFileThirdKind; 
	private ConfigFileFirstKind configFileFirstKind;
	private ConfigMajorKind configMajorKind;
	//申请该职位
	public String saveRelease() {
		
		return "ResumeRegister";
	}
	//职位发布变更查询  
	public String selectEngageMajor() throws Exception{
		engageMajorReleaselist = engageMajorReleaseService.selectAllEngageMajor();
		return "toEngageMajorlist";
	}
	//职位发布查询  
	public String selectEngageMajorlist() throws Exception{
		System.out.println("selectEngageMajorlist");
		engageMajorReleaselist = engageMajorReleaseService.selectAllEngageMajor();
		System.out.println("selectEngageMajorlist");
		return "EngageMajorlist";
	}
	//发布
	public String saveEngageMajorRelease() throws Exception{
		System.out.println(engageMajorRelease);
		HashMap map = new HashMap<String, Object>();
		int count = engageMajorReleaseService.AddEngageMajorRelease(engageMajorRelease);
		System.out.println("count="+count);
		return "saveRegiste";
	}
	//职位变更修改
	public String UpdateEngageMajor() {
		int count = engageMajorReleaseService.UpdateEngageMajor(engageMajorRelease);
		System.out.println(count);
		return "updatePosition";
	}
	
	//==============================================
	
	
	public void doChangeFirstKind() throws Exception{
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstKindId", configFileSecondKind.getFirstKindId());
		configFileSecondKinds =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		StringBuilder sb = new StringBuilder();
		sb.append("<secondKinds>");
			for (ConfigFileSecondKind CurrConfigFileSecondKindObject : configFileSecondKinds) {
				sb.append("<secondKind id='"+CurrConfigFileSecondKindObject.getSecondKindId()+"'  name='"+CurrConfigFileSecondKindObject.getSecondKindName()+"'>");
				sb.append("</secondKind>");
			}
		sb.append("</secondKinds>");
		System.out.println(sb.toString());
		ActionContext ctx = ActionContext.getContext();																										
		HttpServletResponse response = (HttpServletResponse) ctx.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
	    response.setContentType("text/xml;charset=utf-8");
		 PrintWriter pw=response.getWriter();
		 pw.write(sb.toString());
		 pw.flush();
		 pw.close();
	}
	
	
	
	public void doChangeSecondKind() throws Exception{
		System.out.println(configFileThirdKind.getFirstKindId()+"-xxxxxxxxxxxxxxxxxx-"+configFileThirdKind.getSecondKindId());
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstKindId", configFileThirdKind.getFirstKindId());
		map.put("secondkindId", configFileThirdKind.getSecondKindId());
		configFileThirdKinds = configFileThirdKindService.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	
		System.out.println("lllllllllllll-"+configFileThirdKinds.size());
		StringBuilder sb = new StringBuilder();
		sb.append("<thirdKinds>");
			for (ConfigFileThirdKind CurrConfigFileThirdKindsObject : configFileThirdKinds) {
				sb.append("<thirdKind id='"+CurrConfigFileThirdKindsObject.getFirstKindId()+"'  name='"+CurrConfigFileThirdKindsObject.getFirstKindName()+"'>");
				sb.append("</thirdKind>");
			}
		sb.append("</thirdKinds>");
		System.out.println(sb.toString());
		ActionContext ctx = ActionContext.getContext();																										
		HttpServletResponse response = (HttpServletResponse) ctx.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
	    response.setContentType("text/xml;charset=utf-8");
		 PrintWriter pw=response.getWriter();
		 pw.write(sb.toString());
		 pw.flush();
		 pw.close();
		
	}
	
	
	public List<EngageMajorReleaseWithBLOBs> getEngageMajorReleaselist() {
		return engageMajorReleaselist;
	}
	public void setEngageMajorReleaselist(
			List<EngageMajorReleaseWithBLOBs> engageMajorReleaselist) {
		this.engageMajorReleaselist = engageMajorReleaselist;
	}
	public void doChangeMajorKind() throws Exception{
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("majorKindId", configMajor.getMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<ConfigMajors>");
			for (ConfigMajor CurrConfigMajorsObject : configMajors) {
				sb.append("<configMajor id='"+CurrConfigMajorsObject.getMajorId()+"'  name='"+CurrConfigMajorsObject.getMajorName()+"'>");
				sb.append("</configMajor>");
			}
		sb.append("</ConfigMajors>");
		System.out.println(sb.toString());
		ActionContext ctx = ActionContext.getContext();																										
		HttpServletResponse response = (HttpServletResponse) ctx.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
	    response.setContentType("text/xml;charset=utf-8");
		 PrintWriter pw=response.getWriter();
		 pw.write(sb.toString());
		 pw.flush();
		 pw.close();
	}
		
	
	//=======================================================================
	public EngageMajorRelease getModel() {
		if(engageMajorRelease==null) engageMajorRelease = new EngageMajorReleaseWithBLOBs();
		return engageMajorRelease;
	}
	public String getEngageMajorRelease()throws Exception{
		
		configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		configMajorKinds=configMajorKindService.getConfigMajorKindList();
		return "toEngageMajorRelease";
	}
	
	
	
	public IConfigMajorService getConfigMajorService() {
		return configMajorService;
	}
	public void setConfigMajorService(IConfigMajorService configMajorService) {
		this.configMajorService = configMajorService;
	}
	public ConfigMajor getConfigMajor() {
		return configMajor;
	}
	public ConfigFileSecondKind getConfigFileSecondKind() {
		return configFileSecondKind;
	}



	public void setConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind) {
		this.configFileSecondKind = configFileSecondKind;
	}



	public ConfigFileThirdKind getConfigFileThirdKind() {
		return configFileThirdKind;
	}



	public void setConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		this.configFileThirdKind = configFileThirdKind;
	}



	public ConfigFileFirstKind getConfigFileFirstKind() {
		return configFileFirstKind;
	}



	public void setConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind) {
		this.configFileFirstKind = configFileFirstKind;
	}



	public ConfigMajorKind getConfigMajorKind() {
		return configMajorKind;
	}



	public void setConfigMajorKind(ConfigMajorKind configMajorKind) {
		this.configMajorKind = configMajorKind;
	}



	public void setConfigMajor(ConfigMajor configMajor) {
		this.configMajor = configMajor;
	}
	public IConfigMajorKindService getConfigMajorKindService() {
		return configMajorKindService;
	}
	public void setConfigMajorKindService(
			IConfigMajorKindService configMajorKindService) {
		this.configMajorKindService = configMajorKindService;
	}
	public List<ConfigFileFirstKind> getConfigFileFirstKinds() {
		return configFileFirstKinds;
	}
	public void setConfigFileFirstKinds(
			List<ConfigFileFirstKind> configFileFirstKinds) {
		this.configFileFirstKinds = configFileFirstKinds;
	}
	public List<ConfigFileSecondKind> getConfigFileSecondKinds() {
		return configFileSecondKinds;
	}
	public void setConfigFileSecondKinds(
			List<ConfigFileSecondKind> configFileSecondKinds) {
		this.configFileSecondKinds = configFileSecondKinds;
	}
	public List<ConfigFileThirdKind> getConfigFileThirdKinds() {
		return configFileThirdKinds;
	}
	public void setConfigFileThirdKinds(
			List<ConfigFileThirdKind> configFileThirdKinds) {
		this.configFileThirdKinds = configFileThirdKinds;
	}
	public List<ConfigMajorKind> getConfigMajorKinds() {
		return configMajorKinds;
	}
	public void setConfigMajorKinds(List<ConfigMajorKind> configMajorKinds) {
		this.configMajorKinds = configMajorKinds;
	}
	public void setEngageMajorRelease(EngageMajorReleaseWithBLOBs engageMajorRelease) {
		this.engageMajorRelease = engageMajorRelease;
	}
	public ConfigFileFirstKindService getConfigFileFirstKindService() {
		return configFileFirstKindService;
	}
	public void setConfigFileFirstKindService(
			ConfigFileFirstKindService configFileFirstKindService) {
		this.configFileFirstKindService = configFileFirstKindService;
	}
	public ConfigFileSecondKindService getConfigFileSecondKindService() {
		return configFileSecondKindService;
	}
	public void setConfigFileSecondKindService(
			ConfigFileSecondKindService configFileSecondKindService) {
		this.configFileSecondKindService = configFileSecondKindService;
	}
	public ConfigFileThirdKindService getConfigFileThirdKindService() {
		return configFileThirdKindService;
	}
	public void setConfigFileThirdKindService(
			ConfigFileThirdKindService configFileThirdKindService) {
		this.configFileThirdKindService = configFileThirdKindService;
	}
	public void setConfigMajors(List<ConfigMajor> configMajors) {
		this.configMajors = configMajors;
	}
	public List<ConfigMajor> getConfigMajors() {
		return configMajors;
	}
	public void setConfigMajorDesignationService(
			IConfigMajorDesignationService configMajorDesignationService) {
		this.configMajorDesignationService = configMajorDesignationService;
	}
	public IConfigMajorDesignationService getConfigMajorDesignationService() {
		return configMajorDesignationService;
	}
	public void setConfigMajorDesignations(List<ConfigMajorDesignation> configMajorDesignations) {
		this.configMajorDesignations = configMajorDesignations;
	}
	public List<ConfigMajorDesignation> getConfigMajorDesignations() {
		return configMajorDesignations;
	}
	
}

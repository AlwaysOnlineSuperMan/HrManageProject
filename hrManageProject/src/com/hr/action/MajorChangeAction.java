package com.hr.action;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hr.biz.ConfigFileThirdKindService;
import com.hr.biz.imp.IConfigFileFirstKindService;
import com.hr.biz.imp.IConfigFileSecondKindService;
import com.hr.biz.imp.IConfigFileThirdKindService;
import com.hr.biz.imp.IConfigMajorKindService;
import com.hr.biz.imp.IConfigMajorService;
import com.hr.biz.imp.IHumanFileService;
import com.hr.biz.imp.IMajorChangeService;
import com.hr.biz.imp.ISalaryStandardDetailsService;
import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileThirdKind;
import com.hr.entity.ConfigMajor;
import com.hr.entity.ConfigMajorKind;
import com.hr.entity.HumanFile;
import com.hr.entity.HumanFileWithBLOBs;
import com.hr.entity.MajorChange;
import com.hr.entity.MajorChangeWithBLOBs;
import com.hr.entity.SalaryStandardDetails;
import com.hr.util.UtilBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MajorChangeAction extends ActionSupport {

	private IMajorChangeService imajorChangeService;
	private IConfigFileFirstKindService configFileFirstKindService;
	private IConfigMajorKindService configMajorKindService;
	private IConfigFileSecondKindService configFileSecondKindService;
	private IConfigMajorService configMajorService;
	private ISalaryStandardDetailsService salaryStandardDetailsService;
	private IConfigFileThirdKindService configFileThirdKindService;
	public  IHumanFileService humanFileService;
	
	private int count;

	private List<MajorChange> list;
	private List<ConfigFileFirstKindWithBLOBs> configfirstlist;
	private List<ConfigMajorKind> configMajorKindlist;
	private List<ConfigFileSecondKind> configFileSecondKindlist;
	private List<ConfigFileThirdKind> configFileThirdKindList;
	private List<ConfigMajor> configMajorList;
	private List<SalaryStandardDetails> salaryStandardDetailslist;


	private ConfigFileSecondKind configFileSecondKind;
	private ConfigMajor configMajor;
	private SalaryStandardDetails salaryStandardDetails;
	private MajorChangeWithBLOBs majorchange;
	private HumanFileWithBLOBs humanFileWithBLOBs;
	private UtilBean utilbean;

	// ***************************************
	public void doChangeFirstKind() throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstKindId", configFileSecondKind.getFirstKindId());
		configFileSecondKindlist = configFileSecondKindService
				.getConfigFileSecondKindByFirst_id(map);
		StringBuilder sb = new StringBuilder();
		sb.append("<secondKinds>");
		for (ConfigFileSecondKind CurrConfigFileSecondKindObject : configFileSecondKindlist) {
			sb
					.append("<secondKind id='"
							+ CurrConfigFileSecondKindObject.getSecondKindId()
							+ "'  name='"
							+ CurrConfigFileSecondKindObject
									.getSecondKindName() + "'>");
			sb.append("</secondKind>");
		}
		sb.append("</secondKinds>");
		System.out.println(sb.toString());
		ActionContext ctx = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse) ctx
				.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.write(sb.toString());
		pw.flush();
		pw.close();
	}

	public void doChangeSecondKind() throws Exception {
		System.out.println(configFileThirdKind.getFirstKindId()
				+ "-xxxxxxxxxxxxxxxxxx-"
				+ configFileThirdKind.getSecondKindId());
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstKindId", configFileThirdKind.getFirstKindId());
		map.put("secondkindId", configFileThirdKind.getSecondKindId());
		configFileThirdKindList = configFileThirdKindService
				.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);

		System.out.println("lllllllllllll-" + configFileThirdKindList.size());
		StringBuilder sb = new StringBuilder();
		sb.append("<thirdKinds>");
		for (ConfigFileThirdKind CurrConfigFileThirdKindsObject : configFileThirdKindList) {
			sb.append("<thirdKind id='"
					+ CurrConfigFileThirdKindsObject.getThirdKindId()
					+ "'  name='"
					+ CurrConfigFileThirdKindsObject.getThirdKindName() + "'>");
			sb.append("</thirdKind>");
		}
		sb.append("</thirdKinds>");
		System.out.println(sb.toString());
		ActionContext ctx = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse) ctx
				.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.write(sb.toString());
		pw.flush();
		pw.close();

	}

	public void doChangeMajorKind() throws Exception {
		System.out.println("====vv=======" + configMajor.getMajorKindId());
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("majorKindId", configMajor.getMajorKindId());
		configMajorList = configMajorService.getConfigMajorList(map);

		System.out.println("lllllllllllll-" + configMajorList.size());
		StringBuilder sb = new StringBuilder();
		sb.append("<ConfigMajors>");
		for (ConfigMajor CurrConfigMajorsObject : configMajorList) {
			sb.append("<configMajor id='" + CurrConfigMajorsObject.getMajorId()
					+ "'  name='" + CurrConfigMajorsObject.getMajorName()
					+ "'>");
			sb.append("</configMajor>");
		}
		sb.append("</ConfigMajors>");
		System.out.println(sb.toString());
		ActionContext ctx = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse) ctx
				.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.write(sb.toString());
		pw.flush();
		pw.close();
	}

	public void doChangMonery() throws Exception {
		System.out.println(salaryStandardDetails.getStandardId());
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("standard_id", salaryStandardDetails.getStandardId());
		//salaryStandardDetails = salaryStandardDetailsService.selectMoneyById(map);
		ActionContext act = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse) act.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);		
		System.out.println(salaryStandardDetails.getSalary());
		PrintWriter pw = response.getWriter();
		pw.write(salaryStandardDetails.getSalary() + "");
		pw.flush();
		pw.close();
	}

	// ******************************************

	
	public String selectIII() throws Exception {

		list = imajorChangeService.selectByIII();
		count = imajorChangeService.selectCount();
		return "success";

	}
	
	public String selectIII3() throws Exception {

		configfirstlist = configFileFirstKindService.selectIdName();
		
		return "success1";

	}
	
	public String selectIII4() throws Exception {

		configfirstlist = configFileFirstKindService.selectIdName();
		
		return "success3";

	}

	public String getSelectIII3() throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("first_kind_id", majorchange.getFirstKindId());
		map.put("second_kind_id", majorchange.getSecondKindId());
		map.put("third_kind_id", majorchange.getThirdKindId());
		map.put("start_regist_time", utilbean.getStartDate());
		map.put("end_regist_time", utilbean.getEndDate());
		humanFileWithBLOBs = humanFileService.getHuman_fileById(map);
		//System.out.println(humanFileWithBLOBs);
		return "success2";

	}
	
	public String selectById() throws Exception {

		configfirstlist = configFileFirstKindService.selectIdName();

		configMajorKindlist = configMajorKindService.getConfigMajorKindList();

		salaryStandardDetailslist = salaryStandardDetailsService.selectAll();
		
		majorchange = imajorChangeService.selectById(majorchange.getMchId());
	
		return "mcById";

	}
	
	public String selectHmById() throws Exception {

		System.out.println(humanFileWithBLOBs.getHufId());
		humanFileWithBLOBs = humanFileService.selectById(humanFileWithBLOBs.getHufId());
		System.out.println(humanFileWithBLOBs);
		return "hmById";

	}
	
	public String selectIdName() throws Exception {
		
		configfirstlist = configFileFirstKindService.selectIdName();
	
		return "selectIdName";
	}
	
	
	
	public ConfigFileSecondKind getConfigFileSecondKind() {
		return configFileSecondKind;
	}

	public void setConfigFileSecondKind(
			ConfigFileSecondKind configFileSecondKind) {
		this.configFileSecondKind = configFileSecondKind;
	}

	public List<ConfigMajorKind> getConfigMajorKindlist() {
		return configMajorKindlist;
	}

	public void setConfigMajorKindlist(List<ConfigMajorKind> configMajorKindlist) {
		this.configMajorKindlist = configMajorKindlist;
	}

	public IConfigMajorKindService getConfigMajorKindService() {
		return configMajorKindService;
	}

	public void setConfigMajorKindService(
			IConfigMajorKindService configMajorKindService) {
		this.configMajorKindService = configMajorKindService;
	}

	public IConfigFileFirstKindService getConfigFileFirstKindService() {
		return configFileFirstKindService;
	}

	public void setConfigFileFirstKindService(
			IConfigFileFirstKindService configFileFirstKindService) {
		this.configFileFirstKindService = configFileFirstKindService;
	}

	public MajorChangeWithBLOBs getMajorchange() {
		return majorchange;
	}

	public void setMajorchange(MajorChangeWithBLOBs majorchange) {
		this.majorchange = majorchange;
	}

	public IMajorChangeService getImajorChangeService() {
		return imajorChangeService;
	}

	public void setImajorChangeService(IMajorChangeService imajorChangeService) {
		this.imajorChangeService = imajorChangeService;
	}

	public void setList(List<MajorChange> list) {
		this.list = list;
	}

	public List<MajorChange> getList() {
		return list;
	}

	

	/*
	 * public void selectAjax () throws Exception {
	 * System.out.println("=============================");
	 * System.out.println("============================="
	 * +configFileSecondKind.getSecondKindId()); HashMap<String, Object> hs =
	 * new HashMap<String, Object>();
	 * hs.put("firstKindId",configFileSecondKind.getFirstKindId());
	 * configFileSecondKindlist =
	 * configFileSecondKindService.getConfigFileSecondKindByFirst_id(hs);
	 * StringBuilder sb = new StringBuilder(); sb.append("<secondKinds>"); for
	 * (ConfigFileSecondKind configFileSecondKinds : configFileSecondKindlist) {
	 * sb.append("<secondKid id='>"+configFileSecondKinds.getSecondKindId() +
	 * "' name=" +configFileSecondKinds.getSecondKindName() + " '>");
	 * sb.append("</secondKid>"); } sb.append("</secondKinds>");
	 * System.out.println(sb.toString()); ActionContext act =
	 * ActionContext.getContext(); HttpServletResponse response =
	 * (HttpServletResponse)
	 * act.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
	 * response.setContentType("text/xml;charset:utf-8"); PrintWriter ps =
	 * response.getWriter(); ps.write(sb.toString()); ps.flush(); ps.close(); }
	 */

	public List<ConfigFileFirstKindWithBLOBs> getConfigfirstlist() {
		return configfirstlist;
	}

	public void setConfigfirstlist(
			List<ConfigFileFirstKindWithBLOBs> configfirstlist) {
		this.configfirstlist = configfirstlist;
	}

	public IConfigFileSecondKindService getConfigFileSecondKindService() {
		return configFileSecondKindService;
	}

	public void setConfigFileSecondKindService(
			IConfigFileSecondKindService configFileSecondKindService) {
		this.configFileSecondKindService = configFileSecondKindService;
	}



	

	public void setConfigFileThirdKindService(
			ConfigFileThirdKindService configFileThirdKindService) {
		this.configFileThirdKindService = configFileThirdKindService;
	}

	public List<ConfigFileSecondKind> getConfigFileSecondKindlist() {
		return configFileSecondKindlist;
	}

	public void setConfigFileSecondKindlist(
			List<ConfigFileSecondKind> configFileSecondKindlist) {
		this.configFileSecondKindlist = configFileSecondKindlist;
	}

	public List<ConfigFileThirdKind> getConfigFileThirdKindList() {
		return configFileThirdKindList;
	}

	public void setConfigFileThirdKindList(
			List<ConfigFileThirdKind> configFileThirdKindList) {
		this.configFileThirdKindList = configFileThirdKindList;
	}

	public List<ConfigMajor> getConfigMajorList() {
		return configMajorList;
	}

	public void setConfigMajorList(List<ConfigMajor> configMajorList) {
		this.configMajorList = configMajorList;
	}

	public ConfigFileThirdKind getConfigFileThirdKind() {
		return configFileThirdKind;
	}

	public void setConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		this.configFileThirdKind = configFileThirdKind;
	}

	public ConfigMajor getConfigMajor() {
		return configMajor;
	}

	public void setConfigMajor(ConfigMajor configMajor) {
		this.configMajor = configMajor;
	}

	public ISalaryStandardDetailsService getSalaryStandardDetailsService() {
		return salaryStandardDetailsService;
	}

	public void setSalaryStandardDetailsService(
			ISalaryStandardDetailsService salaryStandardDetailsService) {
		this.salaryStandardDetailsService = salaryStandardDetailsService;
	}

	public List<SalaryStandardDetails> getSalaryStandardDetailslist() {
		return salaryStandardDetailslist;
	}

	public void setSalaryStandardDetailslist(
			List<SalaryStandardDetails> salaryStandardDetailslist) {
		this.salaryStandardDetailslist = salaryStandardDetailslist;
	}

	public SalaryStandardDetails getSalaryStandardDetails() {
		return salaryStandardDetails;
	}

	public void setSalaryStandardDetails(
			SalaryStandardDetails salaryStandardDetails) {
		this.salaryStandardDetails = salaryStandardDetails;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public IHumanFileService getHumanFileService() {
		return humanFileService;
	}

	public void setHumanFileService(IHumanFileService humanFileService) {
		this.humanFileService = humanFileService;
	}

	public HumanFileWithBLOBs getHumanFileWithBLOBs() {
		return humanFileWithBLOBs;
	}

	public void setHumanFileWithBLOBs(HumanFileWithBLOBs humanFileWithBLOBs) {
		this.humanFileWithBLOBs = humanFileWithBLOBs;
	}

	public UtilBean getUtilbean() {
		return utilbean;
	}

	public void setUtilbean(UtilBean utilbean) {
		this.utilbean = utilbean;
	}

	public IConfigMajorService getConfigMajorService() {
		return configMajorService;
	}

	public void setConfigMajorService(IConfigMajorService configMajorService) {
		this.configMajorService = configMajorService;
	}

	
	private ConfigFileThirdKind configFileThirdKind;
	public IConfigFileThirdKindService getConfigFileThirdKindService() {
		return configFileThirdKindService;
	}

	public void setConfigFileThirdKindService(
			IConfigFileThirdKindService configFileThirdKindService) {
		this.configFileThirdKindService = configFileThirdKindService;
	}


	
}

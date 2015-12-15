package com.hr.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.hr.biz.ConfigFileFirstKindService;
import com.hr.biz.ConfigFileSecondKindService;
import com.hr.biz.ConfigFileThirdKindService;
import com.hr.biz.imp.IConfigMajorDesignationService;
import com.hr.biz.imp.IConfigMajorKindService;
import com.hr.biz.imp.IConfigMajorService;
import com.hr.biz.imp.IConfigPublicCharService;
import com.hr.biz.imp.IHumanFileService;
import com.hr.biz.imp.ISalaryStandardService;
import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileThirdKind;
import com.hr.entity.ConfigMajor;
import com.hr.entity.ConfigMajorDesignation;
import com.hr.entity.ConfigMajorKind;
import com.hr.entity.ConfigPublicChar;
import com.hr.entity.HumanFile;
import com.hr.entity.HumanFileWithBLOBs;
import com.hr.entity.SalaryStandard;
import com.hr.util.GenerateCode;
import com.hr.util.PageModel;
import com.hr.util.UtilBean;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class HumanFileAction extends ActionSupport implements ModelDriven<HumanFile>{
	private HumanFileWithBLOBs humanFile;
	private UtilBean utilBean = new UtilBean();
	private File photo;
	private String photoFileName;
	private File attachment;
	private String attachmentFileName;
	
	
	private PageModel<HumanFileWithBLOBs> pageModel =new PageModel<HumanFileWithBLOBs>();
	private ConfigFileFirstKindService configFileFirstKindService;
	private ConfigFileSecondKindService configFileSecondKindService;
	private ConfigFileThirdKindService configFileThirdKindService;
	private IConfigMajorKindService    configMajorKindService;
	private IConfigMajorService configMajorService;
	private IConfigMajorDesignationService configMajorDesignationService;
	private IConfigPublicCharService configPublicCharService;
	private ISalaryStandardService salaryStandardService;
	private IHumanFileService  humanFileService;

	private List<ConfigFileFirstKind> configFileFirstKinds;
	private List<ConfigFileSecondKind> configFileSecondKinds;
	private List<ConfigFileThirdKind> configFileThirdKinds;
	private List<ConfigMajorKind>  configMajorKinds;
	private List<ConfigMajor>      configMajors;
	private List<ConfigMajorDesignation> configMajorDesignations;
	private List<ConfigPublicChar> configPublicCharByNationalitys;
	private List<ConfigPublicChar> configPublicCharByRaces;
	private List<ConfigPublicChar> configPublicCharByReligions;
	private List<ConfigPublicChar> configPublicCharByPartys;
	private List<ConfigPublicChar> configPublicCharByEducatedDegrees;
	private List<ConfigPublicChar> configPublicCharByEducatedYearss;
	private List<ConfigPublicChar> configPublicCharByEducatedMajors;
	//private List<ConfigPublicChar> configPublicCharByStandardIds;
	private List<ConfigPublicChar> configPublicCharBySpecialitys;
	private List<ConfigPublicChar> configPublicCharByHobbys;
	private List<SalaryStandard> salaryStandards;
	private List<HumanFile> humanFiles;
	
	private ConfigFileSecondKind configFileSecondKind;
	private ConfigFileThirdKind configFileThirdKind; 
	private ConfigFileFirstKind configFileFirstKind;
	private ConfigMajorKind configMajorKind;
	private ConfigMajor      configMajor;
	private ConfigMajorDesignation configMajorDesignation;
	
	
	
	
	/**
	 * 人力资源档案删除 --详细信息
	 * @return
	 * @throws Exception
	 */
	public String toDeleteListInformation() throws Exception{
		humanFile = humanFileService.getHumanFileWithBLOBAllByHumanID(humanFile.getHumanId());
		return "toDeleteListInformation";
	}
	
	
	
	public String doDeleteForeverList() throws Exception{
		int count = humanFileService.deleteByPrimaryHumanId(humanFile.getHumanId());
		if (count>0) return "doDeleteForeverList";
		return "";
	}
	/**
	 * 人力资源档案永久删除
	 * @return
	 * @throws Exception
	 */
	public String toDeleteForeverList() throws Exception{
		int currPage = 1;
		if (pageModel!=null && pageModel.getCurrPage()!=0) {
			currPage= pageModel.getCurrPage();
		}
		int pageSize = 2;
		if (pageModel!=null && pageModel.getMaxRecord()!=0) {
			pageSize = pageModel.getMaxRecord();
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("currPage", (currPage-1)*pageSize);
		map.put("pageSize", pageSize);
			System.out.println(humanFile);
		if (humanFile.getFirstKindId()!=null &&!humanFile.getFirstKindId().equals("") )map.put("firstKindId", humanFile.getFirstKindId());
		if (humanFile.getSecondKindId()!=null && !humanFile.getSecondKindId().equals("") )map.put("secondKindId", humanFile.getSecondKindId());
		if (humanFile.getThirdKindId()!=null && !humanFile.getThirdKindId().equals("") )map.put("thirdKindId", humanFile.getThirdKindId());
		if (humanFile.getHumanMajorKindId()!=null && !humanFile.getHumanMajorKindId().equals("") )map.put("humanMajorKindId", humanFile.getHumanMajorKindId());
		if (humanFile.getHumanMajorId()!=null && !humanFile.getHumanMajorId().equals(""))map.put("humanMajorId", humanFile.getHumanMajorId());
		if (utilBean.getStartDate()!=null) map.put("startDate", utilBean.getStartDate());
		if (utilBean.getEndDate()!=null) map.put("endDate", utilBean.getEndDate());
	    map.put("humanFileStatus", 1);
		pageModel = humanFileService.getHumanFileWithBLOBsForCondtionListPageModel(map);
		pageModel.setCurrPage(currPage);
		pageModel.setMaxRecord(pageSize);
		
		configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		configMajorKinds=configMajorKindService.getConfigMajorKindList();
		/*	HashMap<String, Object> map = new HashMap<String, Object>();*/
		//map.put("firstKindId", humanFile.getFirstKindId());
		configFileSecondKinds =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		map.put("secondkindId", humanFile.getSecondKindId());
		configFileThirdKinds = configFileThirdKindService.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	//System.out.println( "+put:"+humanFile.getHumanMajorKindId());
		map.put("majorKindId", humanFile.getHumanMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);
		
		
		return "toDeleteForeverList";
	}
	
	/**
	 * 人力资源档案恢复
	 * @return
	 * @throws Exception
	 */
	public String toRecoveryList() throws Exception{
		int currPage = 1;
		if (pageModel!=null && pageModel.getCurrPage()!=0) {
			currPage= pageModel.getCurrPage();
		}
		int pageSize = 2;
		if (pageModel!=null && pageModel.getMaxRecord()!=0) {
			pageSize = pageModel.getMaxRecord();
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("currPage", (currPage-1)*pageSize);
		map.put("pageSize", pageSize);
			System.out.println(humanFile);
		if (humanFile.getFirstKindId()!=null &&!humanFile.getFirstKindId().equals("") )map.put("firstKindId", humanFile.getFirstKindId());
		if (humanFile.getSecondKindId()!=null && !humanFile.getSecondKindId().equals("") )map.put("secondKindId", humanFile.getSecondKindId());
		if (humanFile.getThirdKindId()!=null && !humanFile.getThirdKindId().equals("") )map.put("thirdKindId", humanFile.getThirdKindId());
		if (humanFile.getHumanMajorKindId()!=null && !humanFile.getHumanMajorKindId().equals("") )map.put("humanMajorKindId", humanFile.getHumanMajorKindId());
		if (humanFile.getHumanMajorId()!=null && !humanFile.getHumanMajorId().equals(""))map.put("humanMajorId", humanFile.getHumanMajorId());
		if (utilBean.getStartDate()!=null) map.put("startDate", utilBean.getStartDate());
		if (utilBean.getEndDate()!=null) map.put("endDate", utilBean.getEndDate());
	    map.put("humanFileStatus", 3);
		pageModel = humanFileService.getHumanFileWithBLOBsForCondtionListPageModel(map);
		pageModel.setCurrPage(currPage);
		pageModel.setMaxRecord(pageSize);
		
		configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		configMajorKinds=configMajorKindService.getConfigMajorKindList();
		/*	HashMap<String, Object> map = new HashMap<String, Object>();*/
		//map.put("firstKindId", humanFile.getFirstKindId());
		configFileSecondKinds =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		map.put("secondkindId", humanFile.getSecondKindId());
		configFileThirdKinds = configFileThirdKindService.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	//System.out.println( "+put:"+humanFile.getHumanMajorKindId());
		map.put("majorKindId", humanFile.getHumanMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);
		
		
		return "toRecoveryList";
	}
	
	
	public String toRecoveryInformationList() throws Exception{
		humanFile = humanFileService.getHumanFileWithBLOBAllByHumanID(humanFile.getHumanId());
		return "toRecoveryInformationList";
	}
	public String doRecoveryInformationList() throws Exception{
			HumanFileWithBLOBs s = new HumanFileWithBLOBs();
			s.setHumanId(humanFile.getHumanId());
			s.setHumanFileStatus((short)1);
			humanFileService.updateByPrimaryKeySelective(s);
			return "doQueryListInformation";
	}
	
	/**
	 * 业务是：人力资源--人力资源档案管理--人力资源档案删除
	 * @return
	 * @throws Exception
	 */
	public String toDeleteList() throws Exception{
		int currPage = 1;
		if (pageModel!=null && pageModel.getCurrPage()!=0) {
			currPage= pageModel.getCurrPage();
		}
		int pageSize = 2;
		if (pageModel!=null && pageModel.getMaxRecord()!=0) {
			pageSize = pageModel.getMaxRecord();
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("currPage", (currPage-1)*pageSize);
		map.put("pageSize", pageSize);
			System.out.println(humanFile);
		if (humanFile.getFirstKindId()!=null &&!humanFile.getFirstKindId().equals("") )map.put("firstKindId", humanFile.getFirstKindId());
		if (humanFile.getSecondKindId()!=null && !humanFile.getSecondKindId().equals("") )map.put("secondKindId", humanFile.getSecondKindId());
		if (humanFile.getThirdKindId()!=null && !humanFile.getThirdKindId().equals("") )map.put("thirdKindId", humanFile.getThirdKindId());
		if (humanFile.getHumanMajorKindId()!=null && !humanFile.getHumanMajorKindId().equals("") )map.put("humanMajorKindId", humanFile.getHumanMajorKindId());
		if (humanFile.getHumanMajorId()!=null && !humanFile.getHumanMajorId().equals(""))map.put("humanMajorId", humanFile.getHumanMajorId());
		if (utilBean.getStartDate()!=null) map.put("startDate", utilBean.getStartDate());
		if (utilBean.getEndDate()!=null) map.put("endDate", utilBean.getEndDate());
	    map.put("humanFileStatus", 1);
		pageModel = humanFileService.getHumanFileWithBLOBsForCondtionListPageModel(map);
		pageModel.setCurrPage(currPage);
		pageModel.setMaxRecord(pageSize);
		
		configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		configMajorKinds=configMajorKindService.getConfigMajorKindList();
		/*	HashMap<String, Object> map = new HashMap<String, Object>();*/
		//map.put("firstKindId", humanFile.getFirstKindId());
		configFileSecondKinds =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		map.put("secondkindId", humanFile.getSecondKindId());
		configFileThirdKinds = configFileThirdKindService.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	//System.out.println( "+put:"+humanFile.getHumanMajorKindId());
		map.put("majorKindId", humanFile.getHumanMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);
		
		
		return "toDeleteList";
	}
	
	
	public String doQueryListInformation() throws Exception{
		HumanFileWithBLOBs s = new HumanFileWithBLOBs();
		s.setHumanId(humanFile.getHumanId());
		s.setHumanFileStatus((short)3);
		humanFileService.updateByPrimaryKeySelective(s);
		return "doQueryListInformation";
	}
	public String toQueryListInformation() throws Exception{
		humanFile = humanFileService.getHumanFileWithBLOBAllByHumanID(humanFile.getHumanId());
		return "toQueryListInformation";
	}
	

	public String toHumanCheck() throws Exception{
		System.out.println("=========>"+humanFile.getHumanId());
		//configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		//configMajorKinds=configMajorKindService.getConfigMajorKindList();
		configMajorDesignations=configMajorDesignationService.getConfigMajorDesignationList();
		configPublicCharByNationalitys=configPublicCharService.getConfigPublicCharByAttributeKind("国籍");
		configPublicCharByRaces=configPublicCharService.getConfigPublicCharByAttributeKind("民族");
		configPublicCharByReligions=configPublicCharService.getConfigPublicCharByAttributeKind("宗教信仰");
		configPublicCharByPartys=configPublicCharService.getConfigPublicCharByAttributeKind("政治面貌");
		configPublicCharByEducatedDegrees=configPublicCharService.getConfigPublicCharByAttributeKind("学历");
		configPublicCharByEducatedYearss=	configPublicCharService.getConfigPublicCharByAttributeKind("教育年限"); 
		configPublicCharByEducatedMajors =configPublicCharService.getConfigPublicCharByAttributeKind("专业");
		//configPublicCharByStandardIds=configPublicCharService.getConfigPublicCharByAttributeKind("薪酬标准");
		configPublicCharBySpecialitys=configPublicCharService.getConfigPublicCharByAttributeKind("特长");
		configPublicCharByHobbys=configPublicCharService.getConfigPublicCharByAttributeKind("爱好");
		salaryStandards=salaryStandardService.getSalaryStandardList();
		humanFile= humanFileService.getHumanFileWithBLOBAllByHumanID(humanFile.getHumanId());
		
		
		/*	HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstKindId", humanFile.getFirstKindId());
		configFileSecondKinds =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		map.put("secondkindId", humanFile.getSecondKindId());
		configFileThirdKinds = configFileThirdKindService.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	System.out.println( "+put:"+humanFile.getHumanMajorKindId());
		map.put("majorKindId", humanFile.getHumanMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);*/
		return "tohumanCheck";
	}
	
	
	//register_choose_picture.jsp
	
	public String doHumanCheck() throws Exception{
		Short hfs= 2;
		humanFile.setHumanFileStatus(hfs);
		System.out.println(humanFile);
		int count = humanFileService.updateByPrimaryKeySelective(humanFile);
		System.out.println("count:"+count);
		if (count>0) {
			return "dohumanCheck";
		}
		//toHumanCheck();
		return "reTohumanCheck";
		//return null;
	}
	
	
	
	
	
	
	
	
	public String toSevaRegiste() throws Exception{
		System.out.println("+++++++++++++++++++++++++++++++++++++====");
		System.out.println(humanFile);
		if (humanFile!=null) return "toSevaRegiste";
		return "toHumanRegister";
	}
	
	public String doChangeListIformation() throws Exception{
		System.out.println("doChangeListIformation==>"+humanFile);
		
		humanFileService.updateChangeListIformation(humanFile);
		return "doChangeListIformation";
	}
	
	
	public String toChangeListIformation() throws Exception{
		System.out.println("=========>"+humanFile.getHumanId());
		//configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		//configMajorKinds=configMajorKindService.getConfigMajorKindList();
		configMajorDesignations=configMajorDesignationService.getConfigMajorDesignationList();
		configPublicCharByNationalitys=configPublicCharService.getConfigPublicCharByAttributeKind("国籍");
		configPublicCharByRaces=configPublicCharService.getConfigPublicCharByAttributeKind("民族");
		configPublicCharByReligions=configPublicCharService.getConfigPublicCharByAttributeKind("宗教信仰");
		configPublicCharByPartys=configPublicCharService.getConfigPublicCharByAttributeKind("政治面貌");
		configPublicCharByEducatedDegrees=configPublicCharService.getConfigPublicCharByAttributeKind("学历");
		configPublicCharByEducatedYearss=	configPublicCharService.getConfigPublicCharByAttributeKind("教育年限"); 
		configPublicCharByEducatedMajors =configPublicCharService.getConfigPublicCharByAttributeKind("专业");
		//configPublicCharByStandardIds=configPublicCharService.getConfigPublicCharByAttributeKind("薪酬标准");
		configPublicCharBySpecialitys=configPublicCharService.getConfigPublicCharByAttributeKind("特长");
		configPublicCharByHobbys=configPublicCharService.getConfigPublicCharByAttributeKind("爱好");
		salaryStandards=salaryStandardService.getSalaryStandardList();
		humanFile= humanFileService.getHumanFileWithBLOBAllByHumanID(humanFile.getHumanId());
		
		
		/*	HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstKindId", humanFile.getFirstKindId());
		configFileSecondKinds =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		map.put("secondkindId", humanFile.getSecondKindId());
		configFileThirdKinds = configFileThirdKindService.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	System.out.println( "+put:"+humanFile.getHumanMajorKindId());
		map.put("majorKindId", humanFile.getHumanMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);*/
		return "toChangeListIformation";
	}
	
	
public String toChangeList() throws Exception{
		
		
		
		int currPage = 1;
		if (pageModel!=null && pageModel.getCurrPage()!=0) {
			currPage= pageModel.getCurrPage();
		}
		int pageSize = 2;
		if (pageModel!=null && pageModel.getMaxRecord()!=0) {
			pageSize = pageModel.getMaxRecord();
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("currPage", (currPage-1)*pageSize);
		map.put("pageSize", pageSize);
			System.out.println(humanFile);
		if (humanFile.getFirstKindId()!=null &&!humanFile.getFirstKindId().equals("") )map.put("firstKindId", humanFile.getFirstKindId());
		if (humanFile.getSecondKindId()!=null && !humanFile.getSecondKindId().equals("") )map.put("secondKindId", humanFile.getSecondKindId());
		if (humanFile.getThirdKindId()!=null && !humanFile.getThirdKindId().equals("") )map.put("thirdKindId", humanFile.getThirdKindId());
		if (humanFile.getHumanMajorKindId()!=null && !humanFile.getHumanMajorKindId().equals("") )map.put("humanMajorKindId", humanFile.getHumanMajorKindId());
		if (humanFile.getHumanMajorId()!=null && !humanFile.getHumanMajorId().equals(""))map.put("humanMajorId", humanFile.getHumanMajorId());
		if (utilBean.getStartDate()!=null) map.put("startDate", utilBean.getStartDate());
		if (utilBean.getEndDate()!=null) map.put("endDate", utilBean.getEndDate());
	    map.put("humanFileStatus", 1);
		pageModel = humanFileService.getHumanFileWithBLOBsForCondtionListPageModel(map);
		pageModel.setCurrPage(currPage);
		pageModel.setMaxRecord(pageSize);
		
		configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		configMajorKinds=configMajorKindService.getConfigMajorKindList();
		/*	HashMap<String, Object> map = new HashMap<String, Object>();*/
		//map.put("firstKindId", humanFile.getFirstKindId());
		configFileSecondKinds =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		map.put("secondkindId", humanFile.getSecondKindId());
		configFileThirdKinds = configFileThirdKindService.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	//System.out.println( "+put:"+humanFile.getHumanMajorKindId());
		map.put("majorKindId", humanFile.getHumanMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);
		
		
		return "toChangeList";
		
		
	}
	
	
	

	public String toQueryList() throws Exception{
		
		
		
		int currPage = 1;
		if (pageModel!=null && pageModel.getCurrPage()!=0) {
			currPage= pageModel.getCurrPage();
		}
		int pageSize = 2;
		if (pageModel!=null && pageModel.getMaxRecord()!=0) {
			pageSize = pageModel.getMaxRecord();
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("currPage", (currPage-1)*pageSize);
		map.put("pageSize", pageSize);
			System.out.println(humanFile);
		if (humanFile.getFirstKindId()!=null &&!humanFile.getFirstKindId().equals("") )map.put("firstKindId", humanFile.getFirstKindId());
		if (humanFile.getSecondKindId()!=null && !humanFile.getSecondKindId().equals("") )map.put("secondKindId", humanFile.getSecondKindId());
		if (humanFile.getThirdKindId()!=null && !humanFile.getThirdKindId().equals("") )map.put("thirdKindId", humanFile.getThirdKindId());
		if (humanFile.getHumanMajorKindId()!=null && !humanFile.getHumanMajorKindId().equals("") )map.put("humanMajorKindId", humanFile.getHumanMajorKindId());
		if (humanFile.getHumanMajorId()!=null && !humanFile.getHumanMajorId().equals(""))map.put("humanMajorId", humanFile.getHumanMajorId());
		if (utilBean.getStartDate()!=null) map.put("startDate", utilBean.getStartDate());
		if (utilBean.getEndDate()!=null) map.put("endDate", utilBean.getEndDate());
	    map.put("humanFileStatus", 1);
		pageModel = humanFileService.getHumanFileWithBLOBsForCondtionListPageModel(map);
		pageModel.setCurrPage(currPage);
		pageModel.setMaxRecord(pageSize);
		
		configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		configMajorKinds=configMajorKindService.getConfigMajorKindList();
		/*	HashMap<String, Object> map = new HashMap<String, Object>();*/
		//map.put("firstKindId", humanFile.getFirstKindId());
		configFileSecondKinds =  configFileSecondKindService.getConfigFileSecondKindByFirst_id(map);
		map.put("secondkindId", humanFile.getSecondKindId());
		configFileThirdKinds = configFileThirdKindService.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	//System.out.println( "+put:"+humanFile.getHumanMajorKindId());
		map.put("majorKindId", humanFile.getHumanMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);
		
		
		return "toQueryList";
		
		
	}
	
	
	
	public String toCheckList() throws Exception{
		/*System.out.println("============================>toCheckList");
		humanFiles=humanFileService.getHumanFilByHumanFileStatus("1");
			*/	 
		int currPage = 1;
		if (pageModel!=null && pageModel.getCurrPage()!=0) {
			currPage= pageModel.getCurrPage();
		}
		int pageSize = 2;
		if (pageModel!=null && pageModel.getMaxRecord()!=0) {
			pageSize = pageModel.getMaxRecord();
		}
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("currPage", (currPage-1)*pageSize);
		hm.put("pageSize", pageSize);
	    hm.put("humanFileStatus", 1);
		pageModel = humanFileService.getHumanFileWithBLOBsForCondtionListPageModel(hm);
		pageModel.setCurrPage(currPage);
		pageModel.setMaxRecord(pageSize);
		return "toCheckList";
		
		
	}
	
	public String doSevaRegiste() throws Exception{
		humanFile.setHumanId(humanFileService.getNewHumanId());
		humanFile.setHumanFileStatus(Short.valueOf("1"));
		int count = humanFileService.AddHumanFileWithBLOBs(humanFile);
		System.out.println("count="+count);
		if (count==1) {
			return "toSevaRegiste";
		}
		return "toHumanRegister";
	}
	
	
	
	
	private void uploadFile(String fileName , File file) throws Exception{
		FileOutputStream outputStream = null;
		FileInputStream inputStream = null;
		
		outputStream = new FileOutputStream(fileName);
		inputStream = new FileInputStream(file);
		//outputStream.write(inputStream.)
		int length = 0;
		byte[] bs = new byte[1024];
		while((length = inputStream.read(bs))>0){
			outputStream.write(bs,0,length);
		}
		outputStream.close();
		inputStream.close();
	}
	public String doSevaRegisteByImage() throws Exception{
		
		
		
		
		HumanFileWithBLOBs newHumanFile = new HumanFileWithBLOBs();
		newHumanFile.setHumanId(humanFile.getHumanId());
		String name = GenerateCode.getGenerateHumanNo();
		if(photo!=null){
			String phototype = photoFileName.substring(photoFileName.lastIndexOf(".")+1);
			String photoPath = ServletActionContext.getServletContext().getRealPath("/photo/"
					+ name+"." + phototype);
			uploadFile(photoPath,photo);
			newHumanFile.setHumanPicture(ServletActionContext.getRequest().getContextPath() + "/photo/"
					+ name+"." + phototype);
		}
		
		
		if(attachment!=null){
			String attachmenttype = attachmentFileName.substring(attachmentFileName.lastIndexOf(".")+1);
			String attachmentPath = ServletActionContext.getServletContext().getRealPath("/attachment/" + name+"." + attachmenttype);
			uploadFile(attachmentPath,attachment);
			newHumanFile.setAttachmentName( "/attachment/"
					+ name+"." + attachmenttype);
		}
		
	
		System.out.println(newHumanFile);
		
		int count = humanFileService.updateByPrimaryKeySelective(newHumanFile);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String jj=null;
		//1.创建文件上传的对象
		SmartUpload su = new SmartUpload();
		//设置一些相关属性
		su.setCharset("GBK");//编码
		//允许上传的文件大小
		su.setMaxFileSize(1024*1024*100);//100M
		//设置允许上传文件的类型;
		//后缀名:jpg,jpeg,gif,bmp,png
		su.setAllowedFilesList("jpg,jpeg,gif,bmp,png");
		
		//2.初始化;
		su.initialize(this.getServletConfig(), request, response);
		
		
		try{
			//3.开始文件上传
			su.upload();
			//4.获取表单提交的文件对象;
			Files files =  su.getFiles();
			File file = files.getFile(0);//获取第一个文件对象;
			
			
			//String fileName = file.getFileName();
			//对于文件自定义一个文件名;
			Date d = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			String fileName = sf.format(d);
			//获取原来的文件的扩展名
			String extName = file.getFileExt();
			System.out.println(fileName);
			
			//5.保存文件到服务器路径下;
			//如:E:\Tomcat 6.0\webapps\ebuy181\images\product
			//获取当前项目位于服务器中的路径
			String path = request.getRealPath("");
			path +="\\images\\product\\";
			
			System.out.println(path+fileName+"."+extName);
			String nametu=(fileName+"."+extName);
			System.out.println(nametu);
			//6.保存文件
			file.saveAs(path+fileName+"."+extName);
			jj=fileName+"."+extName;
		}catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("eorror.jsp");
		}
		
		
		request.setCharacterEncoding("UTF-8");	
		//获取表单中提交过来的所有的参数值;
		Request req = su.getRequest();
		//String pname = req.getParameter("productName");
		//System.out.println(pname);
		

			easybuy_product pp=new easybuy_product();
			pp.setEp_description(req.getParameter("Ep_description"));
			pp.setEp_file_name(jj);
			//pp.setEp_file_name("nametu");
			pp.setEp_name(req.getParameter("Ep_name"));
			pp.setEp_price(Integer.parseInt(req.getParameter("Ep_price")));
			pp.setEp_stock(req.getParameter("Ep_stock"));
			
			pp.setEpc_child_id(Integer.parseInt(req.getParameter("subId")));
			pp.setEpc_id(Integer.parseInt(req.getParameter("parentId")));
			
			productClassDao pr=new productClassDao();
			int row=pr.addpp(pp);
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			
			if(row>0){
				out.println("<script>alert('添加成功');location.href='productClassServlet'</script>");
			}else{
				out.print("<script>alert('添加失败');</scipt>");
			}
*/
		
		///--------------------------------
		
	/*	System.out.println(humanFile);
		int count = humanFileService.AddHumanFileWithBLOBs(humanFile);*/
		System.out.println("count="+count);
		return "doSevaRegisteByImage";
	}
	
	
	
	
	
	public String getInittoHumanRegister()throws Exception{
		configFileFirstKinds = configFileFirstKindService.getConfigFileFirstKindList();
		configMajorKinds=configMajorKindService.getConfigMajorKindList();
		configMajorDesignations=configMajorDesignationService.getConfigMajorDesignationList();
		configPublicCharByNationalitys=configPublicCharService.getConfigPublicCharByAttributeKind("国籍");
		configPublicCharByRaces=configPublicCharService.getConfigPublicCharByAttributeKind("民族");
		configPublicCharByReligions=configPublicCharService.getConfigPublicCharByAttributeKind("宗教信仰");
		configPublicCharByPartys=configPublicCharService.getConfigPublicCharByAttributeKind("政治面貌");
		configPublicCharByEducatedDegrees=configPublicCharService.getConfigPublicCharByAttributeKind("学历");
		configPublicCharByEducatedYearss=	configPublicCharService.getConfigPublicCharByAttributeKind("教育年限"); 
		configPublicCharByEducatedMajors =configPublicCharService.getConfigPublicCharByAttributeKind("专业");
		//configPublicCharByStandardIds=configPublicCharService.getConfigPublicCharByAttributeKind("薪酬标准");
		configPublicCharBySpecialitys=configPublicCharService.getConfigPublicCharByAttributeKind("特长");
		configPublicCharByHobbys=configPublicCharService.getConfigPublicCharByAttributeKind("爱好");
		salaryStandards=salaryStandardService.getSalaryStandardList();
		
		
		System.out.println("=========="+configFileFirstKinds.size()+"  "+configMajorKinds.size());
		return "toHumanRegister";
	}
	
	
	
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
	
	
	public void doChangeMajorKind() throws Exception{
		System.out.println("====vv======="+configMajor.getMajorKindId());
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("majorKindId", configMajor.getMajorKindId());
		configMajors = configMajorService.getConfigMajorList(map);
		
		System.out.println("lllllllllllll-"+configMajors.size());
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//********get or set
	
	public void setConfigMajorDesignationService(
			IConfigMajorDesignationService configMajorDesignationService) {
		this.configMajorDesignationService = configMajorDesignationService;
	}







	public List<HumanFile> getHumanFiles() {
		return humanFiles;
	}




	public void setHumanFiles(List<HumanFile> humanFiles) {
		this.humanFiles = humanFiles;
	}




	public ISalaryStandardService getSalaryStandardService() {
		return salaryStandardService;
	}



	public void setSalaryStandardService(
			ISalaryStandardService salaryStandardService) {
		this.salaryStandardService = salaryStandardService;
	}



	public List<SalaryStandard> getSalaryStandards() {
		return salaryStandards;
	}



	public void setSalaryStandards(List<SalaryStandard> salaryStandards) {
		this.salaryStandards = salaryStandards;
	}



	public List<ConfigPublicChar> getConfigPublicCharByEducatedDegrees() {
		return configPublicCharByEducatedDegrees;
	}



	public void setConfigPublicCharByEducatedDegrees(
			List<ConfigPublicChar> configPublicCharByEducatedDegrees) {
		this.configPublicCharByEducatedDegrees = configPublicCharByEducatedDegrees;
	}



	public List<ConfigPublicChar> getConfigPublicCharByEducatedYearss() {
		return configPublicCharByEducatedYearss;
	}



	public void setConfigPublicCharByEducatedYearss(
			List<ConfigPublicChar> configPublicCharByEducatedYearss) {
		this.configPublicCharByEducatedYearss = configPublicCharByEducatedYearss;
	}



	public List<ConfigPublicChar> getConfigPublicCharByEducatedMajors() {
		return configPublicCharByEducatedMajors;
	}



	public void setConfigPublicCharByEducatedMajors(
			List<ConfigPublicChar> configPublicCharByEducatedMajors) {
		this.configPublicCharByEducatedMajors = configPublicCharByEducatedMajors;
	}



	/*public List<ConfigPublicChar> getConfigPublicCharByStandardIds() {
		return configPublicCharByStandardIds;
	}



	public void setConfigPublicCharByStandardIds(
			List<ConfigPublicChar> configPublicCharByStandardIds) {
		this.configPublicCharByStandardIds = configPublicCharByStandardIds;
	}*/



	public List<ConfigPublicChar> getConfigPublicCharBySpecialitys() {
		return configPublicCharBySpecialitys;
	}



	public void setConfigPublicCharBySpecialitys(
			List<ConfigPublicChar> configPublicCharBySpecialitys) {
		this.configPublicCharBySpecialitys = configPublicCharBySpecialitys;
	}



	public List<ConfigPublicChar> getConfigPublicCharByHobbys() {
		return configPublicCharByHobbys;
	}



	public void setConfigPublicCharByHobbys(
			List<ConfigPublicChar> configPublicCharByHobbys) {
		this.configPublicCharByHobbys = configPublicCharByHobbys;
	}



	public List<ConfigPublicChar> getConfigPublicCharByNationalitys() {
		return configPublicCharByNationalitys;
	}



	public void setConfigPublicCharByNationalitys(
			List<ConfigPublicChar> configPublicCharByNationalitys) {
		this.configPublicCharByNationalitys = configPublicCharByNationalitys;
	}



	public List<ConfigPublicChar> getConfigPublicCharByRaces() {
		return configPublicCharByRaces;
	}



	public void setConfigPublicCharByRaces(
			List<ConfigPublicChar> configPublicCharByRaces) {
		this.configPublicCharByRaces = configPublicCharByRaces;
	}



	public List<ConfigPublicChar> getConfigPublicCharByReligions() {
		return configPublicCharByReligions;
	}



	public void setConfigPublicCharByReligions(
			List<ConfigPublicChar> configPublicCharByReligions) {
		this.configPublicCharByReligions = configPublicCharByReligions;
	}



	public List<ConfigPublicChar> getConfigPublicCharByPartys() {
		return configPublicCharByPartys;
	}



	public void setConfigPublicCharByPartys(
			List<ConfigPublicChar> configPublicCharByPartys) {
		this.configPublicCharByPartys = configPublicCharByPartys;
	}



	public IConfigPublicCharService getConfigPublicCharService() {
		return configPublicCharService;
	}

	public void setConfigPublicCharService(
			IConfigPublicCharService configPublicCharService) {
		this.configPublicCharService = configPublicCharService;
	}

	public IConfigMajorService getConfigMajorService() {
		return configMajorService;
	}
	public List<ConfigMajor> getConfigMajors() {
		return configMajors;
	}

	public void setConfigMajors(List<ConfigMajor> configMajors) {
		this.configMajors = configMajors;
	}

	public List<ConfigMajorDesignation> getConfigMajorDesignations() {
		return configMajorDesignations;
	}

	public void setConfigMajorDesignations(
			List<ConfigMajorDesignation> configMajorDesignations) {
		this.configMajorDesignations = configMajorDesignations;
	}

	public ConfigMajorKind getConfigMajorKind() {
		return configMajorKind;
	}

	public void setConfigMajorKind(ConfigMajorKind configMajorKind) {
		this.configMajorKind = configMajorKind;
	}

	public ConfigMajor getConfigMajor() {
		return configMajor;
	}

	public void setConfigMajor(ConfigMajor configMajor) {
		this.configMajor = configMajor;
	}

	public ConfigMajorDesignation getConfigMajorDesignation() {
		return configMajorDesignation;
	}

	public void setConfigMajorDesignation(
			ConfigMajorDesignation configMajorDesignation) {
		this.configMajorDesignation = configMajorDesignation;
	}

	public HumanFile getHumanFile() {
		return humanFile;
	}

	public ConfigFileFirstKindService getConfigFileFirstKindService() {
		return configFileFirstKindService;
	}

	public ConfigFileSecondKindService getConfigFileSecondKindService() {
		return configFileSecondKindService;
	}

	public ConfigFileThirdKindService getConfigFileThirdKindService() {
		return configFileThirdKindService;
	}

	public IConfigMajorKindService getConfigMajorKindService() {
		return configMajorKindService;
	}

	public IConfigMajorDesignationService getConfigMajorDesignationService() {
		return configMajorDesignationService;
	}

	public ConfigFileSecondKind getConfigFileSecondKind() {
		return configFileSecondKind;
	}

	public ConfigFileThirdKind getConfigFileThirdKind() {
		return configFileThirdKind;
	}

	public ConfigFileFirstKind getConfigFileFirstKind() {
		return configFileFirstKind;
	}

	public void setConfigMajorService(IConfigMajorService configMajorService) {
		this.configMajorService = configMajorService;
	}
	public List<ConfigMajorKind> getConfigMajorKinds() {
		return configMajorKinds;
	}

/*	public void setHumanFile(HumanFile humanFile) {
		this.humanFile = humanFile;
	}*/
	public void setConfigMajorKinds(List<ConfigMajorKind> configMajorKinds) {
		this.configMajorKinds = configMajorKinds;
	}
	public void setConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind) {
		this.configFileFirstKind = configFileFirstKind;
	}
	public void setConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind) {
		this.configFileSecondKind = configFileSecondKind;
	}
	public void setConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		this.configFileThirdKind = configFileThirdKind;
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
/*	public HumanFile getModel() {
		if(humanFile==null) humanFile = new HumanFile(); 
		return humanFile;
	}*/
	public void setConfigFileFirstKindService(
			ConfigFileFirstKindService configFileFirstKindService) {
		this.configFileFirstKindService = configFileFirstKindService;
	}
	public void setConfigFileSecondKindService(
			ConfigFileSecondKindService configFileSecondKindService) {
		this.configFileSecondKindService = configFileSecondKindService;
	}
	public void setConfigFileThirdKindService(
			ConfigFileThirdKindService configFileThirdKindService) {
		this.configFileThirdKindService = configFileThirdKindService;
	}
	
	
	public void setConfigMajorKindService(
			IConfigMajorKindService configMajorKindService) {
		this.configMajorKindService = configMajorKindService;
	}
	//***********





	public void setHumanFile(HumanFileWithBLOBs humanFile) {
		this.humanFile = humanFile;
	}





	public IHumanFileService getHumanFileService() {
		return humanFileService;
	}





	public void setHumanFileService(IHumanFileService humanFileService) {
		this.humanFileService = humanFileService;
	}





	public HumanFile getModel() {
		// TODO Auto-generated method stub
		if(humanFile==null)humanFile = new HumanFileWithBLOBs();
		return humanFile;
	}


	



	


	public File getPhoto() {
		return photo;
	}



	public void setPhoto(File photo) {
		this.photo = photo;
	}



	public String getPhotoFileName() {
		return photoFileName;
	}



	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}



	public File getAttachment() {
		return attachment;
	}



	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}



	public String getAttachmentFileName() {
		return attachmentFileName;
	}



	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName;
	}



	public UtilBean getUtilBean() {
		return utilBean;
	}


	public void setUtilBean(UtilBean utilBean) {
		this.utilBean = utilBean;
	}


	public PageModel<HumanFileWithBLOBs> getPageModel() {
		return pageModel;
	}


	public void setPageModel(PageModel<HumanFileWithBLOBs> pageModel) {
		this.pageModel = pageModel;
	}
	
}

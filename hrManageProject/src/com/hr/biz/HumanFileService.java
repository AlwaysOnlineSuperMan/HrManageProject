package com.hr.biz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.BeanUtils;



import com.hr.biz.imp.IHumanFileService;
import com.hr.dao.HumanFileDAO;
import com.hr.dao.mapper.HumanFileDigMapper;
import com.hr.dao.mapper.HumanFileMapper;
import com.hr.entity.HumanFile;
import com.hr.entity.HumanFileDigWithBLOBs;
import com.hr.entity.HumanFileWithBLOBs;
import com.hr.util.PageModel;
import com.hr.util.UtilBean;
import com.sun.org.apache.commons.collections.BagUtils;

public class HumanFileService implements IHumanFileService {
	private HumanFileMapper humanFileDao;
	private HumanFileDigMapper  humanFileDigDao;


	public void setHumanFileDao(HumanFileMapper humanFileDao) {
		this.humanFileDao = humanFileDao;
	}


	

	public void setHumanFileDigDao(HumanFileDigMapper humanFileDigDao) {
		this.humanFileDigDao = humanFileDigDao;
	}




	public int AddHumanFileWithBLOBs(HumanFileWithBLOBs record)
			throws Exception {
		// TODO Auto-generated method stub
		return humanFileDao.insert(record);
	}

	public  List<HumanFile> getHumanFileWithBLOBAllList() throws Exception {
		// TODO Auto-generated method stub
		return humanFileDao.getHumanFileWithBLOBAllList();
	}




	public String getNewHumanId() throws Exception {
		SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyyMMdd");
		Long millis = System.currentTimeMillis();
		String sj = simpleDateFormat.format(new Date(millis));
		String MaxCustNo=humanFileDao.getMaxHumanId();
		String maxSj=MaxCustNo.substring(2, 10);
		String newCustNo = "HF";
		System.out.println("MaxCustNo="+MaxCustNo);
		//KH201412050001
		//20141205
		if (sj.equalsIgnoreCase(maxSj)&&maxSj!=null) {
			System.out.println("1"+MaxCustNo.substring(10,14));
			int number=Integer.parseInt(("1"+MaxCustNo.substring(10,14)).trim())+1;
			String str =number+"";
			newCustNo+=sj+str.substring(1,5);
		}else{
			newCustNo+=sj+"0001";
		}
		System.out.println(newCustNo);
		return newCustNo;
	}







	public HumanFileWithBLOBs getHumanFileWithBLOBAllByHumanID(String HumanId)
			throws Exception {
		// TODO Auto-generated method stub
		return humanFileDao.getHumanFileWithBLOBAllByHumanID(HumanId);
	}


	public int updateByPrimaryKeySelective(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		return humanFileDao.updateByPrimaryKeySelective(record);
	}


	public List<HumanFile> getHumanFilByHumanFileStatus(String humanFileStatus)
			throws Exception {
		// TODO Auto-generated method stub
		return humanFileDao.getHumanFilByHumanFileStatus(humanFileStatus);
	}


	public PageModel<HumanFileWithBLOBs> getHumanFileWithBLOBsForCondtionListPageModel(
			HashMap hm) {
		// TODO Auto-generated method stub
		return humanFileDao.getHumanFileWithBLOBsForCondtionListPageModel(hm);
	}


	public int deleteByPrimaryHumanId(String humanId) throws Exception {
		// TODO Auto-generated method stub
		return humanFileDao.deleteByPrimaryHumanId(humanId);
	}


	public int updateChangeListIformation(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		int count =0;
		int count1 = humanFileDao.updateByPrimaryKeySelective(record);
		int count2 = humanFileDao.insertToHumanFileDigWithBLOBs(record);
		if (count2>0 && count1>0) {
			count=1;
		}
			
		return count;
	}


	public HumanFileWithBLOBs getHuman_fileById(HashMap hsp) throws Exception {
		return humanFileDao.getHuman_fileById(hsp);
	}


	public HumanFileWithBLOBs selectById(int id) throws Exception {
		// TODO Auto-generated method stub
		return humanFileDao.selectById(id);
	}
	
	
}

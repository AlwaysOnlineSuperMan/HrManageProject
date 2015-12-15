package com.hr.biz.imp;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.HumanFile;
import com.hr.entity.HumanFileWithBLOBs;
import com.hr.util.PageModel;

public interface IHumanFileService {
	public abstract int AddHumanFileWithBLOBs(HumanFileWithBLOBs record) throws Exception;
	public abstract  List<HumanFile> getHumanFileWithBLOBAllList() throws Exception;
	public String getNewHumanId() throws Exception;
	 public abstract HumanFileWithBLOBs getHumanFileWithBLOBAllByHumanID(String HumanId
		) throws Exception ;
	 
		public int updateByPrimaryKeySelective(HumanFileWithBLOBs record) ;
		public List<HumanFile> getHumanFilByHumanFileStatus(String humanFileStatus) throws Exception ;
		public abstract PageModel<HumanFileWithBLOBs> getHumanFileWithBLOBsForCondtionListPageModel(HashMap hm);
		public abstract int deleteByPrimaryHumanId(String humanId)  throws Exception ;
		public int updateChangeListIformation(HumanFileWithBLOBs record) ;
		
		public abstract HumanFileWithBLOBs getHuman_fileById(HashMap hsp)throws Exception;
		
		public HumanFileWithBLOBs selectById(int id) throws Exception;
}
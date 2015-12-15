package com.hr.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.HumanFile;
import com.hr.entity.HumanFileWithBLOBs;
import com.hr.util.PageModel;

public interface HumanFileMapper {
    int deleteByPrimaryKey(Short hufId);

    int insert(HumanFileWithBLOBs record);

    int insertSelective(HumanFileWithBLOBs record);

    HumanFileWithBLOBs selectByPrimaryKey(Short hufId);

    int updateByPrimaryKeySelective(HumanFileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HumanFileWithBLOBs record);

    int updateByPrimaryKey(HumanFile record);
    
    public abstract List<HumanFile> getHumanFileWithBLOBAllList() throws Exception;
    
    public abstract String getMaxHumanId() throws Exception;
    public abstract HumanFileWithBLOBs getHumanFileWithBLOBAllByHumanID(String HumanId
	) throws Exception ;
	public List<HumanFile> getHumanFilByHumanFileStatus(String humanFileStatus) throws Exception ;
	public abstract PageModel<HumanFileWithBLOBs> getHumanFileWithBLOBsForCondtionListPageModel(HashMap hm);
	public abstract int deleteByPrimaryHumanId(String humanId)  throws Exception ;
	public abstract int insertToHumanFileDigWithBLOBs(HumanFileWithBLOBs record) ;
	
	public abstract HumanFileWithBLOBs getHuman_fileById(HashMap hsp)throws Exception;
	
	public abstract HumanFileWithBLOBs selectById(int id) throws Exception;
	
}
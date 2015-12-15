package com.hr.biz.imp;

import java.util.List;

import com.hr.entity.MajorChange;
import com.hr.entity.MajorChangeWithBLOBs;

public interface IMajorChangeService {

	public abstract List<MajorChange> selectByIII() throws Exception;

	public abstract MajorChangeWithBLOBs selectById(int id) throws Exception;

	public abstract int selectCount() throws Exception;
}
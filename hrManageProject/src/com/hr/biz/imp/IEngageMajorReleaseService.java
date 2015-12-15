package com.hr.biz.imp;

import java.util.List;

import com.hr.entity.EngageMajorReleaseWithBLOBs;

public interface IEngageMajorReleaseService {

	//职位发布登记
	public abstract int AddEngageMajorRelease(EngageMajorReleaseWithBLOBs record);
	//职位发布变更
	public abstract List<EngageMajorReleaseWithBLOBs> selectAllEngageMajor() throws Exception;
	//修改
	public abstract int UpdateEngageMajor(EngageMajorReleaseWithBLOBs record);
}
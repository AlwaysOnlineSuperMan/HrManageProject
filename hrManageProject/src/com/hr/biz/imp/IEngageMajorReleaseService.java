package com.hr.biz.imp;

import java.util.List;

import com.hr.entity.EngageMajorReleaseWithBLOBs;

public interface IEngageMajorReleaseService {

	//ְλ�����Ǽ�
	public abstract int AddEngageMajorRelease(EngageMajorReleaseWithBLOBs record);
	//ְλ�������
	public abstract List<EngageMajorReleaseWithBLOBs> selectAllEngageMajor() throws Exception;
	//�޸�
	public abstract int UpdateEngageMajor(EngageMajorReleaseWithBLOBs record);
}
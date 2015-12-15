package com.hr.biz;

import java.util.List;

import com.hr.biz.imp.IEngageMajorReleaseService;
import com.hr.dao.EngageMajorReleaseDao;
import com.hr.entity.ConfigMajorKind;
import com.hr.entity.EngageMajorReleaseWithBLOBs;
import com.hr.entity.HumanFileWithBLOBs;

public class EngageMajorReleaseService implements IEngageMajorReleaseService {
	private EngageMajorReleaseDao engageMajorReleasedao;
	
	public void setEngageMajorReleasedao(EngageMajorReleaseDao engageMajorReleasedao) {
		this.engageMajorReleasedao = engageMajorReleasedao;
	}
	//职位发布登记
	/* (non-Javadoc)
	 * @see com.hr.biz.IEngageMajorReleaseService#addEngageMajorRelease(com.hr.entity.EngageMajorReleaseWithBLOBs)
	 */
	public int AddEngageMajorRelease(EngageMajorReleaseWithBLOBs record) {
		return engageMajorReleasedao.insert(record);
	}
	public List<EngageMajorReleaseWithBLOBs> selectAllEngageMajor() throws Exception{
		return engageMajorReleasedao.selectAll();
	}
	public int UpdateEngageMajor(EngageMajorReleaseWithBLOBs record) {
		return engageMajorReleasedao.updateByPrimaryKeyWithBLOBs(record);
	}
}

package com.hr.action;

import com.hr.entity.EngageMajorReleaseWithBLOBs;
import com.opensymphony.xwork2.ModelDriven;

public class EngageResumeAction implements ModelDriven<EngageMajorReleaseWithBLOBs> {
	private EngageMajorReleaseWithBLOBs engageMajorRelease;
	public EngageMajorReleaseWithBLOBs getModel() {
		if(engageMajorRelease==null) engageMajorRelease = new EngageMajorReleaseWithBLOBs();
		return engageMajorRelease;
	}
}

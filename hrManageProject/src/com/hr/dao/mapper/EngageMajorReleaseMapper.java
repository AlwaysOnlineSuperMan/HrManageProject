package com.hr.dao.mapper;
import java.util.List;

import com.hr.entity.EngageMajorRelease;
import com.hr.entity.EngageMajorReleaseWithBLOBs;

public interface EngageMajorReleaseMapper {
    int deleteByPrimaryKey(Short mreId);

    int insert(EngageMajorReleaseWithBLOBs record);

    int insertSelective(EngageMajorReleaseWithBLOBs record);

    EngageMajorReleaseWithBLOBs selectByPrimaryKey(Short mreId);

    int updateByPrimaryKeySelective(EngageMajorReleaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageMajorReleaseWithBLOBs record);

    int updateByPrimaryKey(EngageMajorRelease record);
    
    public List<EngageMajorReleaseWithBLOBs> selectAll()throws Exception;
}
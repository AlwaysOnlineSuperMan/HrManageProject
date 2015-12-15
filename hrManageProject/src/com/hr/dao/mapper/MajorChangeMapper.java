package com.hr.dao.mapper;

import java.util.List;

import com.hr.entity.MajorChange;
import com.hr.entity.MajorChangeWithBLOBs;

public interface MajorChangeMapper {
    int deleteByPrimaryKey(Short mchId);

    int insert(MajorChangeWithBLOBs record);

    int insertSelective(MajorChangeWithBLOBs record);

    MajorChangeWithBLOBs selectByPrimaryKey(Short mchId);

    int updateByPrimaryKeySelective(MajorChangeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MajorChangeWithBLOBs record);

    int updateByPrimaryKey(MajorChange record);
    
    ///---
    public abstract List<MajorChange> selectByIII () throws Exception;

    public abstract MajorChangeWithBLOBs selectById (int id) throws Exception;
    
    public abstract int selectCount () throws Exception;
}
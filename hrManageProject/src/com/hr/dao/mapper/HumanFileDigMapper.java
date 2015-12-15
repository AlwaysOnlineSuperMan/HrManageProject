package com.hr.dao.mapper;

import com.hr.entity.HumanFileDig;
import com.hr.entity.HumanFileDigWithBLOBs;
import com.hr.entity.HumanFileWithBLOBs;

public interface HumanFileDigMapper {
    int deleteByPrimaryKey(Short hfdId);

    int insert(HumanFileDigWithBLOBs record);

    int insertSelective(HumanFileDigWithBLOBs record);
    int insertSelectiveforHumanFileWithBLOBs(HumanFileWithBLOBs record);
    HumanFileDigWithBLOBs selectByPrimaryKey(Short hfdId);

    int updateByPrimaryKeySelective(HumanFileDigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HumanFileDigWithBLOBs record);

    int updateByPrimaryKey(HumanFileDig record);
}
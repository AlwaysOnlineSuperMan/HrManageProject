package com.hr.biz.imp;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigPublicChar;

public interface IConfigPublicCharService {
	public abstract List<ConfigPublicChar> getConfigPublicCharByAttributeKind(String attributeKind)throws Exception;
	public abstract List<ConfigPublicChar> getConfigPublicCharByListAll ()throws Exception ;
	public abstract int insertSelective(ConfigPublicChar record) ;
}
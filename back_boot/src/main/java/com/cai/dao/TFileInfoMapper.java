package com.cai.dao;

import com.cai.model.TFileInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TFileInfoMapper {
	
    int deleteByPrimaryKey(String id);

    int insert(TFileInfo record);

    int insertSelective(TFileInfo record);

    TFileInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TFileInfo record);

    int updateByPrimaryKey(TFileInfo record);

	List<TFileInfo> selectFileByParams(TFileInfo fileInfo);
	
	List<TFileInfo> selectFileList(TFileInfo fileInfo);

}
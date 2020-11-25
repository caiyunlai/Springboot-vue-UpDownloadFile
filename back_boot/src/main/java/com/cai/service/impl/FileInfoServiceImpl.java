package com.cai.service.impl;

import com.cai.util.SnowflakeIdWorker;
import com.cai.dao.TFileInfoMapper;
import com.cai.model.TFileInfo;
import com.cai.service.FileInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件处理类
 * @author caiyunlai
 *
 */
@Service
public class FileInfoServiceImpl implements FileInfoService {

	@Resource
	TFileInfoMapper tFileInfoMapper;
	
    @Override
    public int addFileInfo(TFileInfo fileInfo) {
    	fileInfo.setId(SnowflakeIdWorker.getUUID()+SnowflakeIdWorker.getUUID());
        return tFileInfoMapper.insertSelective(fileInfo);
    }
    
    @Override
    public List<TFileInfo> selectFileByParams(TFileInfo fileInfo) {
        return tFileInfoMapper.selectFileByParams(fileInfo);
    }
    
    @Override
	public List<TFileInfo> selectFileList(TFileInfo file) {
		return tFileInfoMapper.selectFileList(file);
	}

	@Override
	public int deleteFile(TFileInfo tFileInfo) {
		TFileInfo t = new TFileInfo();
		t.setId(tFileInfo.getId());
		t.setDelFlag("1");
		return tFileInfoMapper.updateByPrimaryKeySelective(t);
	}
}

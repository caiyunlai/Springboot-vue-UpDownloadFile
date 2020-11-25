package com.cai.service.impl;

import com.cai.util.SnowflakeIdWorker;
import com.cai.dao.TChunkInfoMapper;
import com.cai.model.TChunkInfo;
import com.cai.service.ChunkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class ChunkServiceImpl implements ChunkService {

	@Resource
	TChunkInfoMapper tChunkInfoMapper;
	
    @Override
    public int saveChunk(TChunkInfo chunk) {
    	chunk.setId(SnowflakeIdWorker.getUUID()+SnowflakeIdWorker.getUUID());
    	return tChunkInfoMapper.insertSelective(chunk);
    }

    @Override
    public ArrayList<Integer> checkChunk(TChunkInfo chunk) {
    	return tChunkInfoMapper.selectChunkNumbers(chunk);
    }

	@Override
	public boolean checkChunk(String identifier, Integer chunkNumber) {
		return false;
	}

}

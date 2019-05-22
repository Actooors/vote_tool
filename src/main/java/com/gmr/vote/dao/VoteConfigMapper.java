package com.gmr.vote.dao;

import com.gmr.vote.model.entity.VoteConfig;
import com.gmr.vote.model.entity.VoteConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteConfigMapper {
    int countByExample(VoteConfigExample example);

    int deleteByExample(VoteConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VoteConfig record);

    int insertSelective(VoteConfig record);

    List<VoteConfig> selectByExample(VoteConfigExample example);

    VoteConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VoteConfig record, @Param("example") VoteConfigExample example);

    int updateByExample(@Param("record") VoteConfig record, @Param("example") VoteConfigExample example);

    int updateByPrimaryKeySelective(VoteConfig record);

    int updateByPrimaryKey(VoteConfig record);
}
package com.gmr.vote.dao;

import com.gmr.vote.model.entity.VoteNumber;
import com.gmr.vote.model.entity.VoteNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteNumberMapper {
    int countByExample(VoteNumberExample example);

    int deleteByExample(VoteNumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VoteNumber record);

    int insertSelective(VoteNumber record);

    List<VoteNumber> selectByExample(VoteNumberExample example);

    VoteNumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VoteNumber record, @Param("example") VoteNumberExample example);

    int updateByExample(@Param("record") VoteNumber record, @Param("example") VoteNumberExample example);

    int updateByPrimaryKeySelective(VoteNumber record);

    int updateByPrimaryKey(VoteNumber record);
}
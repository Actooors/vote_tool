package com.gmr.vote.dao;

import com.gmr.vote.model.entity.Candidate;
import com.gmr.vote.model.entity.CandidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidateMapper {
    int countByExample(CandidateExample example);

    int deleteByExample(CandidateExample example);

    int deleteByPrimaryKey(String candidateName);

    int insert(Candidate record);

    int insertSelective(Candidate record);

    List<Candidate> selectByExample(CandidateExample example);

    Candidate selectByPrimaryKey(String candidateName);

    int updateByExampleSelective(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByExample(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByPrimaryKeySelective(Candidate record);

    int updateByPrimaryKey(Candidate record);
}
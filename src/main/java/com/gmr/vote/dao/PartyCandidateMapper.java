package com.gmr.vote.dao;

import com.gmr.vote.model.entity.PartyCandidate;
import com.gmr.vote.model.entity.PartyCandidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyCandidateMapper {
    int countByExample(PartyCandidateExample example);

    int deleteByExample(PartyCandidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartyCandidate record);

    int insertSelective(PartyCandidate record);

    List<PartyCandidate> selectByExample(PartyCandidateExample example);

    PartyCandidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyCandidate record, @Param("example") PartyCandidateExample example);

    int updateByExample(@Param("record") PartyCandidate record, @Param("example") PartyCandidateExample example);

    int updateByPrimaryKeySelective(PartyCandidate record);

    int updateByPrimaryKey(PartyCandidate record);
}
package com.gmr.vote.dao;

import com.gmr.vote.model.entity.GroupCandidate;
import com.gmr.vote.model.entity.GroupCandidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupCandidateMapper {
    int countByExample(GroupCandidateExample example);

    int deleteByExample(GroupCandidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupCandidate record);

    int insertSelective(GroupCandidate record);

    List<GroupCandidate> selectByExample(GroupCandidateExample example);

    GroupCandidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupCandidate record, @Param("example") GroupCandidateExample example);

    int updateByExample(@Param("record") GroupCandidate record, @Param("example") GroupCandidateExample example);

    int updateByPrimaryKeySelective(GroupCandidate record);

    int updateByPrimaryKey(GroupCandidate record);
}
package com.gmr.vote.model.OV;

import com.gmr.vote.model.Jsonrequestbody.VoteMessage;
import lombok.Data;

import java.util.List;

/**
 * @program: vote
 * @description: 获取投票返回信息
 * @author: ggmr
 * @create: 2018-06-16 22:19
 */
@Data
public class VoteResult {
    List<VoteMessage> voteMessageList;
}

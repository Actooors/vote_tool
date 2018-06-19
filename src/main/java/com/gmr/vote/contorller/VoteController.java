package com.gmr.vote.contorller;

import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.Jsonrequestbody.Order;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.model.ResultTool;
import com.gmr.vote.service.GroupCandidateService;
import com.gmr.vote.tools.JwtUtil;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import com.gmr.vote.service.PartyCandidateService;

import javax.annotation.Resource;

/**
 * @program: vote
 * @description: 投票控制器
 * @author: ggmr
 * @create: 2018-06-16 21:35
 */
@RestController
@CrossOrigin
@RequestMapping(value = "vote")
public class VoteController {
    @Resource
    private PartyCandidateService partyCandidateService;

    @Resource
    private GroupCandidateService groupCandidateService;

    @RequestMapping(value = "groupPullVote", method = RequestMethod.POST)
    public Result groupVote(HttpServletRequest httpServletRequest,
            @RequestBody CandidateVote candidateVote) {
        String token = httpServletRequest.getHeader("Authorizaiton");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        String userId = JwtUtil.parseJwt(token);
        return groupCandidateService.groupVote(userId, candidateVote);
    }

    @RequestMapping(value = "partyPullVote", method = RequestMethod.POST)
    public Result partyVote(HttpServletRequest httpServletRequest,
                            @RequestBody CandidateVote candidateVote) {
        String token = httpServletRequest.getHeader("Authorizaiton");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        String userId = JwtUtil.parseJwt(token);
        return partyCandidateService.partyVote(userId, candidateVote);
    }

    @RequestMapping(value = "partyVote", method = RequestMethod.POST)
    public Result getPartyVotes(HttpServletRequest httpServletRequest,
                                @RequestBody Order order) {
        String token = httpServletRequest.getHeader("Authorizaiton");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        return partyCandidateService.getVotes(order);
    }

    @RequestMapping(value = "groupVote", method = RequestMethod.POST)
    public Result getGroupVotes(HttpServletRequest httpServletRequest,
                                @RequestBody Order order) {
        String token = httpServletRequest.getHeader("Authorizaiton");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        return groupCandidateService.getVotes(order);
    }

    @RequestMapping(value = "groupName", method = RequestMethod.POST)
    public Result getGroupName(HttpServletRequest httpServletRequest) {
        String token = httpServletRequest.getHeader("Authorizaiton");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        return groupCandidateService.getName();
    }

    @RequestMapping(value = "partyName", method = RequestMethod.POST)
    public Result getPartyName(HttpServletRequest httpServletRequest) {
        String token = httpServletRequest.getHeader("Authorizaiton");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        return partyCandidateService.getName();
    }
}

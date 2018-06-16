package com.gmr.vote.contorller;

import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.service.GroupCandidateService;
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
    public Result groupVote(@RequestBody CandidateVote candidateVote) {
        return groupCandidateService.groupVote(candidateVote);
    }

    @RequestMapping(value = "partyPullVote", method = RequestMethod.POST)
    public Result partyVote(@RequestBody CandidateVote candidateVote) {
        return partyCandidateService.partyVote(candidateVote);
    }

    @RequestMapping(value = "partyVote", method = RequestMethod.GET)
    public Result getPartyVotes(@RequestParam(value = "order") Integer order) {
        return partyCandidateService.getVotes(order);
    }

    @RequestMapping(value = "groupVote", method = RequestMethod.GET)
    public Result getGroupVotes(@RequestParam(value = "order") Integer order) {
        return groupCandidateService.getVotes(order);
    }

    @RequestMapping(value = "groupName", method = RequestMethod.GET)
    public Result getGroupName() {
        return groupCandidateService.getName();
    }

    @RequestMapping(value = "partyName", method = RequestMethod.GET)
    public Result getPartyName() {
        return partyCandidateService.getName();
    }
}

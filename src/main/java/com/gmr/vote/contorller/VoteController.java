package com.gmr.vote.contorller;

import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.OV.Result;
import org.springframework.web.bind.annotation.*;
import com.gmr.vote.service.CandidateService;

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
    private CandidateService candidateService;

    @RequestMapping(value = "pullVote", method = RequestMethod.POST)
    public Result vote(@RequestBody CandidateVote candidateVote) {
        return candidateService.vote(candidateVote);
    }

    @RequestMapping(value = "voteMessage", method = RequestMethod.GET)
    public Result getVotes(@RequestParam(value = "order") Integer order) {
        return candidateService.getVotes(order);
    }
}

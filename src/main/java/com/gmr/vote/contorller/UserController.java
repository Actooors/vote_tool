package com.gmr.vote.contorller;

import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.Jsonrequestbody.LoginUser;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.model.OV.TokenResponse;
import com.gmr.vote.model.ResultTool;
import com.gmr.vote.service.UserService;
import com.gmr.vote.tools.JwtUtil;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: vote
 * @description: 用户controller
 * @author: ggmr
 * @create: 2018-06-19 23:57
 */
@RestController
@CrossOrigin
@RequestMapping(value = "user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "partyVoteNum", method = RequestMethod.POST)
    public Result getPartyVoteNum(HttpServletRequest httpServletRequest) {
        String token = httpServletRequest.getHeader("Authorization");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        String userId = JwtUtil.parseJwt(token);
        return userService.getPartyVoteNum(userId);
    }

    @RequestMapping(value = "groupVoteNum", method = RequestMethod.POST)
    public Result getGroupVoteNum(HttpServletRequest httpServletRequest) {
        String token = httpServletRequest.getHeader("Authorization");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        String userId = JwtUtil.parseJwt(token);
        return userService.getGroupVoteNum(userId);
    }

    @GetMapping(value = "voteName")
    public Result getTotalName(HttpServletRequest httpServletRequest) {
        String token = httpServletRequest.getHeader("Authorization");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        return userService.getTotalName();
    }

    @GetMapping(value = "menu")
    public Result getMenu(HttpServletRequest httpServletRequest) {
        String token = httpServletRequest.getHeader("Authorization");
        if(token == null) {
            return ResultTool.error("请登录");
        }
        return userService.getMenu();
    }
}

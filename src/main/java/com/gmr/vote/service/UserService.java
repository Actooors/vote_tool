package com.gmr.vote.service;

import com.gmr.vote.dao.UserMapper;
import com.gmr.vote.dao.VoteConfigMapper;
import com.gmr.vote.model.Jsonrequestbody.LoginUser;
import com.gmr.vote.model.OV.CountNum;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.model.OV.TokenResponse;
import com.gmr.vote.model.OV.VoteMaxNum;
import com.gmr.vote.model.ResultTool;
import com.gmr.vote.model.entity.User;
import com.gmr.vote.model.entity.VoteConfig;
import com.gmr.vote.model.entity.VoteConfigExample;
import com.gmr.vote.tools.AuthTool;
import com.gmr.vote.tools.JwtUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @program: vote
 * @description: 用户service
 * @author: ggmr
 * @create: 2018-06-17 02:08
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    @Resource
    private VoteConfigMapper voteConfigMapper;


    /**
     * @Description: 返回计票人投票次数信息
     * @Param: [userId]
     * @Return: com.gmr.vote.model.OV.Result
     * @Author: ggmr
     * @Date: 18-6-20
     */
    public Result getPartyVoteNum(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        CountNum countNum = new CountNum();
        countNum.setCountNum(user.getPartyCountNum());
        return ResultTool.success(countNum);
    }

    public Result getGroupVoteNum(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        CountNum countNum = new CountNum();
        countNum.setCountNum(user.getGroupCountNum());
        return ResultTool.success(countNum);
    }

    /**
     * @Description: 获取计票的大标题
     * @Author: 0GGmr0
     * @Date: 2019-05-22
     */
    public Result getTotalName() {
        VoteConfig voteConfig = voteConfigMapper.selectByPrimaryKey(1);
        return ResultTool.success(new HashMap<String,String>(){
            {put("voteName",voteConfig.getConferenceName());}
        });
    }

    public Result getMenu() {
        VoteConfig voteConfig1 = voteConfigMapper.selectByPrimaryKey(1);
        VoteConfig voteConfig2 = voteConfigMapper.selectByPrimaryKey(2);
        return ResultTool.success(new HashMap<String,String>(){
            {put("name1",voteConfig1.getVoteName());
             put("name2",voteConfig2.getVoteName());}
        });
    }
        
        
    public Result login(LoginUser user) {
        if (user == null || user.getUid() == null || "".equals(user.getUid()) || user.getPassword() == null || "".equals(user.getPassword())) {
            return ResultTool.error("账号或密码不能为空");
        }
        // 首先验证数据库中有没有该用户
        User existedUser = userMapper.selectByPrimaryKey(user.getUid());
        if (existedUser != null) {
            if (AuthTool.getAuth(user.getUid(), user.getPassword())) {
                User record = new User();
                record.setUserId(user.getUid());
                TokenResponse response = new TokenResponse();
                response.setToken(JwtUtil.createJwt(user.getUid()));
                response.setIdentity(existedUser.getType());
                VoteConfig voteConfig1 = voteConfigMapper.selectByPrimaryKey(1);
                VoteConfig voteConfig2 = voteConfigMapper.selectByPrimaryKey(2);
                VoteMaxNum voteMaxNum = new VoteMaxNum();
                voteMaxNum.setGroupMaxVoteNum(voteConfig2.getElectnumber());
                voteMaxNum.setPartMaxVoteNum(voteConfig1.getElectnumber());
                response.setVoteMaxNum(voteMaxNum);
                return ResultTool.success(response);
            } else {
                return ResultTool.error("账号密码错误");
            }
        } else {
            // 请求上海大学登陆接口查看有没有该用户，有的话该用户进入我们的数据库，没有的话返回登陆失败的信息
//            if (AuthTool.getAuth(user.getUid(), user.getPassword())) {
//                User systemUser = AuthTool.getInfo(user.getUid());
//                assert systemUser != null;
//                systemUser.setUserId(user.getUid());
//                try {
//                    systemUser.setPassword(SecurityTool.encodeByMd5(user.getPassword()));
//                } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
//                    return ResultTool.error(e.getMessage());
//                }
//                systemUser.setType(1);
//                userMapper.insertSelective(systemUser);
//                TokenResponse response = new TokenResponse();
//                response.setToken(JwtUtil.createJwt(user.getUid()));
//                response.setIdentity(1);
//                return ResultTool.success(response);
//            } else {
//                return ResultTool.error("您不是上海大学的用户");
//            }
            return ResultTool.error("您没有权限登录");
        }
    }
}

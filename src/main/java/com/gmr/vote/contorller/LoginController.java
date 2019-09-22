package com.gmr.vote.contorller;

import com.gmr.vote.model.Jsonrequestbody.LoginUser;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.model.OV.TokenResponse;
import com.gmr.vote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: vote
 * @description: 登录控制器
 * @author: ggmr
 * @create: 2018-06-17 02:06
 */
@RestController
@RequestMapping(value = "/login")
@CrossOrigin
public class LoginController {

    @Resource
    private UserService userService;

    /**
     * @Description: 1是计票员 2是管理员
     * @Param: [loginUser]
     * @Return: Result<TokenResponse>
     * @Author: ggmr
     * @Date: 18-6-17
     */
    @PostMapping
    public Result<TokenResponse> login(@RequestBody LoginUser loginUser) {
        return userService.login(loginUser);
    }

}

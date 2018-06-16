//package com.gmr.vote.contorller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
///**
// * @program: vote
// * @description: 登录控制器
// * @author: ggmr
// * @create: 2018-06-17 02:06
// */
//@RestController
//@RequestMapping(value = "/login")
//@CrossOrigin
//public class LoginController {
//    private final UserService userService;
//
//    @Autowired
//    public LoginController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.POST)
//    @ApiOperation(value = "登陆", httpMethod = "POST")
//    public Result<TokenResponse> login(@RequestBody LoginUser loginUser) {
//        return userService.login(loginUser);
//    }
//
//}

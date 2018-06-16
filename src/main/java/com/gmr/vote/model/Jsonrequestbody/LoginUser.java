package com.gmr.vote.model.Jsonrequestbody;

import lombok.Data;

/**
 * @program: vote
 * @description: 登录用户
 * @author: ggmr
 * @create: 2018-06-17 02:22
 */
@Data
public class LoginUser {
    private String uid;
    private String password;
}

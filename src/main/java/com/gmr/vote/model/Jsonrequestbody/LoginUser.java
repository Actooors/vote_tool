package com.gmr.vote.model.Jsonrequestbody;


/**
 * @program: vote
 * @description: 登录用户
 * @author: ggmr
 * @create: 2018-06-17 02:22
 */

public class LoginUser {
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    private String uid;
    private String password;
}

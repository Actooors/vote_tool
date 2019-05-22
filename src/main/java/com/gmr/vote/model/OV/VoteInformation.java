package com.gmr.vote.model.OV;


/**
 * @program: vote
 * @description: 返回前端的投票具体信息
 * @author: ggmr
 * @create: 2018-06-16 22:26
 */

public class VoteInformation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    private String num;
    private String num1;
    private String num2;
}

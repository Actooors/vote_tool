package com.gmr.vote.model.OV;

import com.gmr.vote.model.ResultCode;

/**
 * @program: vote
 * @description: 给前端返回的数据统一格式
 * @author: ggmr
 * @create: 2018-06-16 20:07
 */

public class Result<T> {
    public ResultCode getCode() {
        return code;
    }

    public void setCode(ResultCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private ResultCode code;
    private String message;
    private T data;
}

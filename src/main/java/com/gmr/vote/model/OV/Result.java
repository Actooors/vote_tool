package com.gmr.vote.model.OV;

import com.gmr.vote.model.ResultCode;
import lombok.Data;

/**
 * @program: vote
 * @description: 给前端返回的数据统一格式
 * @author: ggmr
 * @create: 2018-06-16 20:07
 */
@Data
public class Result<T> {
    private ResultCode code;
    private String message;
    private T data;
}

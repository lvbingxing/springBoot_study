package com.lbx.test.utils;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/8 10:53
 * NOTE:    包装返回结果
 * @author 吕冰星
 */
public class StuResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public StuResult(Integer code, String msg, T data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public StuResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;

    }

    public Integer getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }
}

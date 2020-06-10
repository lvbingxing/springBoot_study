package com.lbx.test.utils;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/8 10:53
 * NOTE:    包装返回结果
 */
public class StuResult<T> {
    private int code;
    private String msg;
    private T data;

    public StuResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public StuResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

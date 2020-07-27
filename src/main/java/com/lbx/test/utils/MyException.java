package com.lbx.test.utils;

import com.lbx.test.enums.ResultEnums;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/9 9:42
 * NOTE:    自己创建的异常类 只包含 code 和 msg
 * @author 吕冰星
 */
public class MyException extends RuntimeException {
    private Integer code;
    private String msg;

    public MyException(ResultEnums enums) {
        super(enums.getMessage());
        this.code = enums.getCode();
        this.msg = enums.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

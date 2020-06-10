package com.lbx.test.utils;

import com.lbx.test.enums.ResultEnums;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/9 9:42
 * NOTE:
 */
public class MyException extends RuntimeException {
    private Integer code;

    public MyException(String message, Integer code) {
        super(message);
        this.code = code;
    }
    public MyException(ResultEnums enums) {
        super(enums.getMessage());
        this.code = enums.getCode();
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

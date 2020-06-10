package com.lbx.test.enums;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/9 10:16
 * NOTE:
 */
public enum ResultEnums {
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    EXIST_ERROR(-101,"数据不存在")
    ;
    Integer code;
    String message;

    ResultEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

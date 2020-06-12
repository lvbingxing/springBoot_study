package com.lbx.test.utils;

import com.lbx.test.enums.ResultEnums;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/8 10:56
 * NOTE:    返回结果 静态方法
 */
public class ResultUtil {
    public static StuResult success(Object object) {
        return new StuResult<>(0, "OK", object);
    }

    public static StuResult error(ResultEnums enums) {
        return new StuResult<>(enums.getCode(), enums.getMessage());
    }

    public static StuResult error(Integer code, String msg) {
        return new StuResult<>(code, msg);
    }
}

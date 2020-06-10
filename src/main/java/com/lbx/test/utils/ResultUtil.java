package com.lbx.test.utils;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/8 10:56
 * NOTE:    返回结果 静态方法
 */
public class ResultUtil {
    public static StuResult success(Object object) {
        return new StuResult<>(0, "OK", object);
    }

    public static StuResult error(int code, String msg) {
        return new StuResult<>(code,msg);
    }

}

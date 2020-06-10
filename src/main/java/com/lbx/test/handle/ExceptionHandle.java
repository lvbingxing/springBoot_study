package com.lbx.test.handle;

import com.lbx.test.utils.MyException;
import com.lbx.test.utils.ResultUtil;
import com.lbx.test.utils.StuResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/9 10:09
 * NOTE:
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public StuResult handle(Exception e){
        if (e instanceof MyException) {
            MyException myException = (MyException) e;
            return ResultUtil.error(myException.getCode(), myException.getMessage());
        }else {
            return ResultUtil.error(-1,"系统异常");
        }
    }
}

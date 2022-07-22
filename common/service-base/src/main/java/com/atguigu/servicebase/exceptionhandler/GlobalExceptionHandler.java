package com.atguigu.servicebase.exceptionhandler;

import com.atguigu.commonutils.ExceptionUtil;
import com.atguigu.commonutils.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/7/18 19:04
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    //自定义异常
    @ExceptionHandler(GuliException.class)
    @ResponseBody
    public ResultVo error(GuliException e) {
        //log.error(e.getMessage());
        log.error(ExceptionUtil.getMessage(e));
        e.printStackTrace();
        return ResultVo.error().code(e.getCode()).message(e.getMsg());
    }

    //指定出现什么异常执行这个方法
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVo error(Exception e) {
        e.printStackTrace();
        return ResultVo.error().message(e.getMessage());
    }
}

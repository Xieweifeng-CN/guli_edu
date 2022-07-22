package com.atguigu.eduservice.controller;

import com.atguigu.commonutils.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/7/19 19:02
 **/
@RestController
@RequestMapping("/eduservice/user")
@Api(tags="登录管理")
@CrossOrigin
public class EduLoginController {
    //login
    @PostMapping("/login")
    public ResultVo login(){
        return ResultVo.ok().data("token","admin");
    }
    //info
    @GetMapping("/info")
    public  ResultVo info(){
        return ResultVo.ok().data("roles","[admin]").data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}

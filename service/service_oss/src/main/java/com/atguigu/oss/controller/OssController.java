package com.atguigu.oss.controller;

import com.atguigu.commonutils.ResultVo;
import com.atguigu.oss.service.OssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/7/21 17:17
 **/
@RestController
@RequestMapping("/eduoss/fileoss")
@CrossOrigin
@Api(tags="阿里云文件管理")
public class OssController {
    @Autowired
    private OssService ossService;
    //上传头像的方法
    @ApiOperation(value = "文件上传")
    @PostMapping("/upload")
    public ResultVo uploadOssFile(@ApiParam(name = "file", value = "文件", required = true) MultipartFile file){
        //获取上传文件 MultipartFile
        //返回上传路径
        String url= ossService.uploadFileAvatar(file);
        return ResultVo.ok().message("文件上传成功").data("url",url);
    }
}

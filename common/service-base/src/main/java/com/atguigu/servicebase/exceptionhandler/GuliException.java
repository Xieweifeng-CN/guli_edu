package com.atguigu.servicebase.exceptionhandler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/7/18 19:19
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Api(tags = "自定义异常类")
public class GuliException extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code; //状态码

    private String msg;//异常信息


}

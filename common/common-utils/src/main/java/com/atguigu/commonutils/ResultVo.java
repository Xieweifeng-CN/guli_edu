package com.atguigu.commonutils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/7/18 18:22
 **/
@Data
//统一返回结果
public class ResultVo {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

    //构造方法私有
    private ResultVo(){}

    //成功静态方法
    public static ResultVo ok(){
        ResultVo resultVo=new ResultVo();
        resultVo.setSuccess(true);
        resultVo.setCode(ResultCode.SUCCESS);
        resultVo.setMessage("成功");
        return resultVo;
    }
    //失败静态方法
    public static ResultVo error(){
        ResultVo resultVo=new ResultVo();
        resultVo.setSuccess(false);
        resultVo.setCode(ResultCode.ERROR);
        resultVo.setMessage("失败");
        return resultVo;
    }

    public ResultVo success(Boolean success){
        this.setSuccess(success);
        return this;

    }
    public ResultVo message(String message){
        this.setMessage(message);
        return this;
    }

    public ResultVo code(Integer code){
        this.setCode(code);
        return this;
    }

    public ResultVo data(String key,Object value){
        this.data.put(key,value);
        return this;
    }

    public ResultVo data(Map<String,Object> map){
        this.setData(map);
        return this;
    }
}

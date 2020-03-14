package com.miki.help.temperature.user.controller;

import com.miki.help.temperature.api.ApiResult;
import com.miki.help.temperature.user.api.UserLoginApiDo;
import com.miki.help.temperature.user.model.UserModel;
import com.miki.help.temperature.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户管理-API")
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(httpMethod = "POST",value = "获取验证码", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping(value = "/getVerifyCode", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes ={MediaType.APPLICATION_FORM_URLENCODED_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ApiResult getVerifyCode(@RequestBody @Validated UserLoginApiDo apiDo){

        UserModel userModel = userService.getVerifyCode(apiDo.getUserPhone(), apiDo.getUserImsi());

        return ApiResult.createSuccessResult("success", userModel);
    }

    @ApiOperation(httpMethod = "POST",value = "登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes ={MediaType.APPLICATION_FORM_URLENCODED_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ApiResult login(@RequestBody @Validated String userPhone,
                           @RequestBody @Validated String userImsi){

        return null;
    }
}

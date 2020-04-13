package com.fhx.temperature.user.controller;

import com.fhx.temperature.api.ApiResult;
import com.fhx.temperature.user.api.UserLoginApiDo;
import com.fhx.temperature.user.model.UserModel;
import com.fhx.temperature.user.service.UserService;
import com.fhx.temperature.util.ObjectUtil;
import io.swagger.annotations.Api;
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

    @ApiOperation(httpMethod = "POST",value = "注册", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes ={MediaType.APPLICATION_FORM_URLENCODED_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ApiResult register(@RequestBody @Validated UserLoginApiDo apiDo){

        UserModel userModel = ObjectUtil.map(apiDo, UserModel.class);

       userModel =  userService.registerUser(userModel);

        return ApiResult.createSuccessResult("success", userModel);
    }

    @ApiOperation(httpMethod = "POST",value = "登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes ={MediaType.APPLICATION_FORM_URLENCODED_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ApiResult login(@RequestBody @Validated UserLoginApiDo apiDo){

        return null;
    }
}

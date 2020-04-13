package com.fhx.temperature.equipment.controller;

import com.fhx.temperature.api.ApiResult;
import com.fhx.temperature.equipment.model.EquipmentUserModel;
import com.fhx.temperature.equipment.services.EquipmentUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "设备管理-API")
@RequestMapping("/equipment")
@RestController
public class EquipmentController {

    @Autowired
    EquipmentUserService equipmentUserService;

    @ApiOperation(httpMethod = "GET",value = "获取用户名下设备列表", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", dataType = "String", paramType = "path", required = true)
    })
    @GetMapping(value = "/user/{userId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ApiResult login(@RequestParam(value = "userId") String userId){

        EquipmentUserModel bean = new EquipmentUserModel();
        bean.setUserId(userId);
        List<EquipmentUserModel> equipmentUserModelList = equipmentUserService.findAll(bean);
        return ApiResult.createSuccessResult("", equipmentUserModelList);
    }

    @ApiOperation(httpMethod = "GET",value = "获取单个设备设置参数", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", dataType = "String", paramType = "path", required = true),
            @ApiImplicitParam(name = "equipmentId", value = "设备id", dataType = "String", paramType = "path", required = true)
    })
    @GetMapping(value = "/{userId}/{equipmentId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ApiResult findOne(@PathVariable(value = "userId") String userId,
                             @PathVariable(value = "equipmentId") String equipmentId){

        EquipmentUserModel bean = new EquipmentUserModel();
        bean.setUserId(userId);
        bean.setEquipmentSn(equipmentId);

        bean = equipmentUserService.findOne(bean);
        return ApiResult.createSuccessResult("", bean);
    }
}

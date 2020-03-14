package com.miki.help.temperature.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "user model")
public class UserModel {

    @ApiModelProperty(value = "id", required = false)
    private int Id;

    @ApiModelProperty(value = "user phone", required = true)
    private String userPhone;

    @ApiModelProperty(value = "user name", required = false)
    private String userName;

    @ApiModelProperty(value = "verify code", required = false)
    private String verifyCode;

    @ApiModelProperty(value = "user imsi", required = true)
    private String userImsi;
}

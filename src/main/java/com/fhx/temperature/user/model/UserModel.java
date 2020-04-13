package com.fhx.temperature.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "user model")
public class UserModel {
    @ApiModelProperty(value = "id", required = false)
    private int id;

    @ApiModelProperty(value = "user phone", required = false)
    private String userPhone;

    @ApiModelProperty(value = "user name", required = false)
    private String userName;

    @ApiModelProperty(value = "user password", required = false)
    private String password;

    @ApiModelProperty(value = "user userEmail", required = false)
    private String userEmail;
}

package com.fhx.temperature.user.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserLoginApiDo {
    @NotBlank(message = "{UserLoginApiDo.userPhone.none}")
    @ApiModelProperty(value = "手机号码", required = true)
    public String userPhone;

    @NotBlank(message = "{UserLoginApiDo.userPhone.none}")
    @ApiModelProperty(value = "用户名", required = true)
    public String userName;

    @NotBlank(message = "{UserLoginApiDo.password.none}")
    @ApiModelProperty(value = "密码", required = true)
    public String password;

}

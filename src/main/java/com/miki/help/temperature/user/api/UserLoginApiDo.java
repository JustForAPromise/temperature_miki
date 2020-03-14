package com.miki.help.temperature.user.api;

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

    @NotBlank(message = "{UserLoginApiDo.userImsi.none}")
    @ApiModelProperty(value = "本机IMSI号", required = true)
    public String userImsi;
}

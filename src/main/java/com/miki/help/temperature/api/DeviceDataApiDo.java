package com.miki.help.temperature.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Auther fanhanxi
 * @Date 2018/12/24
 * @Description:
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceDataApiDo {

    @NotBlank(message = "{DeviceDataApiDo.code_version.none}")
    @ApiModelProperty(value = "协议版本", required = true)
    String code_version;

    @NotBlank(message = "{DeviceDataApiDo.device_no.none}")
    @ApiModelProperty(value = "终端设备编号", required = true)
    String device_no;

    @NotBlank(message = "{DeviceDataApiDo.sale_channel.none}")
    @ApiModelProperty(value = "设备对应渠道商编号", required = true)
    String sale_channel;

    @NotBlank(message = "{DeviceDataApiDo.detected_time.none}")
    @ApiModelProperty(value = "检测时间:yyyy-MM-dd HH:mm:ss", required = true)
    String detected_time;

    @NotNull(message = "{DeviceDataApiDo.pef_value.none}")
    @ApiModelProperty(value = "PEF值:L/min", required = true)
    Integer pef_value;

    @NotNull(message = "{DeviceDataApiDo.fev1_value.none}")
    @ApiModelProperty(value = "FEV1值:L", required = true)
    Double fev1_value;

    @NotNull(message = "{DeviceDataApiDo.fvc_value.none}")
    @ApiModelProperty(value = "FVC值: L", required = true)
    Double fvc_value;

    @ApiModelProperty(value = "FEV1值:L/s")
    Double fef25_75_value;

    @ApiModelProperty(value = "mef75值:L/s")
    Double mef75_value;

    @ApiModelProperty(value = "mef50值:L/s")
    Double mef50_value;

    @ApiModelProperty(value = "Mef25值:L/s")
    Double mef25_value;

    @ApiModelProperty(value = "绑定人检测提示，无绑定为空")
    String tips;

    @ApiModelProperty(value = "检测人pef 指标预计值")
    String param1;

    @ApiModelProperty(value = "检测人fev1 指标预计值")
    String param2;

    @ApiModelProperty(value = "检测人fvc 指标预计值")
    String param3;

    @ApiModelProperty(value = "数据图表数据")
    String param4;

    @ApiModelProperty(value = "检测人 fef25_75指标预计值")
    Double prefef25_75;

    @ApiModelProperty(value = "检测人 mef75指标预计值")
    Double premef75;

    @ApiModelProperty(value = "检测人 mef50指标预计值")
    Double premef50;

    @ApiModelProperty(value = "检测人 mef25指标预计值")
    Double premef25;

    @ApiModelProperty(value = "时间戳")
    String timestamp;

    @ApiModelProperty(value = "sign")
    String sign;

    @Override
    public String toString() {
        return "code_version='" + code_version + '\'' +
                ", device_no='" + device_no + '\'' +
                ", sale_channel='" + sale_channel + '\'' +
                ", detected_time='" + detected_time + '\'' +
                ", pef_value=" + pef_value +
                ", fev1_value=" + fev1_value +
                ", fvc_value=" + fvc_value +
                ", fef25_75_value=" + fef25_75_value +
                ", mef75_value=" + mef75_value +
                ", mef50_value=" + mef50_value +
                ", mef25_value=" + mef25_value +
                ", tips='" + tips + '\'' +
                ", param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                ", param3='" + param3 + '\'' +
                ", param4='" + param4 + '\'' +
                ", prefef25_75=" + prefef25_75 +
                ", premef75=" + premef75 +
                ", premef50=" + premef50 +
                ", premef25=" + premef25 +
                ", timestamp='" + timestamp + '\'' +
                ", sign='" + sign + '\'';
    }
}

package com.fhx.temperature.util;

import org.springframework.core.convert.converter.Converter;

import java.beans.ConstructorProperties;

public class CloudApiResult<T> {

    private static class StatusCode {
        static final int SUCCESS = 0;
        static final int FAILURE = -1;
        static final int FORCE_RE_LOGIN = -2;
    }

    private int code = 0;
    private String msg = "";
    private T data;

    public <D> void setData(D data, Converter<D, T> converter) {
        this.setData(converter.convert(data));
    }

    public void setSuccess(String msg, T data) {
        this.setCode(0);
        this.setMsg(msg);
        this.setData(data);
    }

    public void setFailure(String msg, T data) {
        this.setCode(-1);
        this.setMsg(msg);
        this.setData(data);
    }

    public void setForceReLogin(String msg) {
        this.setCode(-2);
        this.setMsg(msg);
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "CloudApiResponse(code=" + this.getCode() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }

    @ConstructorProperties({"code", "msg", "data"})
    public CloudApiResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CloudApiResult() {
    }
}

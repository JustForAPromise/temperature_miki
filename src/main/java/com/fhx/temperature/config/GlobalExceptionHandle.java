package com.fhx.temperature.config;

import com.fhx.temperature.config.exception.BusinessException;
import com.fhx.temperature.util.CloudApiResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandle {

    public GlobalExceptionHandle() {
    }

    @ExceptionHandler({BusinessException.class})
    @ResponseBody
    CloudApiResult<?> handleBusinessException(BusinessException e) {
        CloudApiResult<?> apiResponse = new CloudApiResult();
        apiResponse.setFailure(e.getMessage(), null);
        return apiResponse;
    }

}

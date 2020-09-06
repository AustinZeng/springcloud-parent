package com.spring.handler;

import com.spring.common.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description: 全局的的异常拦截器
 * @author: zengcong
 * @create: 2020-06-15 11:28
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 拦截相关异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<?> tradeException(Exception e) {

         LOGGER.error("系统异常",e);
        return  ResponseEntity.ok(new BaseResponse(400,"SERVER_ERROR"));

    }

}

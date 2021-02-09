package com.devglan.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.devglan.model.ApiResponse;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ApiResponse<?> handleNotFoundException(RuntimeException ex) {
        ApiResponse<String> apiResponse = new ApiResponse<>(400, "Bad request", null);
        return apiResponse;
    }

}

package com.handcoding.template.vo;

import lombok.Data;

@Data
public class ResponseVO<T> {
    
    private String message;
    private boolean check = true;
    private T response;

}
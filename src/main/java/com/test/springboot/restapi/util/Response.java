package com.test.springboot.restapi.util;

import lombok.Getter;
import lombok.Setter;

/*Generic Method*/
@Setter /*Setter*/
@Getter /*Getter*/
public class Response<T> {
    private String service;
    private String message;
    private T data;

    public void setService(String service) {
    	this.service=service;
    }
    public void setMessage(String message) {
    	this.message=message;
    }

    public void setData(T data) {
    	this.data=data;
    }
}
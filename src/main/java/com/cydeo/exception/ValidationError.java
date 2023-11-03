package com.cydeo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ValidationError {
    private String errorField;
    private Object rejectedValue;
    private String reason;

    //we are going to use this in ExceptionWrapper
}

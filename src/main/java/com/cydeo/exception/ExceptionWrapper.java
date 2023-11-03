package com.cydeo.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionWrapper {
    private LocalDateTime timestamp;
    private Integer status;
    private String message;
    private String path;

    private List<ValidationError> validationErrorList;
    private Integer errorCount;
}

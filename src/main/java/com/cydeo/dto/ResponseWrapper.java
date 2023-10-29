package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter     //jackson using @Getter @Setter when converting JSON to Java obj
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseWrapper {
//customizing response.

    private boolean success;
    private String message;
    private Integer code;
    private Object data;

    //constructor
    public ResponseWrapper(String message, Object data) {
        this.message = message;
        this.data = data;
        this.success = true;
        this.code = HttpStatus.OK.value();
    }

    //constructor that we can use for delete
    public ResponseWrapper(String message) {
        this.message = message;
        this.success = true;
        this.code = HttpStatus.OK.value();
    }
}

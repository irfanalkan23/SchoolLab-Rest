package com.cydeo.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)  //whenever a NotFoundException is thrown, replace api response json with the following custom one
    public ResponseEntity<ExceptionWrapper> handleNotFoundException(NotFoundException ex, HttpServletRequest request){
        //create a json with ExceptionWrapper and return
        ExceptionWrapper exceptionWrapper = new ExceptionWrapper();
        exceptionWrapper.setTimestamp(LocalDateTime.now());
        exceptionWrapper.setMessage(ex.getMessage());
        exceptionWrapper.setStatus(HttpStatus.NOT_FOUND.value());
        exceptionWrapper.setPath(request.getRequestURI());  //gets the request uri just like the in Postman "path": "/address/26"

        //the actual api status part:
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionWrapper);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionWrapper> handleValidationError(MethodArgumentNotValidException ex, HttpServletRequest request){
        ExceptionWrapper exceptionWrapper = new ExceptionWrapper();
        exceptionWrapper.setMessage("Invalid Input(s)");
        exceptionWrapper.setStatus(HttpStatus.BAD_REQUEST.value());
        exceptionWrapper.setTimestamp(LocalDateTime.now());
        exceptionWrapper.setPath(request.getRequestURI());

        List<ValidationError> validationErrors = new ArrayList<>();

        for (ObjectError error : ex.getBindingResult().getAllErrors()){

            String fieldName = ((FieldError) error).getField();
            Object rejectedValue = ((FieldError) error).getRejectedValue();
            String errorMessage = error.getDefaultMessage();

            ValidationError validationError = new ValidationError(fieldName, rejectedValue, errorMessage);
            validationErrors.add(validationError);
        }

        exceptionWrapper.setValidationErrorList(validationErrors);
        exceptionWrapper.setErrorCount(validationErrors.size());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionWrapper);
    }
}

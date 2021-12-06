package com.projeto.ctd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<?> ResourceNotFoundException(ResourceNotFoundException e){
        return  new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

}
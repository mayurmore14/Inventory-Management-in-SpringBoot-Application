package com.igc.iteminventory.exception;

import com.igc.iteminventory.responses.Responses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<?> itemNotFoundEx() {
        return new ResponseEntity<>(new Responses("Item With Given Id Not Found in Database", HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
    }
}

package com.bk.assignment.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class Exceptions {
	
	
	
	@ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity<Object> handleStudentNotFoundException(PersonNotFoundException exception) {
		
log.error("an error is occured");
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("personnotfound"+exception.getMessage());
    }

}

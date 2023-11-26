package com.admission.hospital.PatientManagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		String message=ex.getMessage();
		ApiResponse apiRes=new ApiResponse(message, false);
		return new ResponseEntity<>(apiRes,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ApiResponse> userNotFoundExceptionHandler(UserNotFoundException ex){
		String message=ex.getMessage();
		ApiResponse apiRes=new ApiResponse(message, false);
		return new ResponseEntity<>(apiRes,HttpStatus.NOT_FOUND);
	}
}

package br.com.wilton.exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.wilton.exceptions.ExceptionResponse;

@RestController
@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception e, WebRequest request){
		ExceptionResponse responseException = new ExceptionResponse(new Date(), e.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(responseException, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnsupportedOperationException.class)
	public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(Exception e, WebRequest request){
		ExceptionResponse responseException = new ExceptionResponse(new Date(), e.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(responseException, HttpStatus.BAD_REQUEST);
	}
}

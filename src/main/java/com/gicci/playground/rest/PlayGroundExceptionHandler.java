package com.gicci.playground.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.gicci.playground.exception.RecordConstraint;
import com.gicci.playground.exception.RecordNotFound;

@ControllerAdvice
public class PlayGroundExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	private MessageSource messageSource;
	
	@ExceptionHandler({ RecordNotFound.class })
	public ResponseEntity<Object> handleRecordNotFoundException(Exception ex, WebRequest request) {
		String defaultMessage = messageSource.getMessage("Error.RecordNotFound", null, LocaleContextHolder.getLocale());
		return new ResponseEntity<Object>(defaultMessage + ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler({ RecordConstraint.class })
	public ResponseEntity<Object> handleRecordConstraintException(Exception ex, WebRequest request) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.CONFLICT);
	}

}

package senpiper.assignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CenterRestExceptionHandler {
	//add exception handler for center not found ecxeption
	@ExceptionHandler
	public ResponseEntity<CenterErrorResponse> handleException(CenterNotFoundException exc){
		//create customer error response
		CenterErrorResponse error = new CenterErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
		//return response entity
		return new ResponseEntity<CenterErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
	
	// add exception handler for all type of exception (catch all)
	@ExceptionHandler
	public ResponseEntity<CenterErrorResponse> handleException(Exception exc){
		//create center error response
		CenterErrorResponse error = new CenterErrorResponse(
												HttpStatus.BAD_REQUEST.value(),
												exc.getMessage(),
												System.currentTimeMillis());
		//return response entity
		return new ResponseEntity<CenterErrorResponse>(error, HttpStatus.BAD_REQUEST);
	
}
}

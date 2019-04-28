package camarra.project.RestApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleNoEmployeeFoundException(EmployeeNotFoundException exc) {

		EmployeeErrorResponse response = new EmployeeErrorResponse();
		response.setHttpstatus(HttpStatus.NOT_FOUND.value());
		response.setMessage(exc.getMessage());
		response.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

	}

	// handles any other exception
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(Exception exc) {

		EmployeeErrorResponse response = new EmployeeErrorResponse();
		response.setHttpstatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(exc.getMessage());
		response.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
}

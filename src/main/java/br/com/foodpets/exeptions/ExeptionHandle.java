package br.com.foodpets.exeptions;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExeptionHandle {
    
    @ExceptionHandler(InvalidLoginExeption.class)
    public final ResponseEntity<ExeptionResponse> handleInvalidLogin(InvalidLoginExeption ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.UNAUTHORIZED;
        ExeptionResponse exeptionResponse = new ExeptionResponse(new Date(), "InvalidLoginExeption", status.value(), ex.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(exeptionResponse);
    }

}

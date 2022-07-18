package com.learning.sba.infra.controllers.handlers;

import com.learning.sba.business.exceptions.EntityNotFoundException;
import com.learning.sba.infra.controllers.UserController;
import com.learning.sba.infra.dto.response.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = UserController.class)
public class UserControllerAdvice {

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDto handleException(EntityNotFoundException e) {
        return new ErrorDto(
            e.getMessage(),
            HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDto handleException(Exception e) {
        return new ErrorDto(
            e.getMessage(),
            HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}

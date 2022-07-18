package com.learning.sba.infra.dto.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ErrorDto {
    private final String message;
    private final int status;

    public ErrorDto(String message, HttpStatus status) {
        this.message = message;
        this.status = status.value();
    }
}

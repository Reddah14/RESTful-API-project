package com.footballersAPI.footballlegends.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class ResourceIsATeaPot extends RuntimeException {
    public ResourceIsATeaPot(String message) {
        super(message);
    }
}
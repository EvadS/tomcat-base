package com.se.sample.exceptions;


public class InvalidTaskDataException extends RuntimeException {

    public InvalidTaskDataException(String message) {
        super(message);
    }
}

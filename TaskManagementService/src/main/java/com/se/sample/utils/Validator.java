package com.se.sample.utils;


import com.se.sample.exceptions.InvalidTaskDataException;

public class Validator {

    public static void validateArgNotNullOrBlank(String arg, String argName) {
        if (arg == null || arg.isBlank()) {
            throw new InvalidTaskDataException(argName + " cannot be null or blank");
        }
    }

    public static void validateArgNotNull(Object arg, String argName) {
        if (arg == null) {
            throw new InvalidTaskDataException(argName + " cannot be null");
        }
    }
}
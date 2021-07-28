package com.training.an.grow.Exceptions;

public class CustomRuntimeException extends RuntimeException{

    public CustomRuntimeException(String message) {
        super("So, are you happy now? \n" + message);
    }
}

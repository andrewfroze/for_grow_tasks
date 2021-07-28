package com.training.an.grow.Exceptions;

public class CustomCheckedException extends Exception{

    public CustomCheckedException(String message) {
        super("Nothing scary! \n it's just " + message);
    }
}

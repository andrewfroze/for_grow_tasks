package com.training.an.grow;

import com.training.an.grow.Exceptions.CustomCheckedException;
import com.training.an.grow.Exceptions.CustomRuntimeException;

public class Main {

    public static void main(String[] args) {
        //throw new CustomCheckedException("exception message");
	    throw new CustomRuntimeException("exception message");
    }
}

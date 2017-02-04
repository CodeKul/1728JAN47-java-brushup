package com.codekul.java.brushup.exceptionhandling;

/**
 * Created by aniruddha on 4/2/17.
 */
public class BadCoffeeException extends RuntimeException {
    private int formula;

    public BadCoffeeException(int formula){
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "Formula is "+formula;
    }

    @Override
    public String getMessage() {
        return "You have given me some bad combination, so I cannot vend it";
    }
}

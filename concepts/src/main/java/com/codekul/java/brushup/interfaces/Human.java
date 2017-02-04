package com.codekul.java.brushup.interfaces;

/**
 * Created by aniruddha on 4/2/17.
 */
public /*abstract*/ class Human implements GpsListener{

    public void walk() {

    }

    @Override
    public String location() {
        return "Home`";
    }
}

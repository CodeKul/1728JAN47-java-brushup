package com.codekul.java.brushup.interfaces;

/**
 * Created by aniruddha on 4/2/17.
 */
public class Bike implements GpsListener{

    public void speedUp() {

    }

    @Override
    public String location() {
        return "Road";
    }
}

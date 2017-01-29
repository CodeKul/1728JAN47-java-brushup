package com.codekul.java.brushup.inheritance;

/**
 * Created by aniruddha on 29/1/17.
 */
public class Mobile /*is a device*/ extends Device {

    @Override
    public int getPower() {
        super.getPower();

        return  10;
    }

    public int getKeys() {
        return 9;
    }
}

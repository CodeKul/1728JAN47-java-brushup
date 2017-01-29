package com.codekul.java.brushup;

import com.codekul.java.brushup.classesandobject.Wire;

/**
 * Created by aniruddha on 29/1/17.
 */
public class Main {
    public static void main(String[] args) {
        classesAndObject();
    }

    public static void classesAndObject() {
        Wire wire = new Wire();
        wire.length(25);
        System.out.printf("\n Length is %d ",wire.length());
        wire.type("COAX");
        System.out.printf("\n Type is %s ",wire.type());
    }
}

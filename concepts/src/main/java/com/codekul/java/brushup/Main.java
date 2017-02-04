package com.codekul.java.brushup;

import com.codekul.java.brushup.abstractclass.Animal;
import com.codekul.java.brushup.abstractclass.Tiger;
import com.codekul.java.brushup.classesandobject.Wire;
import com.codekul.java.brushup.inheritance.Device;
import com.codekul.java.brushup.inheritance.Mobile;
import com.codekul.java.brushup.interfaces.Bike;
import com.codekul.java.brushup.interfaces.Human;

/**
 * Created by aniruddha on 29/1/17.
 */
public class Main {
    public static void main(String[] args) {
        interfaces();
    }

    public static void classesAndObject() {
        Wire wire = new Wire();
        wire.length(25);
        System.out.printf("\n Length is %d ",wire.length());
        wire.type("COAX");
        System.out.printf("\n Type is %s ",wire.type());
    }

    private static void inheritance() {

        Mobile mobile = new Mobile();
        mobile.getPower();

        Device device = new Mobile();
    }

    private static void abstractClasses() {
        Animal animal = new Tiger();
        animal.walk();

        Tiger tiger = new Tiger();
        tiger.walk();
    }

    public static void interfaces() {

        Human human = new Human();
        human.walk();
        System.out.printf("\n Human is @ %s", human.location());

        Bike bike = new Bike();
        bike.speedUp();
        System.out.printf("\n Bike is @ %s", bike.location());
    }
}

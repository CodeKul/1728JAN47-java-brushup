package com.codekul.java.brushup;

import com.codekul.java.brushup.abstractclass.Animal;
import com.codekul.java.brushup.abstractclass.Tiger;
import com.codekul.java.brushup.classesandobject.Wire;
import com.codekul.java.brushup.collection.Bag;
import com.codekul.java.brushup.exceptionhandling.Coffee;
import com.codekul.java.brushup.generics.Liquid;
import com.codekul.java.brushup.generics.Water;
import com.codekul.java.brushup.inheritance.Device;
import com.codekul.java.brushup.inheritance.Mobile;
import com.codekul.java.brushup.innerclasses.Outer;
import com.codekul.java.brushup.interfaces.Bike;
import com.codekul.java.brushup.interfaces.GpsListener;
import com.codekul.java.brushup.interfaces.Human;
import com.codekul.java.brushup.threading.CupCake;
import com.codekul.java.brushup.threading.Kite;

import java.awt.*;
/**
 * Created by aniruddha on 29/1/17.
 */
public class Main {
    public static void main(String[] args) {
        collections();
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

    private static void interfaces() {

        Human human = new Human();
        human.walk();
        System.out.printf("\n Human is @ %s", human.location());

        Bike bike = new Bike();
        bike.speedUp();
        System.out.printf("\n Bike is @ %s", bike.location());
    }

    private static void exceptionHandling() {
        Coffee coffee = new Coffee();
        try {
            coffee.espresso(1, 80);
            coffee.espresso(1, 0);
            coffee.espresso(1, 30);
        } catch (Exception e) {
            e.printStackTrace();
        }

        coffee.cappuccino(1, 0, 10); //
    }

    private static void innerClasses() {
        Outer outer = new Outer();

        Outer.PublicInner publicInner = outer.new PublicInner();

        Outer.StaticInner staticInner = new Outer.StaticInner();

        outer.outersMethod();

        GpsListener listener = new GpsListener() {
            @Override
            public String location() {
                return null;
            }
        };

        listener = () -> "hello"; //lambda
        listener = Main::myMethod; // method ref

        Button btn = new Button();
        btn.addActionListener(e -> {});
    }

    private static String myMethod() {
        return "hello";
    }

    private static void threading() {

        CupCake cupCake = new CupCake();
        cupCake.start();

        Kite kite = new Kite();
        kite.fly();
    }

    private static void generics() {

        Water water = new Water();
        water.waterify("this is my name");
        water.waterify(10);
        water.waterify(new Button());
        water.waterify(new CupCake());

        Liquid<String> liquid = new Liquid<>();
        liquid.liquify("Hello");

        Liquid<Boolean> liquidBool = new Liquid<>();
        liquidBool.liquify(true);
    }

    private static void collections() {
        Bag bag = new Bag();
        //bag.cities();
        bag.fruits();
    }
}

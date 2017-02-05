package com.codekul.java.brushup.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by aniruddha on 5/2/17.
 */
public class Bag {

    public void cities() {
        Collection<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Sangli");
        cities.add("Mumbai");
        cities.add("Delhi");

        Iterator<String> it = cities.iterator();
        while(it.hasNext()) {
            String city = it.next();
            System.out.printf("\n 1. City is %s", city);
        }

        for (String city : cities) {
            System.out.printf("\n 2. City is %s", cities);
        }

        cities.forEach(city -> System.out.printf("3. City is %s", city));
        cities.forEach(System.out::print);
    }

    public void fruits() {

        List<String> fruits = new ArrayList<>();
        fruits.add("Manjifera Indica");
        fruits.add("Termerind Indica");
        fruits.add("Hibiscus");
        fruits.add("Rosinesa Hibiscus");
        fruits.add("Malus domestica");

        List<String> fromTo = fruits.subList(1, 3);
        fromTo.forEach(it -> System.out.printf("\n %s", it));

        /*try {
            String zeroth = fruits.get(0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        fruits.forEach(fruit -> System.out.printf("\n %s", fruit));*/
    }
}

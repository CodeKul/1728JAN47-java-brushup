package com.codekul.java.brushup.threading;

/**
 * Created by aniruddha on 4/2/17.
 */
public class Kite {

    public void fly() {
//        Thread thread = new Thread(() -> {});
        Thread thread = new Thread(this::flyRun);
        thread.start();
    }

    private void flyRun() {
        for (int i = 0; i < 100 ; i++) {
            System.out.printf("\n Kite %d ",i);
        }
    }
}

package com.codekul.java.brushup.threading;

/**
 * Created by aniruddha on 4/2/17.
 */
public class CupCake extends Thread {
    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 100 ; i++) {
            System.out.printf("\n CupCake %d", i);
        }
    }
}

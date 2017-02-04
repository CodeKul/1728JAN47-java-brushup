package com.codekul.java.brushup.innerclasses;

import com.codekul.java.brushup.interfaces.GpsListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by aniruddha on 4/2/17.
 */
public class Outer {

    /**
     * 1 . Simple Inner
     * 2 . Local Inner
     * 3 . Anonymous Inner
     * -----
     * 4 . Lambdas and method refs
     * */

    private GpsListener listener = new Gps();/* Object of that class which implements GpsListener*/

    //Anonymous Inner
    private GpsListener otherGps = new GpsListener() {
        @Override
        public String location() {
            return null;
        }
    };

    private MouseListener mouseListener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };

    private class PrivateInner {

    }

    public class PublicInner {

    }

    public static class StaticInner {

    }

    public void outersMethod() {

        class LocalInner {

        }
    }

    private class Gps implements GpsListener {

        @Override
        public String location() {
            return null;
        }
    }
}

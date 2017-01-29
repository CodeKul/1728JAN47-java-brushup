package com.codekul.java.brushup.inheritance;

/**
 * Created by aniruddha on 29/1/17.
 */
public class Device {

    private int power;
    private String maker;
    private float weight;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Device{" +
                "power=" + power +
                ", maker='" + maker + '\'' +
                ", weight=" + weight +
                '}';
    }
}

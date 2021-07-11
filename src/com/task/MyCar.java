package com.task;

public class MyCar extends Car {

    public  MyCar(String model, String speed, String color) {
        super(model, speed, color);
    }

    @Override
    public String description() {
        return "model: " + model + "\r\nspeed: " + speed + "\r\ncolor: " + color;
    }
}
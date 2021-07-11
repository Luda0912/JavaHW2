package com.task;

public class HisCar implements CarInterface {

    private String model;
    private String speed;
    private String color;

    public HisCar(String model, String speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String gas(int value) {
        return  "gas: " + Integer.toString(value);
    }

    @Override
    public String brake(int value) {
        return  "brake: " + Integer.toString(value);
    }

    @Override
    public String description() {
        return "model: " + this.model + "\r\nspeed: " + this.speed + "\r\ncolor: " + this.color;
    }
}

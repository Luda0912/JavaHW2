package com.task;

public abstract class Car {
    protected String model;
    protected String speed;
    protected String color;

    public Car(String model, String speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    public String gas(int value) {
        return  "gas: " + Integer.toString(value);
    }
    public String brake(int value) {
        return  "brake: " + Integer.toString(value);
    }
    public abstract String description();
}
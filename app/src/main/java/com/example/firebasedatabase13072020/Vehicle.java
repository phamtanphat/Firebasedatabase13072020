package com.example.firebasedatabase13072020;

public class Vehicle {
    public String name;
    public Integer numwheel;

    public Vehicle(String name, Integer numwheel) {
        this.name = name;
        this.numwheel = numwheel;
    }

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", numwheel=" + numwheel +
                '}';
    }
}

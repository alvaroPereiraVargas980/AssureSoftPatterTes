package com.alvaro.AbstractFactoryPatter;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.print("Inside this circle::draw() method(). ");
    }
}

package com.alvaro.AbstractFactoryPatter;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.print("Inside this Rectangle::draw() method.");
    }
}

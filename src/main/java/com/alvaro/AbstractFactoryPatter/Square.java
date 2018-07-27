package com.alvaro.AbstractFactoryPatter;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.print("Inside Square::draw() method.");
    }
}

package com.alvaro.AbstractFactoryPatter;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.print("Inside this Red::fill() method().");
    }
}

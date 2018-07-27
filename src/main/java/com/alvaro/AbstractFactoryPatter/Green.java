package com.alvaro.AbstractFactoryPatter;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.print("Inside Green::fill() method().");
    }
}

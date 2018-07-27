package com.alvaro.FactoryMathodPatter;

public abstract class Plan {
    public double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);

    }
}

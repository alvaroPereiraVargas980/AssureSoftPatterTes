package com.alvaro.BuilderPatter;

public class Samsung extends Company {

    @Override
    public int price() {
        return 40;
    }

    @Override
    public String pack() {
        return "Samsung cd";
    }
}

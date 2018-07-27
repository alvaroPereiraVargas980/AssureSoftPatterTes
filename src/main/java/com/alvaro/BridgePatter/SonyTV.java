package com.alvaro.BridgePatter;

public class SonyTV implements ITV{

    @Override
    public void on() {
        System.out.print("sony is turned on");
    }

    @Override
    public void off() {
        System.out.print("Sony es turned off");

    }

    @Override
    public void switchChannel(int channel) {
        System.out.print("Sony:channel:"+channel);
    }
}

package com.alvaro.BridgePatter;

public class SamSungTv implements ITV {
    @Override
    public void on() {
        System.out.print("Samsung is turned on");
    }

    @Override
    public void off() {
        System.out.print("Samsung es turned off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.print("Samsung:channel -"+channel);
    }
}

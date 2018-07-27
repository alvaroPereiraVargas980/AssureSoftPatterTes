package com.alvaro.BridgePatter;

public abstract class AbstractRemoteControl {
    private ITV tv;
    public AbstractRemoteControl(ITV tv){
        this.tv=tv;

    }
    public void turOn(){
        tv.on();
    }
    public void turnOff(){
        tv.off();
    }
    public void setChannel(int channel){
        tv.switchChannel(channel);
    }
}

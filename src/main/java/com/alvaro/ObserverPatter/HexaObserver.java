package com.alvaro.ObserverPatter;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
      System.out.print("Hex String"+ Integer.toOctalString(subject.getState()).toUpperCase());
    }
}

package com.alvaro.ObserverPatter;

public class ObserverpatterDemo {
    public static void main (String [] arg){
        Subject subject=new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("Fist state change: 15" );
        subject.setState(15);
        System.out.println("second state chamge: 10");
        subject.setState(10);
    }
}

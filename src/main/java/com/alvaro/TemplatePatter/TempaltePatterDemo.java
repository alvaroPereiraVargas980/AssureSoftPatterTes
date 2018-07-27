package com.alvaro.TemplatePatter;

public class TempaltePatterDemo {
    public static void main(String [] arg){
        Game game=new Cricket();
        game.play();
        System.out.println();
        game=new Fooball();
        game.play();

    }
}

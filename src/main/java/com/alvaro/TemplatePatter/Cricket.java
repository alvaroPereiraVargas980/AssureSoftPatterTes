package com.alvaro.TemplatePatter;

public class Cricket extends Game {
    @Override
    public void initialized() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Initialized");
    }

    @Override
   public  void endPlay() {
        System.out.println("Cricket Game Started, Enjoy the game");
    }
}

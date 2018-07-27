package com.alvaro.TemplatePatter;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Fooball extends Game {

    @Override
    public void initialized() {
        System.out.println("Football Game Initialized");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Initialized! Start palying");
    }

    @Override
    public void endPlay() {
        System.out.println("Fooball Game Started. Enjoy the game");
    }
}

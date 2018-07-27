package com.alvaro.Test.TemplatePatter;

import com.alvaro.TemplatePatter.Cricket;
import com.alvaro.TemplatePatter.Fooball;
import com.alvaro.TemplatePatter.Game;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

import static org.junit.Assert.*;


public class TempaltePatterDemoTest {
    private Cricket spy;
    private Fooball fooball;
    @Before
    public void seUp(){
        spy=Mockito.spy(new Cricket());
        fooball=Mockito.spy(new Fooball());
    }

    @Test
    public void mainTemplate() {
        Game game=spy;
        game.play();
        game=fooball;
        game.play();

    }
}

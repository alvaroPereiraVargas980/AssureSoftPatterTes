package com.alvaro.Test.BuilderPatter;


import com.alvaro.BuilderPatter.Samsung;
import org.junit.Test;
import static org.junit.Assert.*;

public class SamsungTest {
  Samsung samsung= new Samsung();
    @Test
    public void price() {
       assertEquals(40,samsung.price());
    }

    @Test
    public void pack() {
       assertEquals("Samsung cd", samsung.pack());
    }
}

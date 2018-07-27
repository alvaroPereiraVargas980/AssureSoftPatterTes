package com.alvaro.Test.BuilderPatter;

import com.alvaro.BuilderPatter.Sony;
import org.junit.Test;
import static org.junit.Assert.*;

public class SonyTest {
   Sony sony=new Sony();
    @Test
    public void price() {
        assertEquals(20,sony.price());
    }
    @Test
    public void pack() {
        assertEquals("Sony cd",sony.pack());
    }
}

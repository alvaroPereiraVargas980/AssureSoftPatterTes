package com.alvaro.Test.AbstractFactoryPatter;

import com.alvaro.AbstractFactoryPatter.Square;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;


public class SquareTest {


    @Test
    public void draw() {
        Square spy=spy(new Square());
        doCallRealMethod().when(spy).draw();
        spy.draw();
        verify(spy,atLeastOnce()).draw();

    }
}

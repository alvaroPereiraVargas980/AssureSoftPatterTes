package com.alvaro.Test.AbstractFactoryPatter;

import com.alvaro.AbstractFactoryPatter.Circle;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CircleTest {

    @Test
    public void draw() {
        Circle spy=spy(new Circle());
        doCallRealMethod().when(spy).draw();
        spy.draw();
        verify(spy,atLeastOnce()).draw();
    }
}

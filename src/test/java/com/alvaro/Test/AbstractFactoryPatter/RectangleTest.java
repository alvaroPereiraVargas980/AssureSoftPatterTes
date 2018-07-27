package com.alvaro.Test.AbstractFactoryPatter;

import com.alvaro.AbstractFactoryPatter.Rectangle;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class RectangleTest {


    @Test
    public void draw() {
        Rectangle spy=spy(new Rectangle());
        doCallRealMethod().when(spy).draw();
        spy.draw();
        verify(spy,atLeastOnce()).draw();

    }
}
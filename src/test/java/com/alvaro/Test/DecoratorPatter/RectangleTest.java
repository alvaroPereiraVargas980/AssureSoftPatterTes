package com.alvaro.Test.DecoratorPatter;


import com.alvaro.DecoratorPatter.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;

import static org.mockito.Mockito.*;


public class RectangleTest {
    @Spy

    private Rectangle rectangle;
    @Before
    public void seUpMock(){
      rectangle=spy(new Rectangle());
    }
    @Test
    public void draw() throws Exception{
      doCallRealMethod().when(rectangle).draw();
      rectangle.draw();
      verify(rectangle,atLeastOnce()).draw();
    }
}

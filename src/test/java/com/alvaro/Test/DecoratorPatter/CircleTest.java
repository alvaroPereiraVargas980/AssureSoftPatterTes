package com.alvaro.Test.DecoratorPatter;


import com.alvaro.DecoratorPatter.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class CircleTest {
    @Spy
    private Circle circle;
    @Before
    public void seUpMock(){
       circle=spy(new Circle());
    }
    @Test
    public void draw() throws Exception{
       doCallRealMethod().when(circle).draw();
       circle.draw();
       verify(circle,atLeastOnce()).draw();

    }
}

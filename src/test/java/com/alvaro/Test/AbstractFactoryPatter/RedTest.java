package com.alvaro.Test.AbstractFactoryPatter;


import com.alvaro.AbstractFactoryPatter.Red;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class RedTest {


    @Test
    public void draw() {
        Red spy=spy(new Red());
        doCallRealMethod().when(spy).fill();
        spy.fill();
        verify(spy,atLeastOnce()).fill();
    }
}
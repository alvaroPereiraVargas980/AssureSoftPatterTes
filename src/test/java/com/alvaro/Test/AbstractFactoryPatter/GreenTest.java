package com.alvaro.Test.AbstractFactoryPatter;


import com.alvaro.AbstractFactoryPatter.Green;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class GreenTest {

    @Test
    public void draw() {
        Green spy=spy(new Green());
        doCallRealMethod().when(spy).fill();
        spy.fill();
        verify(spy,atLeastOnce()).fill();
    }
}

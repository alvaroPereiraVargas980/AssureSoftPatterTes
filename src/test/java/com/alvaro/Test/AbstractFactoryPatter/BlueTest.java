package com.alvaro.Test.AbstractFactoryPatter;

import com.alvaro.AbstractFactoryPatter.Blue;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class BlueTest {
    @Test
    public void fill() {
        Blue spy=spy(new Blue());
        doCallRealMethod().when(spy).fill();
        spy.fill();
        verify(spy,atLeastOnce()).fill();
    }
}

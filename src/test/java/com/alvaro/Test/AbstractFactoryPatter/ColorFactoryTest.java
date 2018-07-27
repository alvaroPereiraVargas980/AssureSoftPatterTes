package com.alvaro.Test.AbstractFactoryPatter;

import com.alvaro.AbstractFactoryPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
public class ColorFactoryTest {


    @Test
    public void getColor_Red() {
        ColorFactory spy=spy(new ColorFactory());
        assertNotNull(spy.getColor("RED"));
    }
    @Test
    public void getColor_Green() {
        ColorFactory spy=spy(new ColorFactory());
        assertNotNull(spy.getColor("GREEN"));
    }
    @Test
    public void getColor_Blue() {
        ColorFactory spy=spy(new ColorFactory());
        assertNotNull(spy.getColor("BLUE"));
}
    @Test
    public void getColor_Null() {
        ColorFactory spy=spy(new ColorFactory());
        assertNull(spy.getColor(null));
    }
    @Test
    public void getColor_Error() {
        ColorFactory spy=spy(new ColorFactory());
        assertNull(spy.getColor("HOLA"));
    }
    @Test
    public void getShape() {
        ColorFactory spy=spy(new ColorFactory());
         assertNull(spy.getShape("CIRCULO"));

    }
}

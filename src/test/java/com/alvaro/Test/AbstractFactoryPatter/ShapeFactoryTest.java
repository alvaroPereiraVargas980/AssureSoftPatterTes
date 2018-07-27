package com.alvaro.Test.AbstractFactoryPatter;

import com.alvaro.AbstractFactoryPatter.*;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ShapeFactoryTest {


    @Test
    public void getColor_Red() {
       ShapeFactory spy=spy(new ShapeFactory());
       assertNotNull(spy.getShape("CIRCLE"));
    }
    @Test
    public void getColor_Green() {
        ShapeFactory spy=spy(new ShapeFactory());
        assertNotNull(spy.getShape("RECTANGLE"));
    }
    @Test
    public void getColor_Blue() {
        ShapeFactory spy=spy(new ShapeFactory());
        assertNotNull(spy.getShape("SQUARE"));
    }
    @Test
    public void getColor_Null() {
        ShapeFactory spy = spy(new ShapeFactory());
        assertNull(spy.getShape(null));

    }
    @Test
    public void getColor_Error() {
        ShapeFactory spy = spy(new ShapeFactory());
        assertNull(spy.getShape("HOLA"));

    }
    @Test
    public void getColor() {
            ShapeFactory spy=spy(new ShapeFactory());
            assertNull(spy.getColor("RED"));

    }
}

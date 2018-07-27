package com.alvaro.Test.DecoratorPatter;


import com.alvaro.DecoratorPatter.Circle;
import com.alvaro.DecoratorPatter.Rectangle;
import com.alvaro.DecoratorPatter.RedShapeDecorator;
import com.alvaro.DecoratorPatter.Shape;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class DecoratorPatterDemoTest {

    @Test
    public void circle() {
        Circle circle=mock(Circle.class);
        RedShapeDecorator spy=spy(new RedShapeDecorator(circle));
        doCallRealMethod().when(spy).draw();
        spy.draw();
        verify(spy).draw();

    }
    @Test
    public void rectangle() {
        Shape shape=mock(Shape.class);
        RedShapeDecorator spy=spy(new RedShapeDecorator(shape));
        doCallRealMethod().when(spy).draw();
        spy.draw();
        verify(spy).draw();

    }
}

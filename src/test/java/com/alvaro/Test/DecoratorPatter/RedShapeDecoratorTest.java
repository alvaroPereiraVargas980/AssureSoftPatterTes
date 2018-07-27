package com.alvaro.Test.DecoratorPatter;


import com.alvaro.DecoratorPatter.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
public class RedShapeDecoratorTest {
    private Shape shape;
    private RedShapeDecorator redShapeDecorator;

    @Before
    public void setUpmock(){
    shape=mock(Shape.class);
    }
    @Test
    public void setRedBorder() {
        RedShapeDecorator spy=spy(new RedShapeDecorator(shape));
        doCallRealMethod().when(spy).setRedBorder(shape);
        spy.setRedBorder(shape);
        verify(spy,atLeastOnce()).setRedBorder(shape);
    }

    @Test
    public void setDraw(){
        RedShapeDecorator spy=spy(new RedShapeDecorator(shape));
        doCallRealMethod().when(spy).draw();
        spy.draw();
        verify(spy,atLeastOnce()).draw();
    }
}

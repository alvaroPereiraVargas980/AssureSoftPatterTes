package com.alvaro.Test.ObserverPatter;

import com.alvaro.ObserverPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;


public class HexaObserverTest {

    private Subject subject;
    private HexaObserver spy;
    @Before
    public void setUpMock(){
     subject=mock(Subject.class);
     spy=Mockito.spy(new HexaObserver(subject));
    }
    @Test
    public void update() throws Exception{
        doCallRealMethod().when(spy).update();
        spy.update();
        verify(spy).update();
    }
}

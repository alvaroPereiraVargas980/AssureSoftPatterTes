package com.alvaro.Test.ObserverPatter;


import com.alvaro.ObserverPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;


public class OctalObserverTest {

    private Subject subject;
    private OctalObserver spy;

    @Before
    public void setUpMock() {
      subject=mock(Subject.class);
      spy=Mockito.spy(new OctalObserver(subject));

    }
    @Test
    public void update() throws Exception {
        doCallRealMethod().when(spy).update();
        spy.update();
        verify(spy).update();


    }
}

package com.alvaro.Test.ObserverPatter;

import com.alvaro.ObserverPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class BinaryObserverTest {

    private BinaryObserver spy;
    private Subject subject;
    @Before
    public void setUpMock(){
        subject=mock(Subject.class);
        spy=Mockito.spy(new BinaryObserver(subject));
    }
    @Test
    public void update(){
            doCallRealMethod().when(spy).update();
            spy.update();
            verify(spy).update();

    }
}


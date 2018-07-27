package com.alvaro.Test.ObserverPatter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import com.alvaro.ObserverPatter.*;
import org.mockito.Mockito;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class SubjectTest {
    private Subject spy;
    private  Observer observer;
    @Before
    public void setUpMock(){

        observer=mock(Observer.class);
         spy=spy(new Subject());
    }

    @Test
    public void getState() {
     assertNotNull(spy.getState());
    }

    @Test
    public void setState() {
    doCallRealMethod().when(spy).setState(5);
    doCallRealMethod().when(spy).notifyAllOnservers();
    spy.notifyAllOnservers();
    spy.setState(5);
    verify(spy).setState(5);
    verify(spy,atLeastOnce()).notifyAllOnservers();
    }

    @Test
    public void attachList() {
        List<Observer> observerList= new ArrayList<>();
        List spy= Mockito.spy(observerList);
        doReturn(true).when(spy).add(observer);
        assertTrue(spy.add(observer));

    }

    @Test
    public void notifyAllOnservers() {
        Subject subject=spy(new Subject());
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        subject.setState(15);
        subject.setState(10);


    }
}

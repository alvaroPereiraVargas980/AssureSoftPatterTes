package com.alvaro.Test.StrategyPatter;

import com.alvaro.StrategyPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;


public class OperationSubtractTest {
    private OperationSubtract spy;

    @Before
    public void setUp(){

       spy=Mockito.spy(new OperationSubtract());
    }
    @Test
    public void doOperation() {
       doReturn(5).when(spy).doOperation(10,15);
       assertEquals(5,spy.doOperation(10,15));
    }
}

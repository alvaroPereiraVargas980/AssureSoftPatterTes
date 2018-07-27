package com.alvaro.Test.StrategyPatter;

import org.junit.Before;
import org.junit.Test;
import com.alvaro.StrategyPatter.*;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OperationAddTest {
    private OperationAdd spy;

    @Before
    public void setUp(){

        spy=Mockito.spy(new OperationAdd());
    }
    @Test
    public void doOperation() {
      doReturn(10).when(spy).doOperation(5,5);
      assertEquals(10,spy.doOperation(5,5));

    }
}

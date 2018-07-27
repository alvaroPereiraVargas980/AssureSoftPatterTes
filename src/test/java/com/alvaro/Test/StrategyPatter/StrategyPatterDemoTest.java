package com.alvaro.Test.StrategyPatter;


import com.alvaro.StrategyPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.doReturn;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class StrategyPatterDemoTest {
    Strategy strategy;
    Context spy;
    @Before
    public void setUp(){
        strategy=mock(Strategy.class);


    }
    @Test
    public void mainM() {
        spy=Mockito.spy(new Context(new OperatioMultiply()));
        assertNotNull(spy.executesStrategy(10,5));
    }
    @Test
    public void mainS() {
        spy=Mockito.spy(new Context(new OperationAdd()));
        assertNotNull(spy.executesStrategy(10,5));
    }
    @Test
    public void mainA() {
        spy=Mockito.spy(new Context(new OperationSubtract()));
        assertNotNull(spy.executesStrategy(10,5));
    }
}

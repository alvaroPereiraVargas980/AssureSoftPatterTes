package com.alvaro.Test.StrategyPatter;

import org.junit.Before;
import org.junit.Test;
import com.alvaro.StrategyPatter.*;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

public class OperatioMultiplyTest {
   private OperatioMultiply spy;

   @Before
   public void setUp(){
       spy=Mockito.spy(new OperatioMultiply());
   }
    @Test
    public void doOperation() {
       doReturn(25).when(spy).doOperation(5,5);
       assertEquals(25,spy.doOperation(5,5));
    }
}

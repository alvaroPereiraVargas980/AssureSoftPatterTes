package com.alvaro.Test.CommandPattern;

import static org.mockito.Mockito.*;
import com.alvaro.CommandPatter.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.PrintStream;

public class StockTest {
    private Stock stock;

    @Before
    public void setUpStreams() {

        stock=spy(new Stock());
    }

    @Test
    public void buy() throws Exception{
      doCallRealMethod().when(stock).buy();
      stock.buy();
      verify(stock,atLeastOnce()).buy();
    }
    @Test
    public void sell() throws Exception{
        doCallRealMethod().when(stock).sell();
        stock.sell();
        verify(stock,atLeastOnce()).sell();
    }
}

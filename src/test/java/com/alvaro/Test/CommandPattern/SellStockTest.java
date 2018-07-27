package com.alvaro.Test.CommandPattern;
import com.alvaro.CommandPatter.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class SellStockTest {
    private Stock abcStock;
    private SellStock sellStock;
    @Before
    public void setUpMsock() {
        abcStock=mock(Stock.class);
        sellStock=spy(new SellStock(abcStock));
    }
    @Test
    public void execute() throws Exception{
       doCallRealMethod().when(sellStock).execute();
       sellStock.execute();
       verify(sellStock,atLeastOnce()).execute();
        }
    }


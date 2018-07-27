package com.alvaro.Test.CommandPattern;
import static org.mockito.Mockito.*;

import com.alvaro.CommandPatter.*;
import org.junit.Before;
import org.junit.Test;

public class BuyStockTest {

    private Stock abcStock;
    private BuyStock buyStock;

    @Before
    public void setUpMock(){
       abcStock=mock(Stock.class);
       buyStock=spy(new BuyStock(abcStock));
    }
    @Test
    public void execute()throws Exception {
       doCallRealMethod().when(buyStock).execute();
       buyStock.execute();
       verify(buyStock,atLeastOnce()).execute();
    }
}

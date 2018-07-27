package com.alvaro.Test.CommandPattern;


import com.alvaro.CommandPatter.Broker;
import com.alvaro.CommandPatter.BuyStock;
import com.alvaro.CommandPatter.SellStock;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class CommandPatterDemoTest {
    private BuyStock buyStock;
    private SellStock sellStock;

    @Before
    public void seUp(){
        buyStock=mock(BuyStock.class);
        sellStock=mock(SellStock.class);
    }
    @Spy
    Broker broker;
    @Test
    public void main() {

       broker=spy(new Broker());
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.palceOrders();
    }
}

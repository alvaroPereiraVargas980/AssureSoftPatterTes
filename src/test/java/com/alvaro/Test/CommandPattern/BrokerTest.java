package com.alvaro.Test.CommandPattern;

import com.alvaro.CommandPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.*;


public class BrokerTest {
    private Order order;
    @Spy
    Broker broker;
    @Before
    public void setUp(){
        order=mock(Order.class);

    }

    @Test
    public void takeOrder() throws Exception{
        broker=spy(new Broker());
        doCallRealMethod().when(broker).takeOrder(order);
        broker.takeOrder(order);
        broker.takeOrder(order);
        verify(broker,times(2)).takeOrder(order);

    }

    @Test
    public void list() throws Exception{
        List<Order> orderList=spy(new ArrayList<Order>());
        orderList.add(order);
        assertNotNull(orderList.get(0));

    }
    @Test
    public void placeOrders(){
        broker=spy(new Broker());
        doCallRealMethod().when(broker).palceOrders();
        broker.palceOrders();
        verify(broker,atLeastOnce()).palceOrders();
    }


}

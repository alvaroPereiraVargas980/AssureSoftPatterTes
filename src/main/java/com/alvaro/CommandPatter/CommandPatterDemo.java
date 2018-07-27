package com.alvaro.CommandPatter;

public class CommandPatterDemo {
    public static void main (String [] arg){
        Stock abcStock =new Stock();

        BuyStock buyStock=new BuyStock(abcStock);
        SellStock sellStock =new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.palceOrders();
    }
}

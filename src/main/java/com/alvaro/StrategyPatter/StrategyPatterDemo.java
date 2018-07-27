package com.alvaro.StrategyPatter;

public class StrategyPatterDemo {
    public static void main(String[] arg) {
        Context context = new Context(new OperationAdd());
        System.out.println("10+5=" + context.executesStrategy(10, 5));


        context= new Context(new OperatioMultiply());
        System.out.println("10*5=" + context.executesStrategy(10,5));

        context=new Context(new OperationSubtract());
        System.out.println("10-5=" + context.executesStrategy(10,5));

    }
}
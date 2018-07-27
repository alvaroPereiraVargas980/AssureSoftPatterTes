package com.alvaro.ChainResponsabilityPatter;

public class Dollar10Dispenser implements DisperseChain {
    private DisperseChain chain;
    @Override
    public void setNextChain(DisperseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void disperse(Currency cur) {
            if(cur.getAmount()>=10){
                int num=cur.getAmount()/10;
                int reimainder=cur.getAmount()%10;
                System.out.println("Disprsing" + num+" "+"10$ note");
                if(reimainder!=0)this.chain.disperse(new Currency(reimainder));

            }
    }
}

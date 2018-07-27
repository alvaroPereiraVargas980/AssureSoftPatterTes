package com.alvaro.ChainResponsabilityPatter;

public class Dollar20Dispenser implements DisperseChain {
    private DisperseChain chain;
    @Override
    public void setNextChain(DisperseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void disperse(Currency cur) {
            if(cur.getAmount()>=20){
                int num=cur.getAmount()/20;
                int remainder=cur.getAmount()%20;
                System.out.println("Dispersing" + num+ " "+ "20$ note");
                if(remainder!=0)this.chain.disperse(new Currency(remainder));
            }
    }
}

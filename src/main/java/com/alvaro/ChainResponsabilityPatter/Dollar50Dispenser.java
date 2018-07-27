package com.alvaro.ChainResponsabilityPatter;

public class Dollar50Dispenser implements DisperseChain {
    private DisperseChain chain;
    @Override
    public void setNextChain(DisperseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void disperse(Currency cur) {
        if(cur.getAmount()>=50){
            int num=cur.getAmount()/50;
            int remaider = cur.getAmount()%50;
            System.out.println("Dispensing " + num+" "+ "50$ note");
            if (remaider !=0) this.chain.disperse(new Currency(remaider));
        }

    }
}

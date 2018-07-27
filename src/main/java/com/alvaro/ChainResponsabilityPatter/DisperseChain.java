package com.alvaro.ChainResponsabilityPatter;

public interface DisperseChain {
    void setNextChain(DisperseChain nextChain);
    void disperse(Currency cur);
}

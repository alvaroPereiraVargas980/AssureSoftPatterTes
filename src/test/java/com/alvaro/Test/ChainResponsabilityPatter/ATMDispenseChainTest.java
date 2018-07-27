package com.alvaro.Test.ChainResponsabilityPatter;

import com.alvaro.ChainResponsabilityPatter.ATMDispenseChain;
import com.alvaro.ChainResponsabilityPatter.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class ATMDispenseChainTest {
    private DisperseChain chain1;
    private DisperseChain chain2;
    private DisperseChain chain3;

    @Before
    public void seUp(){

        chain1=mock(DisperseChain.class);
        chain2=mock(DisperseChain.class);
        chain3=mock(DisperseChain.class);
    }
    @Test
    public void testStart() {
        ATMDispenseChain spy=spy(new ATMDispenseChain());
      chain1=new Dollar10Dispenser();
       chain2=new Dollar20Dispenser();
       chain3=new Dollar50Dispenser();
       chain1.setNextChain(chain2);
       chain2.setNextChain(chain3);

    }

}

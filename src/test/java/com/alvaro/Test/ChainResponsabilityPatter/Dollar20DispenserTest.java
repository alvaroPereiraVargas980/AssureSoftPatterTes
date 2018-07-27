package com.alvaro.Test.ChainResponsabilityPatter;

import com.alvaro.ChainResponsabilityPatter.Currency;
import com.alvaro.ChainResponsabilityPatter.DisperseChain;
import com.alvaro.ChainResponsabilityPatter.Dollar20Dispenser;
import org.junit.Before;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.atLeastOnce;
import org.junit.Test;
import org.mockito.Mockito;

public class Dollar20DispenserTest {
    private DisperseChain chain;


    @Before
    public void setUpMock(){

       chain=mock(DisperseChain.class);
    }
    @Test
    public void setNextChain() throws Exception{
        Dollar20Dispenser spy=Mockito.spy(new Dollar20Dispenser());
        doCallRealMethod().when(spy).setNextChain(chain);
        spy.setNextChain(chain);
        verify(spy,atLeastOnce()).setNextChain(chain);
    }

    @Test
    public void disperseTestIsNull() throws Exception{
        Currency currency =mock(Currency.class);
        when(currency.getAmount()).thenReturn(100);
        Dollar20Dispenser spy=Mockito.spy(new  Dollar20Dispenser());
        doCallRealMethod().when(spy).disperse(currency);
        spy.disperse(currency);
        verify(spy,atLeastOnce()).disperse(currency);
    }

}

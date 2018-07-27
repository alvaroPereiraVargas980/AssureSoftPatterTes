package com.alvaro.Test.ChainResponsabilityPatter;
import com.alvaro.ChainResponsabilityPatter.Currency;
import com.alvaro.ChainResponsabilityPatter.DisperseChain;
import com.alvaro.ChainResponsabilityPatter.Dollar10Dispenser;
import com.alvaro.ChainResponsabilityPatter.Dollar20Dispenser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


public class Dollar10DispenserTest {
    private DisperseChain chain;
    @Before
    public void setUpMock(){
        chain=mock(DisperseChain.class);
    }
    @Test
    public void setNextChain() {
        Dollar10Dispenser spy=Mockito.spy(new Dollar10Dispenser());
      doCallRealMethod().when(spy).setNextChain(chain);
      spy.setNextChain(chain);
      verify(spy,atLeastOnce()).setNextChain(chain);
    }
    @Test
    public void disperseTestIs120(){
        Currency currency=mock(Currency.class);
        when(currency.getAmount()).thenReturn(120).thenReturn(100).thenReturn(50);
        Dollar10Dispenser spy=Mockito.spy(new Dollar10Dispenser());
        doCallRealMethod().when(spy).disperse(currency);
        spy.disperse(currency);
        verify(spy,atLeastOnce()).disperse(currency);

    }


}

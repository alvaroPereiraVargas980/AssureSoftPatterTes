package com.alvaro.Test.ChainResponsabilityPatter;
import com.alvaro.ChainResponsabilityPatter.Currency;
import org.junit.Test;
import org.mockito.InjectMocks;
import static org.junit.Assert.*;


public class CurrencyTest {

    @InjectMocks
    Currency currency=new Currency(20);
    @Test
    public void getAmountActualAmount() {

          assertEquals(20,currency.getAmount());
    }
    @Test
    public void getAmountNotNull(){
        assertNotNull(currency.getAmount());
    }
}

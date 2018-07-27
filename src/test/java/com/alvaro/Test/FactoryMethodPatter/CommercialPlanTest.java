package com.alvaro.Test.FactoryMethodPatter;
import com.alvaro.FactoryMathodPatter.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;


public class CommercialPlanTest {
    @Spy
    private CommercialPlan spy;

    @Before
    public void setUpMock(){
        spy=spy(new CommercialPlan());

    }
    @Test
    public void getRate() {
       doCallRealMethod().when(spy).getRate();
       spy.getRate();
       verify(spy,atLeastOnce()).getRate();

    }
}

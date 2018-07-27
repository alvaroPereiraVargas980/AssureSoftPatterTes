package com.alvaro.Test.FactoryMethodPatter;

import com.alvaro.FactoryMathodPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class DomesticPlanTest {
    private DomesticPlan spy;

    @Before
    public void setUpMock(){
       spy=Mockito.spy(new DomesticPlan());
    }
    @Test
    public void getRate() {
        doCallRealMethod().when(spy).getRate();
        spy.getRate();
        verify(spy).getRate();

    }
}

package com.alvaro.Test.FactoryMethodPatter;


import com.alvaro.FactoryMathodPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PlanTest {

    @Before
    public void setUpmock(){
    }


    @Test
    public void getRate() {
    }

    @Test
    public void calculateBill() {
        GetPlanFactory spy=spy(new GetPlanFactory());
        Plan p = spy.getPlan("INSTITUCIONALPLAN");
        p.calculateBill(500);

    }
}

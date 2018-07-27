package com.alvaro.Test.FactoryMethodPatter;


import com.alvaro.FactoryMathodPatter.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class GetPlanFactoryTest {
    private GetPlanFactory getPlanFactory;


    @Test
    public void getPlanDomestic() {
       getPlanFactory=new GetPlanFactory();
       assertNotNull(getPlanFactory.getPlan("DOMESTICPLAN"));

    }
    @Test
    public void getPlanComercial() {
        getPlanFactory=new GetPlanFactory();
        assertNotNull(getPlanFactory.getPlan("COMMERCIALPLAN"));
    }
    @Test
    public void getPlanInstitucional() {
        getPlanFactory=new GetPlanFactory();
        assertNotNull(getPlanFactory.getPlan("INSTITUCIONALPLAN"));
    }
    @Test
    public void getPlanEmphy() {
        getPlanFactory=new GetPlanFactory();
        assertNull(getPlanFactory.getPlan(""));
    }
    @Test
    public void getPlanNull() {
        getPlanFactory=new GetPlanFactory();
        assertNull(getPlanFactory.getPlan(null));
    }
    }



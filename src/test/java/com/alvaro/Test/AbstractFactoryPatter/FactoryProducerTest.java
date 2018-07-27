package com.alvaro.Test.AbstractFactoryPatter;
import com.alvaro.AbstractFactoryPatter.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;

public class FactoryProducerTest {
    private FactoryProducer factoryProducer=new FactoryProducer();



    @Test
    public void getFactory_Shape() {

       assertNotNull(factoryProducer.getFactory("SHAPE"));
    }
    @Test
    public void getFactory_Color() {

        assertNotNull(factoryProducer.getFactory("COLOR"));
    }
    @Test
    public void getFactory_Null() {

        assertNull(factoryProducer.getFactory("HOLA"));
    }

}

package com.alvaro.Test.SingletonPatter;

import com.alvaro.SingletonPatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.*;

public class InstitudeTest {
     private Institude spy;
    @Before
    public void seUpMock(){
    spy=Mockito.spy(new Institude());

    }

    @Test
    public void getInstance() {

        assertNotNull(spy.getInstance());
    }

    @Test
    public void getNameInstitute() {
        doCallRealMethod().when(spy).getNameInstitute();
        spy.getNameInstitute();
        verify(spy).getNameInstitute();

    }

    @Test
    public void setNameInstitute() throws Exception{
        doCallRealMethod().when(spy).setNameInstitute("SUECIA");
        spy.setNameInstitute("SUECIA");
        verify(spy).setNameInstitute("SUECIA");
    }
}

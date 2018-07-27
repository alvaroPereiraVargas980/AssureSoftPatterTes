package com.alvaro.Test.CompositePatter;

import com.alvaro.CompositePatter.FinalcialDepartament;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class FinalcialDepartamentTest {

    @Spy
    FinalcialDepartament spy;
    @Before
    public void seUpMock(){
       spy=spy(new FinalcialDepartament(1,"Sales department"));

    }

    @Test
    public void printDepartament() throws Exception{
      doCallRealMethod().when(spy).printDepartament();
      spy.printDepartament();
      verify(spy,atLeastOnce()).printDepartament();
    }
}

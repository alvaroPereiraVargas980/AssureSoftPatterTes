package com.alvaro.Test.CompositePatter;


import com.alvaro.CompositePatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;


public class SalesDepartmentTest {
    @Spy
    SalesDepartment spy;

    @Before
    public void seUpMock(){
        spy=spy(new SalesDepartment(2,"Financial deparment"));
    }
    @Test
    public void printDepartament() throws Exception{
        doCallRealMethod().when(spy).printDepartament();
        spy.printDepartament();
        verify(spy,atLeastOnce()).printDepartament();
    }
    }


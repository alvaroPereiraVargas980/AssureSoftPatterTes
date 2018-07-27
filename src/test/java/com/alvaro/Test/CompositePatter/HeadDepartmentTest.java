package com.alvaro.Test.CompositePatter;


import com.alvaro.CompositePatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class HeadDepartmentTest {
    @Mock
   Department department;
   @Spy
   HeadDepartment spy;
   @Before
   public void setUpseMonk(){
        spy=spy(new HeadDepartment(3,"Head department"));
      department=mock(Department.class);
   }

    @Test
    public void addDepartment() throws Exception{
       doCallRealMethod().when(spy).addDepartment(department);
        spy.addDepartment(department);
        verify(spy,atLeastOnce()).addDepartment(department);
    }

    @Test
    public void removeDepartment() {
        doCallRealMethod().when(spy).removeDepartment(department);
        spy.removeDepartment(department);
        verify(spy,atLeastOnce()).removeDepartment(department);
    }

    @Test
    public void printDepartament() throws Exception{
        doCallRealMethod().when(spy).printDepartament();
        spy.printDepartament();
        verify(spy,atLeastOnce()).printDepartament();
    }
}

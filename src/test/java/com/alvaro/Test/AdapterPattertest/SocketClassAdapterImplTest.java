package com.alvaro.Test.AdapterPattertest;


import com.alvaro.AdapterPatter.SocketClassAdapterImpl;
import com.alvaro.AdapterPatter.Volt;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class SocketClassAdapterImplTest {
    SocketClassAdapterImpl socketClassAdapter=new SocketClassAdapterImpl();
    @Test
    public void get120Volt() {

     assertNotNull(socketClassAdapter.get120Volt());
    }

    @Test
    public void get12Volt() {

     assertNotNull(socketClassAdapter.get12Volt());
    }

    @Test
    public void get3Volt() {
     assertNotNull(socketClassAdapter.get3Volt());
    }
    @Test
    public void convertVolttest(){
        Volt volt=mock(Volt.class);
        assertNotNull(socketClassAdapter.convertVolt(volt,3));
    }
}

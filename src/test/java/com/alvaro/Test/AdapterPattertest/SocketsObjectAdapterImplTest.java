package com.alvaro.Test.AdapterPattertest;

import com.alvaro.AdapterPatter.SocketsObjectAdapterImpl;
import com.alvaro.AdapterPatter.Volt;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class SocketsObjectAdapterImplTest {
    SocketsObjectAdapterImpl socketsObjectAdapter =new SocketsObjectAdapterImpl();

    @Test
    public void get120VoltTest() {
        assertNotNull(socketsObjectAdapter.get120Volt());
    }

    @Test
    public void get12VoltTest() {

        assertNotNull(socketsObjectAdapter.get12Volt());

    }

    @Test
    public void get3VoltTest() {

        assertNotNull(socketsObjectAdapter.get3Volt());
    }
    @Test
    public void convertVoltTes(){
        Volt volt=mock(Volt.class);
        assertNotNull(socketsObjectAdapter.converVolt(volt,3));
    }

}

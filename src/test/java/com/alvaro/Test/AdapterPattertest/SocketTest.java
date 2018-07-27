package com.alvaro.Test.AdapterPattertest;

import com.alvaro.AdapterPatter.Socket;
import com.alvaro.AdapterPatter.Volt;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
public class SocketTest {
    private Volt volt;

    @Before
    public void setUp(){
        volt=mock(Volt.class);
    }
    @Test
    public void getVolt() {
      doReturn(120).when(volt).getVolts();
      Socket socket=new Socket();
      assertNotNull(socket.getVolt());
    }
}

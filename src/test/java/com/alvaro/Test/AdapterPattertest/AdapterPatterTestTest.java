package com.alvaro.Test.AdapterPattertest;

import com.alvaro.AdapterPatter.AdapterPatterTest;
import com.alvaro.AdapterPatter.SocketAdapter;
import com.alvaro.AdapterPatter.Volt;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;

public class AdapterPatterTestTest {
    private Volt volt;
    private SocketAdapter socketAdapter;

    @Before
    public void setuMock() {
        volt = mock(Volt.class);
        socketAdapter = mock(SocketAdapter.class);

    }

    @Test
    public void testObjetAdapter() {
        AdapterPatterTest spy=spy(new AdapterPatterTest());
        doCallRealMethod().when(spy).testObjetAdapter();
        spy.testObjetAdapter();
        verify(spy).testObjetAdapter();
        when(volt.getVolts()).thenReturn(120).thenReturn(12).thenReturn(3);
        assertEquals(volt.getVolts(), 120);
        assertEquals(volt.getVolts(), 12);
        assertEquals(volt.getVolts(), 3);
    }

    @Test
    public void testClassAdapter() {
        AdapterPatterTest spy=spy(new AdapterPatterTest());
        doCallRealMethod().when(spy).testClassAdapter();
        spy.testClassAdapter();
        verify(spy).testClassAdapter();
        when(volt.getVolts()).thenReturn(120).thenReturn(12).thenReturn(3);
        assertEquals(volt.getVolts(), 120);
        assertEquals(volt.getVolts(), 12);
        assertEquals(volt.getVolts(), 3);
    }

    @Test
    public void getVolt120() {
        AdapterPatterTest adapterPatterTest = new AdapterPatterTest();
        when(socketAdapter.get120Volt()).thenReturn(volt);
        assertNotNull(adapterPatterTest.getVolt(socketAdapter, 120));
    }

        @Test
        public void getVolt12 () {
            AdapterPatterTest adapterPatterTest = new AdapterPatterTest();
            when(socketAdapter.get12Volt()).thenReturn(volt);
            assertNotNull(adapterPatterTest.getVolt(socketAdapter, 12));
        }
        @Test
        public void getVolt3 () {
            AdapterPatterTest adapterPatterTest = new AdapterPatterTest();
            when(socketAdapter.get3Volt()).thenReturn(volt);
            assertNotNull(adapterPatterTest.getVolt(socketAdapter, 3));
        }
        @Test
        public void getVoltDefault () {
            AdapterPatterTest adapterPatterTest = new AdapterPatterTest();
             when(socketAdapter.get120Volt()).thenReturn(volt);
            assertNotNull(adapterPatterTest.getVolt(socketAdapter, 789));


        }
    }


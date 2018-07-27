package com.alvaro.Test.BridgePatter;


import com.alvaro.BridgePatter.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SamSungTvTest {
    SamSungTv samSungTv = Mockito.mock(SamSungTv.class);
    private ByteArrayOutputStream printOn = new ByteArrayOutputStream();
    private ByteArrayOutputStream printOff= new ByteArrayOutputStream();
    @Before
    public void setUpMock() {
        System.setOut(new PrintStream(printOn));
        System.setErr(new PrintStream(printOff));
    }
    @Test
    public void on() throws Exception {

        doNothing().when(samSungTv).on();
        samSungTv.on();
        verify(samSungTv,atLeastOnce()).on();
        System.out.print("Samsung is turned on");
        assertEquals("Samsung is turned on",printOn.toString());
    }
    @Test
    public void off() throws Exception{
        doNothing().when(samSungTv).off();
        samSungTv.off();
        verify(samSungTv,atLeastOnce()).off();
        System.err.print("Samsung es turned off");
        assertEquals("Samsung es turned off",printOff.toString());
    }

    @Test
    public void switchChannel() throws Exception{
        doNothing().when(samSungTv).switchChannel(any(Integer.class));
        samSungTv.switchChannel(any(Integer.class));
        verify(samSungTv,atLeastOnce()).switchChannel(any(Integer.class));

    }

}

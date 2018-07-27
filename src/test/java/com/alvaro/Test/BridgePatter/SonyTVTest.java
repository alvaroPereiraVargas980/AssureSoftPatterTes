package com.alvaro.Test.BridgePatter;
import com.alvaro.BridgePatter.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class SonyTVTest {
    SonyTV sonyTV = Mockito.mock(SonyTV.class);
    private ByteArrayOutputStream printOn = new ByteArrayOutputStream();
    private ByteArrayOutputStream printOff = new ByteArrayOutputStream();

    @Before
    public void setUpMock() {
        System.setOut(new PrintStream(printOn));
        System.setErr(new PrintStream(printOff));
    }

    @Test
    public void on() throws Exception {
        doNothing().when(sonyTV).on();
        sonyTV.on();
        verify(sonyTV, atLeastOnce()).on();
        System.out.print("Samsung is turned on");
        assertEquals("Samsung is turned on", printOn.toString());
    }

    @Test
    public void off() throws Exception {
        doNothing().when(sonyTV).off();
        sonyTV.off();
        verify(sonyTV, atLeastOnce()).off();
        System.err.print("Samsung es turned off");
        assertEquals("Samsung es turned off", printOff.toString());
    }

    @Test
    public void switchChannel() throws Exception {
        doNothing().when(sonyTV).switchChannel(any(Integer.class));
        sonyTV.switchChannel(any(Integer.class));
        verify(sonyTV, atLeastOnce()).switchChannel(any(Integer.class));

    }
}

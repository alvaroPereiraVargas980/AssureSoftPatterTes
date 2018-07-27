package com.alvaro.Test.AdapterPattertest;

import com.alvaro.AdapterPatter.Volt;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class VoltTest {
    Volt volt=new Volt(120);

    @Test
    public void getVolts() {
        assertNotNull(volt.getVolts());
    }

    @Test
    public void setVolts() {
        volt.setVolts(120);
    }
}

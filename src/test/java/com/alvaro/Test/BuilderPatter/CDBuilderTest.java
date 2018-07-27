package com.alvaro.Test.BuilderPatter;

import com.alvaro.BuilderPatter.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class CDBuilderTest {

    @Test
    public void buildSony() {
        CDBuilder cdBuilder=new CDBuilder();
        assertNotNull(cdBuilder.buildSony());
    }

    @Test
    public void buildSamsung() {
        CDBuilder cdBuilder=new CDBuilder();
        assertNotNull(cdBuilder.buildSamsung());

    }
}

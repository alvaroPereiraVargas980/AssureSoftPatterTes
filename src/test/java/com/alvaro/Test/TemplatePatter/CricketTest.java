package com.alvaro.Test.TemplatePatter;


import com.alvaro.TemplatePatter.Cricket;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
public class CricketTest {
    private Cricket spy;

    @Before
    public void setUpMock() {

        spy=Mockito.spy(new Cricket());
    }

    @Test
    public void initialized() throws Exception{
       doCallRealMethod().when(spy).initialized();
       spy.initialized();
       verify(spy).initialized();
    }

    @Test
    public void startPlay() throws Exception{
        doCallRealMethod().when(spy).startPlay();
        spy.startPlay();
        verify(spy).startPlay();

       }

        @Test
        public void endPlay () throws Exception{
        doCallRealMethod().when(spy).endPlay();
        spy.endPlay();
        verify(spy).endPlay();
        }

    }



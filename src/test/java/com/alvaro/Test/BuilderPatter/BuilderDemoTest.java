package com.alvaro.Test.BuilderPatter;

import java.util.ArrayList;
import java.util.List;
import com.alvaro.BuilderPatter.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BuilderDemoTest {
    private CDBuilder cdBuilder;
    private CDtype cDtype;
    private Packing packing;
    private Sony sony;
    private Samsung samsung;

    @Before
    public void setUp(){
        packing=mock(Packing.class);
        sony=mock(Sony.class);
        samsung=mock(Samsung.class);
    }
    @Test
    public void mainSony() {
        cDtype=new CDtype();
        when(sony.price()).thenReturn(40);
        cDtype.addItem(sony);
        cDtype.getCost();
        cDtype.showItems();
        cdBuilder=mock(CDBuilder.class);
        when(cdBuilder.buildSony()).thenReturn(cDtype);
        assertNotNull(cdBuilder.buildSony());
    }
    @Test
    public void mainSamsung() {
        cDtype=new CDtype();
        when(samsung.price()).thenReturn(30);
        cDtype.addItem(samsung);
        cDtype.getCost();
        cDtype.showItems();
        cdBuilder=mock(CDBuilder.class);
        when(cdBuilder.buildSamsung()).thenReturn(cDtype);
        assertNotNull(cdBuilder.buildSamsung());
    }
}

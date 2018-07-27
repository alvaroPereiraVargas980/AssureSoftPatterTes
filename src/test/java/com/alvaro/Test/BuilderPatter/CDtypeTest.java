package com.alvaro.Test.BuilderPatter;

import com.alvaro.BuilderPatter.CDtype;
import com.alvaro.BuilderPatter.Packing;
import com.alvaro.BuilderPatter.Samsung;
import com.alvaro.BuilderPatter.Sony;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;
import java.util.Iterator;
import org.mockito.Spy;
import java.util.ArrayList;
import java.util.List;

public class CDtypeTest {
  private Packing packing;
    private Sony sony;
    private Samsung samsung;
    @Spy
    private List<Packing> spy = new ArrayList();
    @Before
    public void setUp()  {
        packing=mock(Packing.class);
        sony=mock(Sony.class);
        samsung=mock(Samsung.class);
        CDtype cDtype=new CDtype();
        cDtype.addItem(packing);
    }
    @Test
    public void addItemWhenIsNull() {
        spy.add(null);
        assertNull(spy.get(0));
    }
    @Test
    public void addItemWhenIsObject() {
        spy.add(packing);
        assertNotNull(spy.get(0));
    }
    @Test
    public void getCostSony() throws Exception {
        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn(sony);
        assertNotNull(i.next());
    }
    @Test
    public void getCostSamsung() throws Exception {
        Iterator i = mock(Iterator.class);
        spy.add(sony);
        spy.add(samsung);
        when(i.next()).thenReturn(spy);
        assertNotNull(i.next());
    }
    @Test
    public void showItems() throws Exception{
        Iterator i = mock(Iterator.class);
        spy.add(sony);
        spy.add(samsung);
        when(i.next()).thenReturn(spy);
        assertNotNull(i.next());


    }
}

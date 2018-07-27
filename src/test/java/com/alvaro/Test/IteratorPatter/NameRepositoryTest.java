package com.alvaro.Test.IteratorPatter;

import com.alvaro.IteratorPatter.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NameRepositoryTest {
    private NameRepository spy;

    //     public String names[]={"Alvaro","Roberto","Carlos"};
    @Before
    public void seUp() {
        spy = new NameRepository();
    }

    @Test
    public void getIterator() {
        assertNotNull(spy.getIterator());

    }

    @Test
    public void hastNextTestTrue() {
        assertTrue(spy.getIterator().hasNext());
    }
    @Test
    public void hastNextTestNull() {
        assertNotNull(spy.getIterator().next());
    }

    @Test
    public void hast() {
        for (Iterator iter = spy.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("TestPueba: " + name);

        }
    }
}
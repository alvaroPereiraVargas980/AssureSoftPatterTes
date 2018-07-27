package com.alvaro.Test.StrategyPatter;
import com.alvaro.StrategyPatter.*;
import org.junit.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class ContextTest {
    @Mock
    Strategy strategyMock;

    @InjectMocks
    Context context;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void executesStrategy() throws Exception{
        when(strategyMock.doOperation(45,85)).thenReturn(120);
        assertEquals(120,context.executesStrategy(45,85));

    }
}

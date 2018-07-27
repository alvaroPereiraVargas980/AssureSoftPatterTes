package com.alvaro.Test.BridgePatter;

import com.alvaro.BridgePatter.*;
import org.junit.Before;
import org.junit.Test;
import com.alvaro.BridgePatter.LogitechRemoteControl;
import static org.mockito.Mockito.*;
public class AbstractRemoteControlTest {

    private ITV itv;
    @Before
    public void setUpMockup(){
       itv=mock(ITV.class);
    }

    @Test
    public void turOn() throws Exception{
        AbstractRemoteControl spy=spy(new LogitechRemoteControl(itv));
       doCallRealMethod().when(spy).turOn();
       spy.turOn();
       verify(spy).turOn();
    }
    @Test
    public void turnOff() throws Exception {
        AbstractRemoteControl spy=spy(new LogitechRemoteControl(itv));
        doCallRealMethod().when(spy).turnOff();
        spy.turnOff();
        verify(spy).turnOff();
    }
    @Test
    public void setChannel() throws Exception{
         AbstractRemoteControl spy=spy(new LogitechRemoteControl(itv));
        doCallRealMethod().when(spy).setChannel(12);
        spy.setChannel(12);
        verify(spy).setChannel(12);
    }
}

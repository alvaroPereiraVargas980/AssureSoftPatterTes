package com.alvaro.Test.BridgePatter;
import com.alvaro.BridgePatter.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class LogitechRemoteControlTest {
    ITV itv;
    @Before
    public void seUp(){

        itv=mock(ITV.class);
    }
    @Test
    public void setChannerKeyboardSony() throws Exception {
        SonyTV spy=spy(new SonyTV());
        doCallRealMethod().when(spy).on();
        spy.on();
        verify(spy).on();
        doCallRealMethod().when(spy).off();
        spy.off();
        verify(spy).off();
        LogitechRemoteControl lrc=new LogitechRemoteControl(spy);
        lrc.setChannerKeyboard(100);

    }
    @Test
    public void setChannerKeyboardSamsung() throws Exception {
        SamSungTv spy=spy(new SamSungTv());
        doCallRealMethod().when(spy).on();
        spy.on();
        verify(spy).on();
        doCallRealMethod().when(spy).off();
        spy.off();
        verify(spy).off();
        LogitechRemoteControl lrc=new LogitechRemoteControl(spy);
        lrc.setChannerKeyboard(100);

    }
    @Test
    public void setSuper(){
        LogitechRemoteControl spy=spy(new LogitechRemoteControl(itv));
        doNothing().when((AbstractRemoteControl)spy).setChannel(12);
        spy.setChannerKeyboard(12);
        verify(spy).setChannerKeyboard(12);
    }
}

package com.alvaro.BridgePatter;

public class LogitechRemoteControl extends AbstractRemoteControl {

    public LogitechRemoteControl(ITV tv){
        super(tv);
    }
    public void setChannerKeyboard(int channel){
        setChannel(channel);
        System.out.print("Logitech use keyboard to se channel");

    }
    public static class main{
        public static void main(String[] arg){
            ITV tv=new SonyTV();
            LogitechRemoteControl lrc=new LogitechRemoteControl(tv);
            lrc.setChannerKeyboard(100);
        }
    }
}


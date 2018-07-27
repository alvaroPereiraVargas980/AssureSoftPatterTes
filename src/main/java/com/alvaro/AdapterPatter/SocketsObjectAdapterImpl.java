package com.alvaro.AdapterPatter;

public class SocketsObjectAdapterImpl extends Socket implements  SocketAdapter {
    private Socket socket=new Socket();
    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v=socket.getVolt();
        return converVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v=socket.getVolt();
        return converVolt(v,40);
    }
    public Volt converVolt(Volt v, int i){
        return new Volt((v.getVolts()/i));
    }
}

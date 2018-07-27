package com.alvaro.SingletonPatter;

public class Institude {
    private static Institude instance;
    private String nameInstitute;

    public Institude(){

    }
    public static Institude getInstance(){
        if(instance==null){
            instance=new Institude();
        }
        return instance;
    }

    public String getNameInstitute(){
        return nameInstitute;

    }
    public void setNameInstitute(String nameInstitute){
        this.nameInstitute=nameInstitute;
    }
}


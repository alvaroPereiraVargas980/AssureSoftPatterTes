package com.alvaro.SingletonPatter;

public class main {
    public static void main(String [] arg){
        Institude instituto= Institude.getInstance();
        instituto.setNameInstitute("Suecia Institute");
        System.out.print("1:"+instituto.getNameInstitute());


    }
}

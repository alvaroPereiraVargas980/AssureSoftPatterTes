package com.alvaro.BuilderPatter;

public class BuilderDemo {
    public static void main(String[] arg){
        CDBuilder cdBuilder=new CDBuilder();
        CDtype cdType1=cdBuilder.buildSony();
        cdType1.showItems();
        cdType1.getCost();

        CDtype cdType2=cdBuilder.buildSamsung();
        cdType2.showItems();

    }
}

package com.alvaro.BuilderPatter;

public class CDBuilder {
    public CDtype buildSony(){
        CDtype cds=new CDtype();
        cds.addItem(new Sony());
        return cds;
    }
    public CDtype buildSamsung(){
        CDtype cds=new CDtype();
        cds.addItem(new Samsung());
        return cds;
    }
}

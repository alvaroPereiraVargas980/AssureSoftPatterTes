package com.alvaro.BuilderPatter;
import java.util.*;
public class CDtype {
    private List<Packing> items=new ArrayList<Packing>();
    public void addItem(Packing packs){
        items.add(packs);
    }
    public void getCost(){
        for(Packing packs:items){
            packs.price();
        }
    }
    public void showItems(){
        for(Packing packing:items){
            System.out.print("CD name:"+packing.pack());
            System.out.println(",Pirce:"+packing.price());

        }
    }
}

package com.alvaro.IteratorPatter;

public class IteratorPatterDemo {
    public static void main(String [] arg){
        NameRepository nameRepository=new NameRepository();

        for(Iterator iter= nameRepository.getIterator(); iter.hasNext();){
            String name=(String)iter.next();
            System.out.println("NAME: " + name);

        }
    }
}

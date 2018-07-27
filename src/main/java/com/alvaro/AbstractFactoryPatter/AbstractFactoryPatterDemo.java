package com.alvaro.AbstractFactoryPatter;

public class AbstractFactoryPatterDemo {
    public static void main(String []arg){
        AbstracFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3=shapeFactory.getShape("SQUARE");
        shape3.draw();
        AbstracFactory colorFactory=FactoryProducer.getFactory("COLOR");
        Color color1=colorFactory.getColor("RED");
        color1.fill();
        Color color2=colorFactory.getColor("GREEN");
        color2.fill();
        Color color3=colorFactory.getColor("BLUE");
        color3.fill();
    }
}

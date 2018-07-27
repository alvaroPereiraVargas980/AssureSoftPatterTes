package com.alvaro.DecoratorPatter;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }
    @Override
    public void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }
    public void setRedBorder(Shape decoratorShape){
        System.out.print("Border Color: Red");
    }
}

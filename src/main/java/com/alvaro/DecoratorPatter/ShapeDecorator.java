package com.alvaro.DecoratorPatter;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape=decoratorShape;

    }

}

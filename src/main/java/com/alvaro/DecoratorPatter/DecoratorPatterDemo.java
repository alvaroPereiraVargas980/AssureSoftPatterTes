package com.alvaro.DecoratorPatter;

public class DecoratorPatterDemo {
    public static void main(String [] arg){
        Shape circle= new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.print("Circle with normal border");
        circle.draw();

        System.out.print("\nCircle with of red border");
        redCircle.draw();
        System.out.print("\nRectabgle with of red border");
        redRectangle.draw();
    }
}

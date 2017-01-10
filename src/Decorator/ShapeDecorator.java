package Decorator;

/**
 * Created by Andrue on 10.01.2017.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }
    public void draw(){
        decoratorShape.draw();
    }
}

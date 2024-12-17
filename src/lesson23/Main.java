package lesson23;

import lesson23.factory.*;
import lesson23.singleton.Singleton;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        if (new Random().nextBoolean()) {
            Singleton singleton1 = Singleton.getInstance(); // 1
        } else {
            Singleton singleton2 = Singleton.getInstance();
        }

//        Circle circle = new Circle("Red");
//        Shape shape;

        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape(ShapeType.TRIANGLE).draw();
        shapeFactory.getShape(ShapeType.CIRCLE).draw();
        shapeFactory.getShape(ShapeType.TRIANGLE).draw();
        shapeFactory.getShape(ShapeType.DIALOG_CLOUD).draw();
        shapeFactory.setColor(Color.GREEN);
        shapeFactory.getShape(ShapeType.TRIANGLE).draw();
        shapeFactory.getShape(ShapeType.SQUARE).draw();

    }
}

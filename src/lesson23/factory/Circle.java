package lesson23.factory;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(getColor() + " circle");
    }
}

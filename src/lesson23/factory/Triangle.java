package lesson23.factory;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(getColor() + " triangle");
    }
}

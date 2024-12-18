package lesson23.factory;

public class ShapeFactory {

    private Color color = Color.BLACK;
    private Color colorText = Color.BLACK;

    public ShapeFactory() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle(color);
            case TRIANGLE -> new Triangle(color);
            case SQUARE -> new Square(color);
            case DIALOG_CLOUD -> new DialogCloud(color, colorText);
            default -> throw new RuntimeException("Unknown shape type");
        };
    }
}

package lesson23.factory;

public class DialogCloud extends Shape {

    private Color colorText;

    public DialogCloud(Color color, Color colorText) {
        super(color);
        this.colorText = colorText;
    }

    @Override
    public void draw() {
        System.out.println(getColor() + " dialog cloud with " + colorText + " text");
    }
}

package lesson07;

public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        if (x >= 100) {
            this.x = 100;
        } else if (x <= -100) {
            this.x = -100;
        } else {
            this.x = x;
        }
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

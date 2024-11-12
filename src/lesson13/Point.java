package lesson13;

public class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
//        double length1 = Math.sqrt(getX() * getX() + getY() * getY());
//        double length2 = Math.sqrt(o.getX() * o.getX() + o.getY() * o.getY());
////        return length1 < length2 ? -1 : (length1 == length2 ? 0 : 1);
//        return Double.compare(length1, length2);
        if (x < o.x) {
            return -1;
        } else if (x == o.x) {
            if (y < o.y) {
                return -1;
            } else if (y == o.y) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}

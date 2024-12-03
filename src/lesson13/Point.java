package lesson13;

public class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x) {
        this.x = x;
        this.y = 0;
    }
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

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;

        return x == point.x
                && y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
//        result = 31 * result + z;
//        result = 31 * result + a;
//        result = 31 * result + b;
//        result = 31 * result + c;
//        result = 31 * result + d;
//        result = 31 * result + e;

        //(0,1,2,3,4) -> (((0 * 31 + 1) * 31 + 2) * 31 + 3) * 31 + 4
        //(4,3,2,1,0) -> (((4 * 31 + 3) * 31 + 2) * 31 + 1) * 31 + 0
        //(11,11,11,11,11) -> (((11 * 31 + 11) * 31 + 11) * 31 + 11) * 31 + 11
        //(11,11,11,11,11) -> (((11 * 31 + 11) * 31 + 11) * 31 + 11) * 31 + 11

        return result;
    }
}

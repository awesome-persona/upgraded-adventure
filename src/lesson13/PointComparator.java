package lesson13;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        double length1 = Math.sqrt(o1.getX() * o1.getX() + o1.getY() * o1.getY());
        double length2 = Math.sqrt(o2.getX() * o2.getX() + o2.getY() * o2.getY());
//        return length1 < length2 ? -1 : (length1 == length2 ? 0 : 1);
        return Double.compare(length1, length2);
    }


}

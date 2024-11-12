package lesson13;

import java.util.Set;
import java.util.TreeSet;

public class PointMain {

    public static void main(String[] args) {
        PointComparator pointComparator = new PointComparator();
        Set<Point> points = new TreeSet<>(pointComparator);
        points.add(new Point(1,1));
        points.add(new Point(4,7));
        points.add(new Point(-5,2));
        points.add(new Point(3,-8));
        points.add(new Point(11,0));
        points.add(new Point(-1,6));
        points.add(new Point(3,-2));
        points.add(new Point(3,12));
        points.add(new Point(3,2));

        System.out.println(points);

        //[(-5,2), (-1,6), (1,1), (3,-8), (3,-2), (3,2), (3,12), (4,7), (11,0)]
        //[(1,1), (3,-2), (-5,2), (-1,6), (4,7), (3,-8), (11,0), (3,12)]
    }
}

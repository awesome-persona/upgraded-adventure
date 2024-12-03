package lesson18;

import lesson07.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        TreeSet<Point> objects = new TreeSet<>();




        Stream<Point> pointStream = Stream.of(new Point(1, 2),
                new Point(11, 32),
                new Point(51, 22),
                new Point(21, 82),
                new Point(91, 42));

        Stream<Point> sorted = pointStream.sorted((p1, p2) -> 0); //1


        Stream<Point> pointStream1 = sorted
                .distinct() //2
                .filter(p -> p.getX() > 0); //3

        long count = sorted.count(); //


        List<Point> points = new ArrayList<>();
        long count1 = points.stream()
                .distinct()
                .filter(p -> p.getY() < 0)
                .sorted()
                .dropWhile(p -> p.getY() < 0)

                .count();

        Stream<Point> stream = points.stream();
        Stream<Point> distinct = points.stream()
                .distinct();

        Stream<Double> doubleStream = points.stream()
                .distinct()
                .filter(p -> p.getY() < 0)
                .map(p -> Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY()));

        //(12,3) (4, 8) -> a ,b
        // (12,3) (4, 8) -> 12, 3, 4, 8
        Stream<Double> objectStream = points.stream()
                .flatMap(p -> Arrays.asList( p.getX(), p.getY()).stream());

    }
}

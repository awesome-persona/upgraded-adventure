package lesson14;

import lesson13.Point;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(3,3);  //3 * 31 + 3
        Map<Point, Integer> map = new HashMap<>();
        map.put(point, 10);
//        point.setX(0);
//        point.setY(96);

        System.out.println(map.get(point));

        point.setX(3);
        System.out.println(map.get(point));


        Collection<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        integers = new ArrayList<>(integers);
        ((List)integers).add(5, null);

        integers.forEach(integer -> System.out.print(integer + " "));

        for (Integer a : integers) {
            System.out.print(a + " ");
        }

        System.out.println();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next + " ");
        }


        System.out.println();
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(((List)integers).get(i) + " ");
        }





        ArrayList<Object> objects = new ArrayList<>();
        ListIterator<Object> listIterator = objects.listIterator();



    }
}

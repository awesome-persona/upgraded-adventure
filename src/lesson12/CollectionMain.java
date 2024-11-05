package lesson12;

import java.util.*;

public class CollectionMain {

    public static void main(String[] args) {
        Deque<String> cities = new LinkedList<>(); //new ArrayDeque<>();
        cities.add("Berlin");
        cities.add("Minsk");
        cities.add("Oslo");
        System.out.println(cities);
        cities.addFirst("New York");
        cities.addLast("Barcelona");
        cities.offer("Moscow");
        cities.offerFirst("Warsaw");
        cities.push("Prague");
        System.out.println(cities);
        cities.pop();
        cities.pop();
        cities.pop();
        cities.pop();
        System.out.println(cities);
        cities.remove("Oslo");


        List<Integer> integers = new LinkedList<>();//new Vector<>(); //new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1, 5);
        System.out.println(integers);
        integers.add(7);
        integers.add(11);
        integers.add(7);
        integers.add(9);
        System.out.println(integers);

        System.out.println(integers.get(3));
    }
}

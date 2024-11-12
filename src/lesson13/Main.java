package lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        extracted(new HashSet<>());
        extracted(new TreeSet<>());






    }

    private static void extracted(Set<Integer> set) {
        set.add(11);
        set.add(13);
        set.add(52);
        System.out.println(set);
        set.add(3);
        set.add(7);
        set.add(1);
        System.out.println(set);
    }
}

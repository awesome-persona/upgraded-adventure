package lesson19;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int pageSize = 30;
        int page = 25;
        List<String> objects = new ArrayList<>();


        List<String> collect = objects.stream()
//                .limit(page * pageSize)
                .skip((page - 1) * pageSize)  //24 * 30
                .limit(pageSize) //25 * 30
                .collect(Collectors.toList());


        Set<Object> collect1 = objects.stream().collect(Collectors.toSet());

        Map<String, Integer> collect2 = objects.stream()
                .collect(Collectors.toMap(str -> str, str -> str.length()));

        List<String> list = objects.stream().toList();

        objects.stream()
                .sorted()
                .skip(10)
                .limit(5)
                .forEach( str -> System.out.println(str));

        long count = objects.stream().count();

        Optional<String> first = objects.stream().findFirst();
        Optional<String> any = objects.stream()
                .findAny();

        boolean b1 = objects.stream().allMatch(str -> str.length() > 6);
        boolean b2 = objects.stream().anyMatch(str -> str.length() > 6);
        boolean b3 = objects.stream().noneMatch(str -> str.length() > 6);
        Optional<String> max = objects.stream().max(String::compareTo);

        Optional<String> reduce = objects.stream().reduce((a, b) -> a.compareTo(b) == 1 ? a : b);

        objects.add("1234567");

        objects.add("123");

        objects.add("12345");

        int sum = objects.stream()
                .mapToInt(str -> str.length())
                .sum();

        int length = objects.stream()
                .reduce((a, b) -> a + b)
                .orElse("")
                .length();

        Integer reduce1 = objects.stream()
                .reduce(0, (c, str) -> c + str.length(), (a, b) -> a + b);

        System.out.println(sum);
        System.out.println(length);
        System.out.println(reduce1);
    }
}

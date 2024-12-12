package lesson21;

import java.util.stream.Stream;

public class Pair<K, T> {

    private volatile K first;
    private volatile T last;

    public K first() {
        return null;
    }

    public T last() {
        return null;
    }

    public Pair<T, K> swap() {
        synchronized (this) {
            return null;
        }
    }

    public synchronized <M> Pair<M, K> replaceFirst(M value) {
        return null;
    }

    public synchronized <M> Pair<T, M> replaceLast(M value) {
        return null;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        String first1 = pair.first();
        Integer last1 = pair.last();
        Pair<Integer, String> swap = pair.swap();
        Integer first2 = swap.first();
        Pair<Double, Integer> doubleIntegerPair = swap.replaceFirst(44.4);


        Stream<String> stringStream = Stream.of("", "", "");
        Stream<Integer> integerStream = stringStream.map(String::length);

    }
}

package lesson17;

import lesson13.Point;

@FunctionalInterface
public interface Pointer {

    Point create(int x, int y);
}

package lesson13;

import java.util.Objects;

public class Line {

    Point p1;
    Point p2;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;

        return Objects.equals(p1, line.p1) && Objects.equals(p2, line.p2);
    }


}

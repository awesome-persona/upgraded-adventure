package lesson10;

import lesson07.Point;

public class SomeClass {

    private DayOfWeek dayOfWeek;
    private boolean flag;
    private Point point;

    public SomeClass(boolean flag, DayOfWeek dayOfWeek, Point point) {
        this.flag = flag;
        this.dayOfWeek = dayOfWeek;
        this.point = point;
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass(false, DayOfWeek.MONDAY, new Point(3, 3));

        DayOfWeek dayOfWeek1 = someClass.dayOfWeek;

        if (dayOfWeek1.equals(DayOfWeek.FRIDAY)) {
            System.out.println("Let's drink milk stout beer!");
        }
    }
}

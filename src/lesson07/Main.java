package lesson07;

public class Main {

    private String name;
    private String lastName;
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Main(int a) {

    }
    public static void main(String[] args) {
        Point point1 = new Point(-3, -3);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(7, -2);

        System.out.println("(" + point1.getX() + ", " + point1.getY() + ")");

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);

        point1.setX(point1.getX() + 1100);
        point1.setY(point1.getY() + 1300);


        System.out.println(point1);
    }


}

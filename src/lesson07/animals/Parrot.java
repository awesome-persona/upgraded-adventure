package lesson07.animals;

public class Parrot extends Bird {

    public Parrot(int age, String size) {
        super(age, size, false, true);
    }

    @Override
    public void fly() {
        System.out.println("I believe");
    }

    @Override
    public void eat() {
        System.out.println("corn");
    }
}

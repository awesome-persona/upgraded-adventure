package lesson07.animals;

public class Human extends Mammal {

    public Human(int age, String size) {
        super(age, size, false, 2);
    }

    @Override
    public void think() {
        System.out.println("I can think");
    }

    @Override
    public void eat() {
        System.out.println("Eat everything");
    }
}

package lesson07.animals;

public class Cyborg implements Eatable, Flyable {

    @Override
    public void eat() {
        System.out.println("I'm Bender");
    }

    @Override
    public void fly() {
        System.out.println("I'm superman");
    }

    public void run() {
        System.out.println("I'm flash");
    }

    public void swim() {
        System.out.println("I'm auqaman");
    }
}

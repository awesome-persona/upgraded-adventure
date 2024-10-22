package lesson07.animals;

public class Cow extends Mammal {

    public Cow(int age, String size) {
        super(age, size, true, 4);
    }

    @Override
    public void think() {
        System.out.println("muu?");
    }

    @Override
    public void eat() {
        System.out.println("eating grass");
    }
}

package lesson07.animals;

public class Dodo extends Bird {

    public Dodo(int age, String size) {
        super(age, size, false, true);
    }

    @Override
    public void fly() {
        System.out.println("fly on 100m");
    }

    @Override
    public void eat() {
        System.out.println("eat worms");
    }
}

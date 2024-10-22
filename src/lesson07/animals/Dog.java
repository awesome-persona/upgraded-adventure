package lesson07.animals;

public class Dog extends Mammal {

    public Dog(int age, String size, boolean hunter) {
        super(age, size, hunter, true, 4);
    }

    @Override
    public void think() {
        System.out.println("gav?");
    }

    @Override
    public void eat() {
        System.out.println("eat bone");
    }
}

package lesson07.animals;

public class Eagle extends Bird {

    public Eagle(int age, String size) {
        super(age, size, true, true);
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void eat() {
        System.out.println("eat meat");
    }
}

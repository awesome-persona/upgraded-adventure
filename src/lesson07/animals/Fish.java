package lesson07.animals;

public abstract class Fish extends Animal {

    private boolean scale;

    public Fish(int age, String size, boolean hunter) {
        this(age, size, hunter, false);
    }

    public Fish(int age, String size, boolean hunter, boolean scale) {
        super(age, size, hunter);
        this.scale = scale;
    }

    public boolean isScale() {
        return scale;
    }

    @Override
    public void eat() {
        System.out.println("eat grass");
    }

    public void swim() {
        System.out.println("I can swim fast");
    }
}

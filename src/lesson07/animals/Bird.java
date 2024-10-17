package lesson07.animals;

public abstract class Bird extends Animal {

    private boolean wings;

    public Bird(int age, String size, boolean hunter, boolean wings) {
        super(age, size, hunter);
        this.wings = wings;
    }

    public boolean hasWings() {
        return wings;
    }

    @Override
    public void sleep() {
        if (wings) {
            System.out.println(" can sleep in fly");
        } else {
            super.sleep();
        }
    }

    public abstract void fly();
}

package lesson07.animals;

public abstract class Bird extends Animal implements Flyable {

    private boolean wings;
    private BirdType birdType;

    public Bird(int age, String size, boolean hunter, boolean wings, BirdType birdType) {
        super(age, size, hunter);
        this.wings = wings;
        this.birdType = birdType;
    }

    public Bird(int age, String size, boolean hunter, boolean wings) {
        super(age, size, hunter);
        this.wings = wings;
        this.birdType = BirdType.UNKNOWN;
    }

    public boolean hasWings() {
        return wings;
    }

    public BirdType getBirdType() {
        return birdType;
    }

    public boolean isWings() {
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

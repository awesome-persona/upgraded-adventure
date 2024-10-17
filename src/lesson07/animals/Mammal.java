package lesson07.animals;

public abstract class Mammal extends Animal {

    private int legsCount;
    private boolean hasTail;

    public Mammal(int age, String size, boolean hasTail, int legsCount) {
        super(age, size);
        this.hasTail = hasTail;
        this.legsCount = legsCount;
    }

    public Mammal(int age, String size, boolean hunter, boolean hasTail, int legsCount) {
        super(age, size, hunter);
        this.hasTail = hasTail;
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public abstract void think();

    public void run() {
        System.out.println("I can run");
    }
    //    public Mammal(int age, String size) {
//        super(age, size);
//    }
//
//    public Mammal(int age, String size, boolean hunter) {
//        super(age, size, hunter);
//    }
}

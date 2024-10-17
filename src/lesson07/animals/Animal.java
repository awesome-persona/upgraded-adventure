package lesson07.animals;

public abstract class Animal {

    private int age;
    private String size;
    private boolean hunter;

    public Animal(int age, String size) {
        this(age, size, false);
//        this.age = age;
//        this.size = size;
//        this.hunter = false;
    }

    public Animal(int age, String size, boolean hunter) {
//        super();
        this.age = age;
        this.size = size;
        this.hunter = hunter;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public boolean isHunter() {
        return hunter;
    }

    public void sleep() {
        System.out.println("Zzz Zzzz Zzzz");
    }

    public abstract void eat();
}

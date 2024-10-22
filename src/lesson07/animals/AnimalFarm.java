package lesson07.animals;

public class AnimalFarm {

    public static void main(String[] args) {
        Cow cow1 = new Cow(5, "BIG");
        Cow cow2 = new Cow(7, "VERY BIG");
        Dodo dodo = new Dodo(3, "Medium");
        Dog dog = new Dog(7, "Medium", false);
        Eagle eagle1 = new Eagle(10, "Big");
        Eagle eagle2 = new Eagle(2, "Small");
        GoldFish goldFish = new GoldFish(5, "Small");
        Human human = new Human(23, "Medium");
        Parrot parrot = new Parrot(1, "Small");
        Shark shark = new Shark(13, "Large");

//        cow1.eat();
//        cow2.eat();
//        dodo.eat();
//        ...

        Cyborg cyborg = new Cyborg();
        Animal[] animals = { cow1, cow2, dodo, dog,
                eagle1, eagle2, goldFish, human, parrot, shark};

        for (Animal animal : animals) {
            animal.eat();
        }
        cyborg.eat();

        System.out.println();
        Flyable[] flyables = {dodo, eagle1, eagle2, parrot, cyborg};
        for (Flyable f : flyables) {
            f.fly();
        }


//        proceedWithEating(animals);
    }


    public static void proceedWithEating(Object[] animals) {
        for (int i = 0; i < animals.length; i++) {
            Object animal = animals[i];
            if (animal instanceof Cow) {
                Cow cow = (Cow) animal;
                cow.eat();
            } else if (animal instanceof Dodo dodo) {
                dodo.eat();
            }

        }
    }
}

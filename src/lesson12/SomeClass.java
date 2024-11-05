package lesson12;

import lesson07.animals.Bird;
import lesson07.animals.Flyable;

public class SomeClass {

    private int someA;
    private static int staticSomeA;

    public SomeClass(int someA) {
        this.someA = someA;
    }


    public void todo() {
        {
            class Test implements Flyable {
                @Override
                public void fly() {
                    System.out.println();
                }
            }

            Test test1 = new Test();
            Test test2 = new Test();
            Test test3 = new Test();

//            Flyable flyable = () -> System.out.println("anon");
            Flyable flyable = new Flyable() {
                @Override
                public void fly() {
                    System.out.println("anon");
                }
            };


            Flyable bird = new Bird(5, "", false, false) {
                @Override
                public void eat() {

                }

                @Override
                public void fly() {
                    System.out.println("anon");
                }
            };

            bird.fly();
        }


        int a;








    }



















    public class InnerClass {

        private int innerA;

        public InnerClass() {
            this.innerA = someA + staticSomeA;
        }
    }

    public static class StaticClass {

        private int staticA;

        public StaticClass() {
            this.staticA = staticSomeA;
        }
    }
}

package lesson12;

public class Main {

    public static void main(String[] args) {
        lesson12.SomeClass.StaticClass staticClass = new SomeClass.StaticClass();

        SomeClass someClass = new SomeClass(5);
        SomeClass.InnerClass innerClass = someClass.new InnerClass();

        SomeClass someClass2 = new SomeClass(10);
        SomeClass.InnerClass innerClass2 = someClass2.new InnerClass();


        someClass2.todo();
    }
}

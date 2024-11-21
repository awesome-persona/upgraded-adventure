package lesson16;

import java.io.*;
import java.util.List;

public class ObjMain {

    static class Person implements Serializable {

        static final long serialVersionUID = 1L;

        private String login;
        private transient String password;
        private int age;

        public Person(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "objects";
        List<Person> people = List.of(
                new Person("qwerty", "password"),
                new Person("user", "123")
        );

        System.out.println("BEFORE");
        System.out.println(people.get(0));
        System.out.println(people.get(1));
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(people.get(0));
            oos.writeObject(people.get(1));
        }


        System.out.println();
        System.out.println();
        System.out.println();

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println("AFTER");

            Object o1 = ois.readObject();
            if (o1 instanceof Person p1) {
                System.out.println(p1);
            }

            Object o2 = ois.readObject();
            if (o2 instanceof Person p2) {
                System.out.println(p2);
            }
        }


        //FileInputStream fis = new FileInputStream();
    }
}

package lesson06.oop;

import java.lang.*;
import lesson02.*;


public final class MainClass {


    public static final double MATH_PI = 3.14;
    int x;
    int y;
    static int z;

    public MainClass() {
    }

    public MainClass(short a, short b) {
        x = a;
        y = b;
    }

    public MainClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MainClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }



    void todoX() {
        x +=2;
    }

    private void todoY() {
        y +=5;
    }

    protected void todoZ() {
        z += 1000;
    }


    public static void main(String[] args) {
        MainClass m = new MainClass(5, 9, 25);
        System.out.println(m.x);
        System.out.println(m.y);
        System.out.println(m.z);
        System.out.println();
        m.todoX();
        m.todoY();
        m.todoZ();
        int z1 = MainClass.z;

        System.out.println(m.x);
        System.out.println(m.y);
        System.out.println(m.z);
        System.out.println();
        MainClass mainClass = new MainClass(1,2, 300);
        MainClass mainClass1 = new MainClass(6, 4, 666);
        System.out.println();
        System.out.println(mainClass.x);
        System.out.println(mainClass.y);
        System.out.println(mainClass.z);
        System.out.println();
        System.out.println(mainClass1.x);
        System.out.println(mainClass1.y);
        System.out.println(mainClass1.z);


        System.out.println(m.x);
        System.out.println(m.y);
        System.out.println(m.z);


        mainClass.toString();
        mainClass.hashCode();

        {
            int a;
            a = 10;
            mainClass.todoY();
        }

        {
            int a;
            a = 10;
            mainClass.todoY();
        }

        Main main = new Main();
        var main1 = new lesson06.Main();
        var main2 = new lesson03.Main();

        // 1000
    }
}

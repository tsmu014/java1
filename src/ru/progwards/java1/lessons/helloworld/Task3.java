package ru.progwards.java1.lessons.helloworld;

public class Task3 {
    public static void main(String[] args) {
        int a, b, c;
        a = 34;
        b = 55;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = addition(a, b);
        System.out.println("a + b = " + c);

        c = subtraction(a, b);
        System.out.println("a - b = " + c);

        c = multiplication(a, b);
        System.out.println("a * b = " + c);
    }

    public static int addition(int x, int y) {
        System.out.println("Вызвана функция addition()");
        return x + y;
    }

    public static int subtraction(int x, int y) {
        System.out.println("Вызвана функция subtraction()");
        return x - y;
    }

    public static int multiplication(int x, int y) {
        System.out.println("Вызвана функция multiplication()");
        return x * y;
    }
}

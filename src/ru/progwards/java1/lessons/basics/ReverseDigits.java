package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        int i = reverseDigits(364);
        System.out.println(i);
    }

    public static int reverseDigits(int number) {
        int x1 = number % 10;
        int x2 = (number / 10) % 10;
        int x3 = number / 100;

        return x1 * 100 + x2 * 10 + x3;
    }
}

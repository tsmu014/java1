package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
//        Формула объёма шара 4/3πR^3
//        π возьмём равным 3.14; Радиус земли R будем считать равным 6371.2 км
        double ballDouble = volumeBallDouble(6371.2);
        float ballFloat = volumeBallFloat(6371.2f);
        double difference = calculateAccuracy(6371.2);
        System.out.println(ballDouble + "-" + ballFloat + "=" + difference);
    }

    public static double volumeBallDouble(double radius) {
        return 4.0 / 3.0 * 3.14 * radius * radius * radius;
    }

    public static float volumeBallFloat(float radius) {
        return 4.0f / 3.0f * 3.14f * radius * radius * radius;
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);
    }
}

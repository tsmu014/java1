package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static void main(String[] args) {
        System.out.println(sphereSquare(10.0));
    }

    // вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2.
    public static Double sphereSquare(Double r) {
        return 4 * 3.14 * r * r;
    }

    // вычисляет площадь поверхности Земли, считая радиус равным 6 371.2 км и используют функцию sphereSquare
    public static Double earthSquare() {
        return sphereSquare(6_371.2);
    }

    // вычисляет площадь поверхности Меркурия, считая радиус равным 2 439,7 км  и используют функцию sphereSquare
    public static Double mercurySquare() {
        return sphereSquare(2_439.7);
    }

    // вычисляет площадь поверхности Юпитера, считая радиус равным 71 492 км  и используют функцию sphereSquare
    public static Double jupiterSquare() {
        return sphereSquare((double) 71_492);
    }

    // вычисляет отношение площади поверхности Земли к площади поверхности Меркурия используя готовые функции площадей планет
    public static Double earthVsMercury() {
        return earthSquare() / mercurySquare();
    }

    // вычисляет отношение площади поверхности Земли к площади поверхности Юпитера используя готовые функции площадей планет
    public static Double earthVsJupiter() {
        return earthSquare() / jupiterSquare();
    }
}

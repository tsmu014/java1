package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
        System.out.println(maxSide(258, 356, 178));
        System.out.println(minSide(258, 356, 178));
        System.out.println(isEquilateralTriangle(5, 5, 3));
    }

    // получает параметрами длины сторон треугольника, а вернуть должна наибольшую длину стороны
    public static int maxSide(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    // параметрами длины сторон треугольника, а вернуть должна наименьшую длину стороны
    public static int minSide(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    // получает параметрами длины сторон треугольника, а вернуть должна true, если треугольник равносторонний и false в противном случае.
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        }
        return false;
    }
}

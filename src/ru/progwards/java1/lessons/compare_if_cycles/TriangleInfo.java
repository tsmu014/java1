package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static void main(String[] args) {
//        true если по сторонам можно построить треугольник: длина каждой из сторон меньше суммы длин двух других
        System.out.println(isTriangle(3,6,5));

//        прямоугольный треугольник - (сумма квадратов катетов равна квадрату гипотенузы)
        System.out.println(isRightTriangle(6,8,10));

//    равнобедренный треугольник - когда две стороны равны
        System.out.println(isIsoscelesTriangle(3, 3, 1));
    }

    //    возвращает true, если по данным трём сторонам (a, b, c) можно построить треугольник
//    Из геометрии известно, что в треугольнике длина каждой из сторон меньше суммы длин двух других сторон.
    public static boolean isTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            return true;
        }
        return false;
    }

    //    возвращает true, если треугольник со сторонами a, b, c является прямоугольным
//    Из геометрии известно, что для прямоугольного треугольника выполняется теорема Пифагора
//    (сумма квадратов катетов равна квадрату гипотенузы)
    public static boolean isRightTriangle(int a, int b, int c) {
        if (c * c == a * a + b * b) {
            return true;
        }
        return false;
    }

    //    возвращает true, если треугольник со сторонами a, b, c является равнобедренным
//    Из геометрии известно, что в равнобедренном треугольнике есть две равные стороны
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            return true;
        }
        return false;
    }
}

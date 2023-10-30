package ru.job4j.condition;

/**
 * Класс, метод area, которого вычисляет площадь треугольника через
 * формулу герона.
 * Здесь a, b и с - это длины сторон, а P - это полупериметр.
 * Полупериметр вычисляется как сумма всех сторон, деленная на 2.
 */
public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}

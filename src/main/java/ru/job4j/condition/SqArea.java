package ru.job4j.condition;

/**
 *  Класс, метод square котрого вычисляет площадь прямоугольника по  известным
 *  периметру и коэффициенту k
 *  p - периметр p = 2 * (l + h)
 *  k - коэффициент
 *  l - длина
 *  h - высота
 *  l = h * k
 *  Нужно вычислить длину и высоту, а потом площадь s = l * h
 */
public class SqArea {
    public static double square(double p, double k) {
        return ((p / (2 * (k + 1))) * k) * (p / (2 * (k + 1)));
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}

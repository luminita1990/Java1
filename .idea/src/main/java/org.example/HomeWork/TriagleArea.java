package HomeWork;

import java.util.Scanner;

public class TriagleArea {
    //Площадь треугольника:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину основания треугольника:");
        double base = scanner.nextDouble();
        System.out.println("Введите высоту треугольника:");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Площадь треугольника: " + area);
    }
}

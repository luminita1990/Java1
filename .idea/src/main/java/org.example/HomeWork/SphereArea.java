package HomeWork;

import java.util.Scanner;

public class SphereArea {
    // Площадь сферы:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус сферы:");
        double radius = scanner.nextDouble();
        double area = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь сферы: " + area);
    }
}


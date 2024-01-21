package HomeWork;

import java.util.Scanner;

public class TrapezoidPerimeter {
    // Периметр трапеции:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первого основания трапеции:");
        double base1 = scanner.nextDouble();
        System.out.println("Введите длину второго основания трапеции:");
        double base2 = scanner.nextDouble();
        System.out.println("Введите длину боковой стороны трапеции:");
        double side = scanner.nextDouble();
        double perimeter = base1 + base2 + 2 * side;
        System.out.println("Периметр трапеции: " + perimeter);
    }
}


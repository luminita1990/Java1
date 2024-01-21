package _2024_01_17;

import java.util.Scanner;

public class Skan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char znak = scanner.next().charAt(0);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        switch (znak) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}

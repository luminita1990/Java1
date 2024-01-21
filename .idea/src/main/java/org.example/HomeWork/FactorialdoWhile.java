package HomeWork;
import java.util.Scanner;

public class FactorialdoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала:");
        int number = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        System.out.println("Факториал числа " + number + " = " + factorial);
    }
}
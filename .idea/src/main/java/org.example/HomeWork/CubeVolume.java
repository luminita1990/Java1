package HomeWork;

import java.util.Scanner;

public class CubeVolume {
    //Объем куба:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны куба:");
        double sideLength = scanner.nextDouble();
        double volume = Math.pow(sideLength, 3);
        System.out.println("Объем куба: " + volume);
    }
}


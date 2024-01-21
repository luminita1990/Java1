package _2024_01_18;

import java.util.Scanner;
//Написать програму которая принимает на вход числа Х и у в диапазоне от 1 до 3.
//Повторить логику такими образомб чтобы при вызове вашей программы происходило следующее:
//при значении Х равным 2 или 3, выводилось значение Х, а если Х=1, выводить значение У.
//Пример: myMethod(x=3, y= 2) - output: X =3
//        myMethod(x=2, y= 2) - output: X =2
//        myMethod(x=1, y= 2) - output: X =2


public class NewClass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vedite X");
        int x = scanner.nextInt();
        System.out.println("Vedite Y");
        int y = scanner.nextInt();
        String result = getRusult(x, y);
        System.out.println(result);

    }

    public static String getRusult(int x, int y) {
        if (x < 1 || x > 3 || y < 1 || y > 3) {
            return "ERROR";
        }
        if (x == 2 || x == 3) {
            return "X = " + x;
        } else {
            return "Y = " + y;
        }
    }
}

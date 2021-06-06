package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println("Задание № 2:");
        printThreeWords();

        System.out.println("\nЗадание № 3:");
        checkSumSign();

        System.out.println("\nЗадание № 4:");
        printColor();

        System.out.println("\nЗадание № 5:");
        compareNumbers();

    }

    private static void printThreeWords() {
        System.out.println("""
                Orange
                Banana
                Apple
                """);

    }

    private static void checkSumSign() {

        Random random = new Random();
        int a = random.nextInt(15);
        int b = (-1) * random.nextInt(15);
        int sum = a + b;
        System.out.println("переменная а = " + a + "\n" + "переменная b = " + b + "\n" + "Сумма a + b = " + sum);
        System.out.print("Ответ на задание: ");

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {

        System.out.print("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else
            System.out.println("Green");
    }

    private static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt(15);
        int b = random.nextInt(15);

        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }

}

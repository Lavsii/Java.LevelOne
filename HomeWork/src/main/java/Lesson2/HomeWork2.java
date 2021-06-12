package Lesson2;

public class HomeWork2 {

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     * в противном случае – false.
     * 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     * 5.* Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    public static void main(String[] args) {

        System.out.println(task1(7, 5)); //Заданеи 1

        System.out.println("****************");

        System.out.println(task2(-5)); // Задание 2

        System.out.println("****************");

        System.out.println(task3(-45)); // Задание 3

        System.out.println("****************");

        task4("Строка", 5); // Задание 4

        System.out.println("\n****************");

        task5(2021);

    }

    private static boolean task1(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    private static String task2(int a) {
        if (a >= 0) {
            return " Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    private static boolean task3(int a) {
        return a < 0;
    }

    private static void task4(String w, int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(w + " ");
        }
    }

    private static void task5(int year) {
        boolean leap = checkYear(year);
        if (leap) {
            System.out.println(year + " Високосный");
        } else {
            System.out.println(year + " не високосный");
        }

    }

    private static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}

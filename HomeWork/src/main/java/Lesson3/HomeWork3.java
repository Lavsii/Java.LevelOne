package Lesson3;

public class HomeWork3 {

    public static void main(String[] args) {
        task1();
        System.out.println("\n*********************");

        task2();
        System.out.println("\n*********************");

        task3();
        System.out.println("\n*********************");

        task4();
        System.out.println("*********************");

        task5(5, 10);
        System.out.println("\n*********************");

        task6();
        System.out.println("\n*********************");

    }

    private static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Заданный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nПреобразованный массив:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.print(arr[i] + " ");
        }
    }

    private static void task2() {
        int[] arr100 = new int[100];

        for (int i = 0; i < arr100.length; i++) {
            arr100[0] = 1;
            arr100[i] = arr100[0] + i;
            System.out.print(arr100[i]++ + " ");
        }
    }

    private static void task3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Заданный массив:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "  ");
        }
        System.out.println("\nПреобразованный массив:");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + "  ");
        }

    }

    private static void task4() {
        int[][] arr = new int[5][5];
        int j = 0;
        System.out.println("Заданный двумерный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Двумерный массив с заполнением по диагонали:");
        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j <= arr.length - 1; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task5(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }

    }

    private static void task6() {
        int[] arr = {1, -4, 5, 2, 11, 3, 6, 4, 9};
        System.out.println("Заданный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "]" + " - " + arr[i] + " ");
        }
        int min = arr[0], max = arr[0];
        int imin = 0, imax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            } else if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
        }
        System.out.println("\nМинимальное значение " + "[" + imin + "]" + " - " + min);
        System.out.print("Максимальное значение " + "[" + imax + "]" + " - " + max);
    }
}

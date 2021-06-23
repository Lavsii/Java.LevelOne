package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static int size;
    public static int block;
    public static final char HFS = '⌂';
    public static final String EMPTY = " ";
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

        customizeGame();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы выйграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    public static void customizeGame() {
        do {
            System.out.print("\nВыберите размер игрового поля [3-10]: ");
            size = sc.nextInt();
        } while(size<3 || size>10);

        do {
            System.out.print("Сколько подряд клеток заполнено для победы [3-"+size+"]: ");
            block = sc.nextInt();
        } while (block<3 || block>size);

    }

    public static boolean checkWin(char symb) {
        for (int col=0; col<size-block+1; col++) {
            for (int row=0; row<size-block+1; row++) {
                if (checkDiagonal(symb, col, row) || checkLanes(symb, col, row)) return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonal(char symb, int offsetX, int offsetY) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i=0; i<block; i++) {
            toright &= (map[i+offsetX][i+offsetY] == symb);
            toleft &= (map[block-i-1+offsetX][i+offsetY] == symb);
        }

        if (toright || toleft) return true;

        return false;
    }

    public static boolean checkLanes(char symb, int offsetX, int offsetY) {
        boolean cols, rows;
        for (int col=offsetX; col<block+offsetX; col++) {
            cols = true;
            rows = true;
            for (int row=offsetY; row<block+offsetY; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }

            if (cols || rows) return true;
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));

        System.out.println("Ход компьюетара: " + (x + 1) + EMPTY + (y + 1));

        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты хода X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print(HFS + EMPTY);
        for (int i = 0; i <= size-1; i++) {
            System.out.print(i + 1 + EMPTY);
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + EMPTY);
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
        System.out.println();
    }
}

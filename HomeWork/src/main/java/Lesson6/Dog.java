package Lesson6;

import java.util.Random;

public class Dog extends Animal {

    protected final int DOGRUNDIST = 500;
    protected final int DOGSWIMDIST = 10;
    private static int dogsCount;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    @Override
    void run() {
        Random run = new Random();
        int dogrun = run.nextInt(1000) + 1;
        if ( dogrun <= DOGRUNDIST) {
            System.out.println("Собака по кличке " + name + " пробежал(а) " + dogrun + " м.");
        } else {
            System.out.println("Собака по кличке " + name + " не сможет пробежать " + dogrun + " м.");
        }
    }
    @Override
    void swim() {
        Random run = new Random();
        int dogswim = run.nextInt(100) + 1;
        if ( dogswim <= DOGSWIMDIST) {
            System.out.println("Собака по кличке " + name + " проплыл(а) " + dogswim + " м.");
        } else {
            System.out.println("Собака по кличке " + name + " не сможет проплыть " + dogswim + " м.");
        }
    }
}


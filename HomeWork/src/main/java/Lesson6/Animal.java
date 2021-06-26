package Lesson6;

public abstract class Animal {

    protected String name;
    int count;
    private static int animalsCount;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    abstract void run();

    abstract void swim();
}


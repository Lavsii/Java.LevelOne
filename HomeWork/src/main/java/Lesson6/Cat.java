package Lesson6;

import java.util.Random;

public class Cat extends Animal {

    protected final int CATRUNDIST = 200;
    protected boolean catswim;
    private static int catsCount;


    public Cat(String name, boolean catswim) {
        super(name);
        this.catswim = catswim;
        catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    @Override
    void run() {
        Random run = new Random();
        int catrun = run.nextInt(500) + 1;
        if ( catrun <= CATRUNDIST) {
            System.out.println("Кот " + name + " пробежал " + catrun + " м.");
        } else {
            System.out.println("Кот " + name + " не сможет пробежать " + catrun + " м.");
        }
    }

    @Override
    void swim(){
        if (!catswim){
            System.out.println("Кот " + name + " не умеет плавать");
        }else{
            System.out.println("Кот " + name + " любит воду - поплыл");
        }
    }


}


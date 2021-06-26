package Lesson6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", false);
        Cat cat2 = new Cat("Федя", false);
        Dog dog = new Dog("Ирбис");

        Animal[] animals = {cat, cat2, dog};
        for (Animal animal : animals) {
            animal.run();
            animal.swim();
        }
        System.out.println("Всего животных: " + Animal.getAnimalsCount() + "\nиз них:");
        System.out.println("котов и кошек: " + Cat.getCatsCount());
        System.out.println("собак: " + Dog.getDogsCount());
    }
}

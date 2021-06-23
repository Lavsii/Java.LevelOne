package Lesson5;

public class Main {
    public static void main(String[] args) {

            Stuff[] stuff = new Stuff[5];
            stuff[0] = new Stuff("Иванов Петр Алексеевич", "механик", "IvanovPA@company.com",
                    "+74951234567", 62000, 47);
            stuff[1] = new Stuff("Герасимов Максим Владимирович", "водитель", "gerasimov_mv@company.com",
                    "+73012587465", 53000, 46);
            stuff[2] = new Stuff("Науменко Петр Алексеевич", "инженер", "naumenko_pa@company.com",
                    "+79654567885", 77000, 33);
            stuff[3] = new Stuff("Максимов Виктор Андреевич", "конструктор", "maksimov_va@company.com",
                    "+73257895421", 82000, 39);
            stuff[4] = new Stuff("Краснов Виктор Иванович", "проектировщик", "krasnoc_vi@company.com",
                    "+79164568532", 76000, 48);

            for (Stuff item : stuff) {
                if (item.getAge() > 40) {
                    item.showInfo();
                }
            }
        }
    }

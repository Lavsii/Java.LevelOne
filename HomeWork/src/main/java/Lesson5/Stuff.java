package Lesson5;

public class Stuff {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;
    private final String EMPTY = " ";


    public Stuff(String fullname, String position, String email, String phone, double salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    void showInfo() {
        System.out.println(fullname + EMPTY + position + EMPTY + email + EMPTY + phone + EMPTY + salary + EMPTY + age);
    }
}

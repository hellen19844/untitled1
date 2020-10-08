package lesson5;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String telethon;
    private int salary;
    private int age;

    public Employee (String surname, String name,String patronymic, String position, String email, String telethon, int salary, int age){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.telethon = telethon;
        this.salary = salary;
        this.age = age;
    }
    public void infoFullName () {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
    }

    public void contacts () {
        System.out.println("Контакты: " + telethon + "; " + email);
    }

    public void otherDate () {
        System.out.println("Другая информация: " + position + " (должность), " + salary + " руб. (зарплата), " + age + " (возраст)");
    }

    public void setAge() {
        if (age > 40) {
            infoFullName();
            contacts();
            otherDate();
            System.out.println("\n");
        }
    }

}

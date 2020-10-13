package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов", "Иван", "Иванович", "токарь", "ivanov@mail.ru", "8(906)232-25-58", 50000, 55);
        employeesArray[1] = new Employee("Петров", "Петр", "Петрович", "главный инжинер", "petrov@mail.ru", "8(906)255-33-58", 150000, 50);
        employeesArray[2] = new Employee("Сидорова", "Татьяна", "Ивановна", "бухгалтер", "sidorova@mail.ru", "8(926)450-25-81", 70000, 35);
        employeesArray[3] = new Employee("Демченко", "Мария", "Николаевна", "научный сотрудник", "demchenko@mail.ru", "8(903)547-50-58", 50000, 25);
        employeesArray[4] = new Employee("Рябчеков", "Вячеслав", "Дмитриевич", "слесарь", "riabchekov@mail.ru", "8(926)812-25-33", 50000, 42);

        System.out.println("\n Сотрудники старше 40: \n");

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge()>40){
                employeesArray[i].infoFullName();
                System.out.println(" ");
                employeesArray[i].contacts();
                employeesArray[i].otherDate();
                System.out.println("\n");
            }
        }

    }

}

package lesson_3;

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov I.", "qa", "a@a",
                "098854362", 15000, 25);
        empArray[1] = new Employee("Petrenko I.", "dev", "a@a.com",
                "0988354362", 25000, 30);
        empArray[2] = new Employee("Pavlenko S.", "dev", "a@mail.com",
                "0987554362", 50000, 43);
        empArray[3] = new Employee("Shevchenko S.", "PM", "aaa@mail.com",
                "0983254362", 55000, 45);
        empArray[4] = new Employee("Romanenko A.", "qa", "a@mail.ua",
                "0987654362", 26000, 40);

        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}

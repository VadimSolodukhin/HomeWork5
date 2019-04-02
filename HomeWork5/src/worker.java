
    //* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;

public class worker {
    String fullName, position, email, numberPhone;
    int salary, age;

    //* Конструктор класса должен заполнять эти поля при создании объекта;

    public worker(String fullName, String position, String email, String numberPhone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    //* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    void getWorkerInfo() {
        System.out.println("ФИО: " + fullName + " | Должность: " + position
                + " | Email: " + email + " | Номер телефона: " + numberPhone + " | Зарплата: " + salary +
                " | Возраст: " + age);
    }
    int getAge() {
        return age;
    }
}


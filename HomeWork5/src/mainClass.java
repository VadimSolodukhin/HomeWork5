public class mainClass {
    public static void main(String[] args) {

        //* Создать массив из 5 сотрудников

        worker[] workers = new worker[5];
        workers[0] = new worker("Игорь", "Главный метролог", "igor@ya.ru",
                "+79998498457", 55000, 42);
        workers[1] = new worker("Степан", "Мастер участка", "stepan@ya.ru",
                "+79588456879", 30000, 33);
        workers[2] = new worker("Сергей", "Менеджер по рекламе", "sergey@ya.ru",
                "+79250056229", 30000, 55);
        workers[3] = new worker("Дмитрий", "Биржевой маклер", "dima@ya.ru",
                "+79258793406", 45000, 30);
        workers[4] = new worker("Алексей", "Лаборант", "alex@ya.ru",
                "+79251220902", 15000, 73);

        //* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40){
                workers[i].getWorkerInfo();
            }
        }
    }
}

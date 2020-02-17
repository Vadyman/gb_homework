package lesson5;

public class Organization {
    public static void main(String[] args) {

        int sumemployee = 5;
        Employee[] emplArray = new Employee[sumemployee];
        emplArray[0] = new Employee("Петров", "Олег", "Анатольевич", "oleg@mail.ru", "88005553530", 10000, 35);
        emplArray[1] = new Employee("Сидоров", "Дмитрий", "Алексеевич", "dmitry@mail.ru", "88005553531", 11000, 25);
        emplArray[2] = new Employee("Иванов", "Андрей", "Вадимович", "andrey@mail.ru", "88005553532", 12000, 55);
        emplArray[3] = new Employee("Колюжников", "Антон", "Андреевич", "anton@mail.ru", "88005553533", 13000, 65);
        emplArray[4] = new Employee("Богучаров", "Николай", "Дмитриевич", "nikolay@mail.ru", "8800555354", 14000, 28);


        for (int i = 0; i < sumemployee; i++) {
            if (emplArray[i].getAge() > 40) {
                emplArray[i].infoemployee();
            }
        }
    }
}

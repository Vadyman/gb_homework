package lesson6;

import javax.xml.namespace.QName;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 4, "Серый", 8, 200, 0, 2);
        Cat cat2 = new Cat("Мурзик", 3, "Белый", 4, 150, 0, 3);
        Dog dog = new Dog("Шарик", 5, "Белый", 10, 500, 10, 0.5);
        Dog dog2 = new Dog("Бобик", 4, "Белый", 9, 700, 9, 1);

        cat.swim(1);
        cat2.swim(0);
        cat.run(200);
        cat2.run(160);
        cat.jumpOverObstacle(2);
        cat2.jumpOverObstacle(4);

        dog.run(600);
        dog2.run(700);
    }

}

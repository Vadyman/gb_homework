package lesson7;

public class Test7 {

    public static void main(String[] args) {
        int numberOfCats = 7;
        Cat[] cats = new Cat[numberOfCats];
        Plate plate = new Plate(100);

        plate.info();
        for (int i = 0; i < numberOfCats; i++) {
            cats[i] = new Cat("Cat" + (i + 1), 13 + i);
            cats[i].eat(plate);
            System.out.println(cats[i]);
        }
        plate.info();
        plate.putFood(50);
        plate.info();

    }
//        Cat cat = new Cat("Barsik", -10);
//        Plate plate = new Plate(5);
//        plate.info();
//        cat.eat(plate);
//        plate.info();
//        cat.info();
//        plate.setFood(plate.getFood() - cat.getAppetite());

}

package lesson5;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bonya", "Brown", 8);
//        dog1.name = "Bonya";
//        dog1.color = "Brown";
//        dog1.age = 8;
        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "Jim";
        dog2.color = "White";
        dog2.age = 4;
        System.out.println(dog2);

        dog1.bark();


    }
}

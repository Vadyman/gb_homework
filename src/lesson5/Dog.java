package lesson5;

public class Dog {
     String name; //поле
     String color;
     int age;

     public Dog() {

     }

//     public Dog() {
//          name = "Bonya";
//          color = "Brown";
//          age = 8;
//
//     }

     public Dog(String name, String color, int age) { //аргументы
          this.name = name;
          this.color = color;
          this.age = age;
     }

     public void bark() {
          System.out.println("Bark");
     }

     @Override
     public String toString() {
          return "Dog{" +
                  "name='" + name + '\'' +
                  ", color='" + color + '\'' +
                  ", age=" + age +
                  '}';
     }
}

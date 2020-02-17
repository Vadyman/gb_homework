package lesson3;

public class StringFormat {


    public static void main(String[] args) {
        String name = "Oleg";
        int age = 28;

        String text = String.format("Hello! My name is %s! I'm %d", name, age); //форматирование строк

//        System.out.println("Hello! My name is " + name + "I'm " + age);
        System.out.println(text);
    }
}

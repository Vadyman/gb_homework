package lesson5;

public class User {
    private int id;
    private String name;
    private String position;
    private int age;

    public User(int id, String name, String position, int age) { //конструктор
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public void info() {
        System.out.println("id: " + id + "; Имя пользователя: " + name + "; Должность: " + position + "; Возраст: " + age);
    }

    public void changePosition(String position) {
        this.position = position;
        System.out.println("Пользователь: " + name + " получил новую должность: " + position);
    }

    public static void main(String[] args) {
        User user = new User(1, "Vadim", "Director", 24);
        user.info();
        user.changePosition("Nigga");
        user.info();
    }
}
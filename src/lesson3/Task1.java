package lesson3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        do {
            Scanner in = new Scanner(System.in);
            int r = 0 + (int) (Math.random() * 9);
            int p = 3;
            System.out.println("Угадайте число. Всего даётся " + p + " попытки!");

            for (int i = 0; i < 3; i++) {
                p--;
                System.out.print("Введите число: ");
                int num = in.nextInt();
                if (num == r) {
                    System.out.println("Поздравляю, Вы угадали!");
                    break;
                } else if (p == 0) {
                    System.out.println("Вы проиграли");
                    break;
                } else if (num < r) {
                    System.out.println("Загаданное число больше! " + "Осталось попыток: " + p);
                } else {
                    System.out.println("Загаданное число меньше! " + "Осталось попыток: " + p);
                }
            }
            System.out.println("Желаете ещё сыграть? Если ДА, введите цифру: 1, если НЕТ, то цифру: 0 ");
            int num = in.nextInt();

            if (num == 0) {
                break;
            }

        } while (true);

        
    }
}

package ru.geekbrains.gb_homework_java;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 2");

        byte val1 = -100;
        System.out.println(val1);

        short val2 = 32000;
        System.out.println(val2);

        int val3 = 3000;
        System.out.println(val3);

        long val4 = 200000l;
        System.out.println(val4);

        float val5 = 10.15f;
        System.out.println(val5);

        double val6 = -128.123;
        System.out.println(val6);

        char val7 = '@';
        System.out.println(val7);

        boolean val8 = true;
        System.out.println(val8);

        String val9 = "Nice day!";
        System.out.println(val9);

        System.out.println("Task 3");
        double result = expression(5, 6, 2, 1);
        System.out.println(result);

        System.out.println("Task 4");
        System.out.println(sumVariables(2, 5));
        System.out.println(sumVariables(7, 7));
        System.out.println(sumVariables(10, 10));
        System.out.println(sumVariables(11, 10));

        System.out.println("Task 5");
        ident(5);
        ident(0);
        ident(-5);

        System.out.println("Task 6");
        System.out.println(negativeDigit(5));
        System.out.println(negativeDigit(-5));

        System.out.println("Task 7");
        hello("Вадим");

        System.out.println("Task 8");
        yearLeap(1);
        yearLeap(4);
        yearLeap(40);
        yearLeap(100);
        yearLeap(300);
        yearLeap(400);
        yearLeap(700);
        yearLeap(2019);
        yearLeap(2020);

    }

    private static double expression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean sumVariables(int a, int b) {
        int sum = a + b;
        if (sum <= 20 && sum >= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static void ident(int a) {
        if (a < 0) {
            System.out.println("Число: " + a + " отрицательное");
        } else {
            System.out.println("Число: " + a + " положительное");
        }
    }

    private static boolean negativeDigit(int a) {
        return a < 0;
    }

    private static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static void yearLeap(int y) {
        if (y % 400 == 0) {
            System.out.println(y + " високосный год");
        } else if (y % 100 == 0) {
            System.out.println(y + " не високосный год");
        } else if (y % 4 == 0) {
            System.out.println(y + " високосный год");
        }
    }

}

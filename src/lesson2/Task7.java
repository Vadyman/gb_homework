package lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> alr = new ArrayList<Integer>();
        alr.add(1);
        alr.add(2);
        alr.add(3);
        alr.add(4);
        alr.add(5);
        int c = -3; // число n
        int s = alr.size();
        System.out.println(alr); //первоначальный массив
        nextarray(alr, c, s);
    }

    public static void nextarray(ArrayList<Integer> alr, int c, int s) {
        int indx = s - 1;
        int indxminus = 0;

        if (c > 0) {
            for (int j = 0; j < c; j++) {
                alr.add(0);
                //добавлял новые значения
            }
        } else {
            c = Math.abs(c);
            for (int j = 0; j < c; j++) {
                alr.add(0, 0);
                System.out.println(alr);
                //добавлял новые значения
            }
            c = -c;
        }

        int m = alr.size();
        Object[] arr = alr.toArray(); //снова в массив

        if (c >= 0) {
            do {
                arr[indx + c] = arr[indx]; // перемещение элементов на n количество
                arr[indx] = 0;
                indx--;
            } while (indx != -1);
            System.out.println(Arrays.deepToString(arr)); //вывод массива
        } else {
            c = Math.abs(c);
            do {
                arr[indxminus] = arr[indxminus + c]; // перемещение элементов на n количество
                arr[indxminus + c] = 0;
                indxminus++;
            } while (indxminus < s);
            System.out.println(Arrays.deepToString(arr)); //вывод массива
        }

    }

}

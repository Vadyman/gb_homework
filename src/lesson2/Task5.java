package lesson2;

public class Task5 {

    public static void main(String[] args) {
        int[] array = {8, 6, 2, 10, 4, 15, 7};
        int maxarr = 0;
        int minarr = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxarr) {
                maxarr = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (minarr > array[i]) {
                minarr = array[i];
            }
        }
        System.out.println(maxarr);
        System.out.println(minarr);
    }
}

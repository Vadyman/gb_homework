package lesson2;

public class Task6 {

    public static void main(String[] args) {
        int[] array = {8, 6, 2, 10, 4, 15, 1};
        int[] array2 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Результат сравнения 2х частей массива array: " + checkBalance(array));
        System.out.println("Результат сравнения 2х частей массива array2: " + checkBalance(array2));


    }

    public static boolean checkBalance(int[] array) {
        int length = array.length;
        int leftSum;
        int rightSum;

        for (int i = 0; i < length - 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += array[j];
            }

            for (int k = i + 1; k < length; k++) {
                rightSum += array[k];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }

}

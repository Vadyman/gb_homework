package lesson3;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
    }

    private static int sum(int firstvalue, int... other) {
        int sum = firstvalue;
        for (int value : other) {
            sum += value;
        }
        return sum;
    }
}

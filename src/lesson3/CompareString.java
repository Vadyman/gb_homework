package lesson3;

public class CompareString {

    public static void main(String[] args) {
        String str1 = "Java";// 010[001]
        String str2 = "Java";// 011[001]
        str2 = "Java1";// 011[003]
        String str3 = new String("Java");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 equals str3: " + (str1.equals(str3)));
    }
}

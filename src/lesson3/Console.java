package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = reader.readLine();
//        System.out.println("Line from console: " + line);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Line from console: " + str);

    }
}

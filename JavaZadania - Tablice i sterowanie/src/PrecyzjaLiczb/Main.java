package PrecyzjaLiczb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();
        System.out.println(a);

        if (a > 0) {

            for (double i = 0; i < a + 0.1; i += 0.1) {
                System.out.printf("%.1f ", i);
            }
        } else {
            for (double i = 0; i > a - 0.1; i -= 0.1) {
                System.out.printf("%.1f ", i);
            }

        }
    }
}

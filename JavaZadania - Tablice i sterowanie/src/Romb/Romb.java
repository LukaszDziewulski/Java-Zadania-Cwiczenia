package Romb;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        int b = a;
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < b; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            b -= 1;
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class EvenAdder {


    public static void main(String[] args) {


        int[] array = createEvenArray(5);
        System.out.println(Arrays.toString(reverseArray(array)));
    }


    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            System.out.println("Podaj kolejną liczbę:");
            int next = scanner.nextInt();
            if (isEven(next)) {
                result[i] = next;
            } else i--;
        }
        return result;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }


    private static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        return reversed;
    }

}

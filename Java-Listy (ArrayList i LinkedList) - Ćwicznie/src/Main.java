import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    final static String EXIT = "exit";

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();

        data(ints);
    }

    static Scanner s = new Scanner(System.in);


    static void data(List<Integer> ints) {
        System.out.print("podaj liczbę: ");
        String a = s.nextLine();
        int sum = 0;
        if (!a.equals(EXIT)) {
            Integer b = Integer.parseInt(a);
            ints.add(b);
            System.out.print("liczby w tablicy to: ");
            for (Integer anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
            data(ints);
        } else {
            for (int i = 0; i < ints.size(); i++) {
                sum += ints.get(i);

            }
            System.out.print("a + b + c + ... + N = ");
            System.out.println(sum);
        }
    }
}

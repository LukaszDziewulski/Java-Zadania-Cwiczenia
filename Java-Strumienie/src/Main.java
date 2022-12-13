import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        IntStream intStream = IntStream.of(5, 56, 2, 8, 4, 2, 99, 6, 65);
        int[] ints = intStream.filter(x -> x < 10)
                .map(x -> x * x)
                .toArray();

        System.out.println(Arrays.toString(ints));


        Stream<String> letters = Stream.of("a", "b", "c");
        String[] upperCaseLetters = letters.map(String::toUpperCase)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(upperCaseLetters));


        int[] numStream = IntStream.iterate(0, x -> x + 1)
                .limit(100)
                .filter(x -> x % 2 == 0 && x < 45)
                .map(x -> x * x)
                .toArray();
        System.out.println(Arrays.toString(numStream));


        int[] numStream1 = IntStream.rangeClosed(0, 99)
                .filter(x -> x % 2 == 0 && x < 45)
                .toArray();
        System.out.println(Arrays.toString(numStream1));

        Scanner scanner = new Scanner(new File("tekst.txt"));
        scanner.tokens()
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }
}

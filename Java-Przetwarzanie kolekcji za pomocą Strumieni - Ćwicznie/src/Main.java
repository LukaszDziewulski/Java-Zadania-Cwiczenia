import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner scanner = new Scanner(new File("C:/Users/hp/Desktop/lol.txt"));

        Stream<String> tokens = scanner.tokens();
        List<String> collect = tokens.toList();

        collect = collect.stream().map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countSWords = collect.stream()
                .filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        long fiveLetters = collect.stream()
                .filter(s -> s.length() == 5)
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        System.out.println("Liczba wyrazów na 's': " + countSWords);
        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);



    }
}

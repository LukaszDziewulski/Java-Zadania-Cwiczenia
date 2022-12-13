import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        IntStream
                .rangeClosed(0, 10000)
                .filter(c -> c > 100 && c < 1000 && c % 5 == 0)
                .limit(10)
                .map(x -> x * 3)
                .forEach(System.out::println);

        System.out.println();

        Stream.iterate(0, x -> x + 1)
                .filter(c -> c > 100 && c < 1000 && c % 5 == 0)
                .limit(10)
                .map(x -> x * 3)
                .forEach(System.out::println);
    }
}

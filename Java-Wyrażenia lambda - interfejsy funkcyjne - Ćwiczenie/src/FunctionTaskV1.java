import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionTaskV1 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        System.out.println(">>> wygenerowanie randomowych 10 liczb");
        generateRandomNumbers(numbers,10, () -> random.nextInt(50));
        consumeList(numbers, p -> System.out.print(p + " "));
        System.out.println();



        System.out.println(">>> usunięcie liczb podzielnych przez 2");
        deleteNumber(numbers, p -> p % 2 == 0);
        consumeList(numbers, p -> System.out.print(p + " "));


    }

    private static <T> void deleteNumber(List<T> list, Predicate<T> predicate) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T tmp = it.next();
            if (predicate.test(tmp)) {
                it.remove();
            }
        }
    }


    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> void generateRandomNumbers(List<T> list,int elements, Supplier<T> supplier) {
        for (int i = 0; i < elements; i++) {
            list.add(supplier.get());
        }

    }

}

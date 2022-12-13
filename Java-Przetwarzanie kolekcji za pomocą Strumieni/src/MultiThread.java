import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MultiThread {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 32, 4, 50, 6, 71, 8, 9, 10);
        ints = ints.parallelStream()
                .sorted(Integer::compareTo)
                .map(MultiThread::incrementValue)
                .collect(Collectors.toList());
    }

    public static int incrementValue(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Przetwarzam " + x);
        return x + 1;
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private static final int NO_OF_NUMBERS = 49;
    public static final int MAX_NUMBERS = 6;
    List<Integer> numbers = new ArrayList<>();


    public void generate() {
        for (int i = 0; i <NO_OF_NUMBERS; i++) {
            numbers.add(i + 1);
        }
    }

    public List<Integer> randomize() {
        Collections.shuffle(numbers);
        List<Integer> number = new ArrayList<>();
        number = numbers.subList(0,MAX_NUMBERS);
        return number;
    }

    public int checkResult(List<Integer> numbers) {
        List<Integer> randomize = randomize();
        int frequency = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            int frequency1 = Collections.frequency(randomize, numbers.get(i));
            frequency += frequency1;

        }
        System.out.println(frequency);
        return frequency;
    }
}

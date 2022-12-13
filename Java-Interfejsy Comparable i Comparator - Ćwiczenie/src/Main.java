import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Integer[] tab = { 1, 5, 10, 19, 102, 43, 25, 36, 31, 99,
                9, 77, 7, 66, 6, 55, 44, 33, 1098, 1111 };



        System.out.println("Nieposortowana: ");
        System.out.println(Arrays.toString(tab));
        System.out.println();
        Arrays.sort(tab);
        System.out.println("Posortowana rosnąco: ");
        System.out.println(Arrays.toString(tab));
        System.out.println();

        Arrays.sort(tab, new Comparator<Integer>() {
            @Override
            public int compare(Integer p1, Integer p2) {
                return -p1.compareTo(p2);
            }
        });
        System.out.println("Posortowana malejąco: ");
        System.out.println(Arrays.toString(tab));
    }
}

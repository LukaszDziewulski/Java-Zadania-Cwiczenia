import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Stefan", "Jan", "Karol", "Piotr", "Andrzej"));
        System.out.println(names);

        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);



    }



}

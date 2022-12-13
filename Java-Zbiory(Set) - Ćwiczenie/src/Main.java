import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
       final String fileName = "C:/Users/hp/Desktop/namespl.txt";


        try
                (Scanner sc = new Scanner(new File(fileName))
        ) {
            while (sc.hasNextLine()) {
                set.add(sc.nextLine());
            }
            System.out.println(set);
            System.out.println("Size: " + set.size());
            System.out.println("First: " + set.first());
            System.out.println("Last: " + set.last());
            System.out.println("Contains 2? " + set.contains("aaa"));
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
        }


    }


}

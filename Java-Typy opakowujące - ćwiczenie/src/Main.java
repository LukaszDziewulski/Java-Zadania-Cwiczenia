import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        String fileName = "C:/Users/hp/Desktop/lol.txt";


        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader)
        ) {

            String nextLine;
            int lines = 0;
            int sum1 = 0;
            BigInteger a = null;
            BigInteger b = null;
            System.out.println("Liczby w pliku to:");


            while ((nextLine = reader.readLine()) != null) {
                if (lines == 4) {
                    System.out.println(nextLine);
                    System.out.println();
                    b = new BigInteger(nextLine);
                    lines++;
                }
                if (lines == 3) {
                    System.out.println(nextLine);
                    a = new BigInteger(nextLine);
                    lines++;
                }
                if (lines < 3) {
                    System.out.println(nextLine);
                    sum1 += Integer.parseInt(nextLine);
                    lines++;
                }
            }
            System.out.println("Suma liczb w pierwszych 3 wierszach: ");
            System.out.println(sum1);
            System.out.println();
            System.out.println("Suma liczb w wierszach 4 i 5: ");
            System.out.println(a.add(b));

        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.err.println("Błąd odczytu danych");
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCreator {

    public static void main(String[] args) {
        String fileName = "testxFile.txt";

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader)
        ) {

            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("liczba wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

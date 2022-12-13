import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectWriter {

    public static void main(String[] args) {

        String fileName = "person.obj";
        Person p1 = null;

        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
        ){
            p1 = (Person) ois.readObject();



        }catch (IOException | ClassNotFoundException e){
            System.err.println("nie udało się zapisać pliku");
            e.printStackTrace();

        }
        if (p1 != null){
            System.out.println("wczytano dane o: ");
            System.out.println(p1.getFirstName() + " " + p1.getLastName());
        }
    }
}

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Scanner sc = new Scanner(System.in);

        hospital.systemOn(sc);

        sc.close();

    }
}





public class HospitalApp {

    public static void main(String[] args) {


        Hospital.add(new Doctor("Adam", "Glapa", 8900, 1500));
        Hospital.add(new Nurse("Aga", "Maj", 4900, 30));
        Hospital.add(new Nurse("Milena", "Tor", 3800, 10));

        Hospital.getInfo();


    }
}

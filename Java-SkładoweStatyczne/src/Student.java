import java.util.Scanner;

public class Student {

    private static String firstName;
    private static String lastName;
    private static String idIndex;
    private static int studentNumber = 0;



    public Student() {
    }

    public Student(String firstName, String lastName, String idIndex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idIndex = idIndex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdIndex() {
        return idIndex;
    }

    public void setIdIndex(String idIndex) {
        this.idIndex = idIndex;
    }


    public static void addStudent(Scanner sc){
        System.out.println("Wprowadź dane nowego studenta:");
        Student student = new Student();
        System.out.println("firstname: ");
        student.setFirstName(sc.nextLine());
        System.out.println("lastname: ");
        student.setLastName(sc.nextLine());
        System.out.println("idIndex: ");
        student.setIdIndex(sc.nextLine());
        studentNumber += 1;
        System.out.println();
    }

    public static void printStudentNumber(){
        System.out.println("Liczba studentów na uczelni to: " + studentNumber);
    }

}


import java.util.Scanner;

public class University {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student.addStudent(sc);
        Student.addStudent(sc);

        Student.printStudentNumber();


    }
}

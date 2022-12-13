import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculate = new Calculator();

        calculate.Cal(sc);

        sc.close();

    }
}

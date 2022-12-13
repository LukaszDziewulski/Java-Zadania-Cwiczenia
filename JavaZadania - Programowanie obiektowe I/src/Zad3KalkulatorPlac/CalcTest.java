package Zad3KalkulatorPlac;

public class CalcTest {
    public static void main(String[] args) {

        double v = PaymentCalculator.nettoYearPayment(new Employee("Adam", "Glapa", 3000));
        double v1 = PaymentCalculator.bruttoYearPayment(new Employee("Adam", "Glapa", 3000));
        System.out.println(v);
        System.out.println(v1);

    }
}

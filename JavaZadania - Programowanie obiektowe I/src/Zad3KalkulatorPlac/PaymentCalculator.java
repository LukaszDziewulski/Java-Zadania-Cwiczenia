package Zad3KalkulatorPlac;

public class PaymentCalculator {

    public static double nettoYearPayment(Employee employee){
        return 12*employee.getSalary();
    }

    public static double bruttoYearPayment(Employee employee){
        return 12*1000+12*(employee.getSalary()*0.2+employee.getSalary());
    }
}

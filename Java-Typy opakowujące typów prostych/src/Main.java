public class Main {

    public static void main(String[] args) {

        String numberString = "5.5";
        double num = Double.parseDouble(numberString);
        double num2 = Double.valueOf(numberString);
        System.out.println(num);
        System.out.println(num2);
    }
}

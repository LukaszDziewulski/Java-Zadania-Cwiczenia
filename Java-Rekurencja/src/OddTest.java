public class OddTest {
    public static void main(String[] args) {
        String number = parzysta(58);
        System.out.println(number);

    }

    private static String parzysta(int n) {
        return n % 2 == 0 ? n + " parzysta" : n + " nieparzysta";
    }
}

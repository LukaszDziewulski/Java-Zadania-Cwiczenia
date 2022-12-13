import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {

        double a = 0.7;
        double b = 0.3;
        System.out.println(a - b);

        BigInteger big1 = new BigInteger("123456789123456789");
        BigInteger big2 = new BigInteger("987654321987654321");

        System.out.println(big1.add(big2));

        BigDecimal bigg1 = new BigDecimal("0.3");
        BigDecimal bigg2 = new BigDecimal("0.7");

        System.out.println(bigg1.add(bigg2));


    }
}

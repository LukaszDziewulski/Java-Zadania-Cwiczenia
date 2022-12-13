import java.util.List;

public class LottoSys {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        int ileLosowan = 0;
        boolean a = true;
        List<Integer> numbers = List.of(45,23,14,78,19,11);
        lotto.generate();

        while (a) {
            if (lotto.checkResult(numbers) == 6) {
                a = false;
            } else {
                a = true;
            }
            ileLosowan++;
            System.out.print(ileLosowan + "    ");
        }
        System.out.println("po " + ileLosowan +" losowaniach !");
    }
}

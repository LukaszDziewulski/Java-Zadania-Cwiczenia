public class Main {

    public static void main(String[] args) {


        Pair<Integer, String> integerStringPair1 = new Pair<>(45,"ala");
        Pair<Integer, Double> integerStringPair2 = new Pair<>(45,2.5);
        Pair<String, Double> integerStringPair3 = new Pair<>("siema",123.123);
        System.out.println(integerStringPair1);
        System.out.println(integerStringPair2);
        System.out.println(integerStringPair3);




        Pair.printtPair(integerStringPair1);
        Pair.printtPair(integerStringPair2);
        Pair.printtPair(integerStringPair3);
    }
}

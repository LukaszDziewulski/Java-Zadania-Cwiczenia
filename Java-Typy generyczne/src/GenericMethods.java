public class GenericMethods {


    public static   <T> void print5Time(T agr) {
        for (int i = 0; i < 5; i++) {
            System.out.println(agr);
        }
    }
}

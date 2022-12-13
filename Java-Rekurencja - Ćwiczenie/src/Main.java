public class Main {

    public static void main(String[] args) {
        long liczbaNaturalna = 8;
        long result = silnia(liczbaNaturalna);

        System.out.println("Silnia " + liczbaNaturalna + "! = " + result);


    }
    public static long silnia (long x){
        return x > 0? x * silnia(x - 1): 1;
    }
}

public class Pair <T,V>{
    private final T t1;
    private final V t2;

    public Pair(T t1, V t2) {
        this.t1 = t1;
        this.t2 = t2;
    }



    public static   <T,V> void printtPair(Pair<T,V>pair){
        System.out.println(pair.getT1() + " " + pair.getT2());
    }

    public T getT1() {
        return t1;
    }

    public V getT2() {
        return t2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }
}

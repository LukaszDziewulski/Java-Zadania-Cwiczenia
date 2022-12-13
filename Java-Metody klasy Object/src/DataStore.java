public class DataStore {
    private final static int MAX_COMP = 100;
    private static Computer[] computers = new Computer[MAX_COMP];
    static private int quantityComp = 0;

    static public void add(Computer computer) {
        computers[quantityComp] = computer;
        quantityComp++;
    }

    static public void printComp() {
        for (int i = 0; i < quantityComp; i++) {
            System.out.println(computers[i].getModel() + " " + computers[i].getProducer());

        }
    }

    static public String checkAvailability(Computer computer) {
        int sameComp = 0;
        for (int i = 0; i < quantityComp; i++) {
            if (computers[i].equals(computer)) {
                sameComp++;
            }
        }
        return "Ilość takich samych komputeró w sklepie to: " + sameComp;
    }


}

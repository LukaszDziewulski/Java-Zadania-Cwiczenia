package Zad1Cabrio;



public class CabrioTest {

    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("A6", "Audi", true, true);
        cabrio.closeRoof();
        cabrio.setInMove(false);
        cabrio.closeRoof();
    }
}

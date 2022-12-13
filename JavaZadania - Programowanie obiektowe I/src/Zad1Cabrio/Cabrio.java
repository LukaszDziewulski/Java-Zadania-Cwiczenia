package Zad1Cabrio;

public class Cabrio {
    private String name;
    private String marka;
    private boolean inMove;
    private boolean isOpenRoof;

    public Cabrio(String name, String marka, boolean inMove, boolean isOpenRoof) {
        this.name = name;
        this.marka = marka;
        this.inMove = inMove;
        this.isOpenRoof = isOpenRoof;
    }

    public void openRoof() {
        if (isOpenRoof) {
            System.out.println("dach jest już otwarty");
        } else if (!inMove) {
            isOpenRoof = true;
            System.out.println("dach został otwarty!");
        } else {
            System.out.println("Nie można otworztć dachu podczas jazdy!!");
        }
    }

    public void closeRoof() {
        if (!isOpenRoof) {
            System.out.println("dach jest już zamknięty");
        } else if (!inMove) {
            isOpenRoof = false;
            System.out.println("dach został zamknięty!");
        } else {
            System.out.println("Nie można zamknąć dachu podczas jazdy!!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public boolean isInMove() {
        return inMove;
    }

    public void setInMove(boolean inMove) {
        this.inMove = inMove;
    }

    public boolean isOpenRoof() {
        return isOpenRoof;
    }

    public void setOpenRoof(boolean openRoof) {
        isOpenRoof = openRoof;
    }

    @Override
    public String toString() {
        return "Zad1Cabrio.Cabrio{" +
                "name='" + name + '\'' +
                ", marka='" + marka + '\'' +
                ", inMove=" + inMove +
                ", isOpenRoof=" + isOpenRoof +
                '}';
    }
}

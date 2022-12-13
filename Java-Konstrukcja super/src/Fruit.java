public class Fruit {
    private int scales;
    private String fruitType;

    public Fruit(int scales, String fruitType) {
        this.scales = scales;
        this.fruitType = fruitType;
    }

    public int getScales() {
        return scales;
    }

    public void setScales(int scales) {
        this.scales = scales;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public String getInfo(){
        return "waga: " + scales
                + "g, typ owocu: " + fruitType;
    }
}

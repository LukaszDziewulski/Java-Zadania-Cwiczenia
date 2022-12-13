public class Apple extends Fruit {
    private String variety;
    private static final String TYPE = "jabłkowate";


    public Apple(int scales, String variety) {
        super(scales, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getInfo() {
        return super.getInfo()
                + ", odmiana: " + variety;



    }
}

package blocks;

public class Block implements interfaces.Block {

    private String color;
    private String material;

    public Block(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

}

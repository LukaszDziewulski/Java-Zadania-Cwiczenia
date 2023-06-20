package blocks;

import interfaces.Block;
import interfaces.CompositeBlock;

import java.util.List;

public class DualBlockImpl implements CompositeBlock {

    private String color;
    private String material;
    private List<Block> blocks;

    public DualBlockImpl(String color, String material, List<Block> blocks) {
        this.color = color;
        this.material = material;
        this.blocks = blocks;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}

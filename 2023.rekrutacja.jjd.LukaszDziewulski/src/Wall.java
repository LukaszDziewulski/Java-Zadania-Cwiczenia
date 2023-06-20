import blocks.BlockImpl;
import interfaces.Block;
import interfaces.CompositeBlock;
import interfaces.Structure;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Wall implements Structure {

    private List<CompositeBlock> compositeBlocks;

    public Wall(List<CompositeBlock> compositeBlocks) {
        this.compositeBlocks = compositeBlocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return getBlockStream()
                .flatMap(getCompositeBlockStreamFunction())
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return getBlockStream()
                .flatMap(getCompositeBlockStreamFunction())
                .filter(block -> block.getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
        if (Objects.isNull(compositeBlocks)) {
            return 0;
        }
        return getBlockStream()
                .flatMap(getCompositeBlockStreamFunction())
                .toList().size();
    }

    public static BlockImpl addBlock(String color, String material) {
        return new BlockImpl(color, material);
    }

    private Function<CompositeBlock, Stream<? extends Block>> getCompositeBlockStreamFunction() {
        return compositeBlocks -> compositeBlocks.getBlocks().stream();
    }

    private Stream<CompositeBlock> getBlockStream() {
        return Stream.ofNullable(compositeBlocks)
                .flatMap(Collection::stream);
    }


}

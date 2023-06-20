import interfaces.Block;
import interfaces.Structure;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Wall implements Structure {

    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return getBlockStream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return getBlockStream()
                .filter(block -> block.getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
        if (Objects.isNull(blocks)) {
            return 0;
        }
        return blocks.size();
    }

    private Stream<Block> getBlockStream() {
        return Stream.ofNullable(blocks)
                .flatMap(Collection::stream);
    }
}

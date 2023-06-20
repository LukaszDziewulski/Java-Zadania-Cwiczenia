import blocks.BlockImpl;
import blocks.DualBlockImpl;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {

        BlockImpl concreteBlock1 = new BlockImpl("red", "concrete");
        BlockImpl concreteBlock2 = new BlockImpl("red", "concrete");
        BlockImpl concreteBlock3 = new BlockImpl("blue", "concrete");
        DualBlockImpl dualConcreteBlock = new DualBlockImpl("red", "concrete", List.of(concreteBlock1, concreteBlock2));
        BlockImpl brickBlock1 = new BlockImpl("red", "brick");
        BlockImpl brickBlock2 = new BlockImpl("green", "brick");
        DualBlockImpl dualBrickBlock = new DualBlockImpl("blue", "concrete", List.of(brickBlock1, brickBlock2));


        Wall wall = new Wall(List.of(
                brickBlock1,
                brickBlock2,
                concreteBlock1,
                concreteBlock2,
                concreteBlock3,
                dualConcreteBlock,
                dualBrickBlock
        ));


        System.out.println(wall.findBlockByColor("red"));

        System.out.println(wall.findBlocksByMaterial("brick"));

        System.out.println(wall.count());
    }
}

import blocks.Block;
import blocks.DualBlock;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {

        Block concreteBlock1 = new Block("red", "concrete");
        Block concreteBlock2 = new Block("red", "concrete");
        Block concreteBlock3 = new Block("blue", "concrete");
        DualBlock dualConcreteBlock = new DualBlock("red", "concrete", List.of(concreteBlock1, concreteBlock2));
        Block brickBlock1 = new Block("red", "brick");
        Block brickBlock2 = new Block("green", "brick");
        DualBlock dualBrickBlock = new DualBlock("blue", "concrete", List.of(brickBlock1, brickBlock2));


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

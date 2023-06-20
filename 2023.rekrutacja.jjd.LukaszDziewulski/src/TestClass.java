import blocks.DualBlockImpl;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {

        DualBlockImpl dualBlock1 = new DualBlockImpl("red", "concrete", List.of(
                Wall.addBlock("red", "concrete"),
                Wall.addBlock("blue", "concrete"),
                Wall.addBlock("green", "concrete"),
                Wall.addBlock("red", "brick"),
                Wall.addBlock("blue", "brick"),
                Wall.addBlock("green", "brick")
        ));

        DualBlockImpl dualBlock2 = new DualBlockImpl("blue", "brick", List.of(
                Wall.addBlock("yellow", "concrete"),
                Wall.addBlock("blue", "concrete"),
                Wall.addBlock("pink", "concrete"),
                Wall.addBlock("yellow", "brick"),
                Wall.addBlock("blue", "brick"),
                Wall.addBlock("pink", "brick")
        ));

        Wall wall = new Wall(List.of(
                dualBlock1,
                dualBlock2
        ));

        System.out.println(wall.findBlockByColor("red"));
        System.out.println(wall.findBlocksByMaterial("brick"));
        System.out.println(wall.count());
    }
}
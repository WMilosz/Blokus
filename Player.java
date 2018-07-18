package sample;


import javafx.scene.paint.Color;
import java.util.Vector;

public class Player {

    private Vector<Block> blocks;
    private Color color;
    private int amountOfBlocks;
    private int index;

    public Player(Color color, int index)
    {
        this.amountOfBlocks = 0;
        this.color = color;
        this.blocks = new Vector<Block>();
        this.index = index;
        initBlocks();

    }

    public void initBlocks()
    {
        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(0).createFig1();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(1).createFig2();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(2).createFig3();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(3).createFig4();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(4).createFig5();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(5).createFig6();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(6).createFig7();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(7).createFig8();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(8).createFig9();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(9).createFig10();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(10).createFig11();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(11).createFig12();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(12).createFig13();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(13).createFig14();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(14).createFig15();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(15).createFig16();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(16).createFig17();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(17).createFig18();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(18).createFig19();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(19).createFig20();

        blocks.add(new Block(7,7));
        amountOfBlocks++;
        blocks.get(20).createFig21();
    }

    public Color getColor()
    {
        return color;
    }

    public Vector<Block> getBlocks()
    {
        return blocks;
    }

    public int getAmountOfBlocks()
    {
        return amountOfBlocks;
    }

    public void delBlock(Block block)
    {
        for(Block b: blocks)
        {
            if(b == block)
            {
                blocks.removeElement(b);
                amountOfBlocks--;
                break;
            }
        }
    }

    public int getIndex()
    {
        return index;
    }
}

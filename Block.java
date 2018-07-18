package sample;

import java.util.Vector;

public class Block {

    private int size;
    private int x;
    private int y;
    private Vector<Box> pieces;

    public Block(int startX, int startY)
    {
        this.size = 0;
        this.pieces = new Vector<Box>();
        x = startX;
        y = startY;
    }

    public Block(Vector<Box> pieces, int size)
    {
        this.pieces = pieces;
        this.size = size;
    }

    public void createFig1()
    {
        size = 1;
        pieces.add(new Box(35, x, y));
    }

    public void createFig2()
    {
        size = 2;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
    }

    public void createFig3()
    {
        size = 3;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
    }

    public void createFig4()
    {
        size = 3;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x - 1,y + 1));
    }

    public void createFig5()
    {
        size = 4;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x + 1,y + 2));
    }

    public void createFig6()
    {
        size = 4;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x + 1,y + 1));
        pieces.add(new Box(35, x - 1, y));
    }

    public void createFig7()
    {
        size = 4;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x,y + 3));
    }

    public void createFig8()
    {
        size = 4;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x + 1,y + 1));
        pieces.add(new Box(35, x + 1, y));
    }

    public void createFig9()
    {
        size = 4;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x + 1,y + 1));
        pieces.add(new Box(35, x, y + 2));
    }

    public void createFig10()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x,y + 3));
        pieces.add(new Box(35, x,y + 4));
    }

    public void createFig11()
    {
        size = 5;
        pieces.add(new Box(35,x,y));
        pieces.add(new Box(35,x,y + 1));
        pieces.add(new Box(35,x,y - 1));
        pieces.add(new Box(35,x + 1, y));
        pieces.add(new Box(35,x - 1, y));
    }

    public void createFig12()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35,x - 1, y));
        pieces.add(new Box(35,x + 1, y));
        pieces.add(new Box(35,x - 1,y - 1));
        pieces.add(new Box(35,x + 1, y - 1));
    }

    public void createFig13()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x,y + 3));
        pieces.add(new Box(35, x + 1,y + 3));
    }

    public void createFig14()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x + 1,y + 2));
        pieces.add(new Box(35, x + 2,y + 2));
    }

    public void createFig15()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x + 1,y + 2));
        pieces.add(new Box(35, x + 1,y + 3));
    }

    public void createFig16()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x + 1,y + 2));
        pieces.add(new Box(35, x - 1, y));
    }

    public void createFig17()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x + 1,y + 2));
        pieces.add(new Box(35, x - 1, y + 2));
    }

    public void createFig18()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x + 1,y + 2));
        pieces.add(new Box(35, x - 1,y + 1));
    }

    public void createFig19()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x,y + 2));
        pieces.add(new Box(35, x + 1,y + 2));
        pieces.add(new Box(35, x,y + 3));
    }

    public void createFig20()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x + 1,y + 1));
        pieces.add(new Box(35, x + 1, y));
        pieces.add(new Box(35, x + 2, y));
    }

    public void createFig21()
    {
        size = 5;
        pieces.add(new Box(35, x, y));
        pieces.add(new Box(35, x,y + 1));
        pieces.add(new Box(35, x + 1,y + 1));
        pieces.add(new Box(35, x + 1,y + 2));
        pieces.add(new Box(35, x + 2,y + 2));
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getSize()
    {
        return size;
    }

    public Vector<Box> getPieces()
    {
        return pieces;
    }


}

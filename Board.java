package sample;

import java.util.Vector;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Board {

    private Rectangle table[][];
    private int tableChecker[][];
    private int size;
    private GridPane gridPane;
    private Player player1;
    private Player player2;

    public Board(GridPane gridPane, int size, Player player1, Player player2)
    {
        this.gridPane = gridPane;
        this.size = size;
        this.player1 = player1;
        this.player2 = player2;
        this.table = new Rectangle[size][size];
        this.tableChecker = new int[size][size];
    }

    public void crateBoard(int boxSize)
    {
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++) {

                table[i][j] = new Rectangle(boxSize,boxSize);
                gridPane.add(table[i][j], i, j);
                table[i][j].setVisible(true);
                table[i][j].setFill(javafx.scene.paint.Color.GRAY);
                table[i][j].setStroke(Color.BLACK);
            }
        }
    }

    public void showFig(Player player, Block block)
    {
        Vector<Box> pieces = block.getPieces();
        for(Box piece: pieces)
        {
            table[piece.getX()][piece.getY()].setFill(player.getColor());
        }
    }

    public void rotateBlock(Block block)
    {
        Box firstBox = block.getPieces().firstElement();
        for(int i = 1; i < block.getSize(); i++)
        {
            int newX = firstBox.x + firstBox.y - block.getPieces().elementAt(i).getY();
            int newY = firstBox.y + block.getPieces().elementAt(i).getX() - firstBox.x;
            if(newX >= size || newX < 0 || newY < 0 || newX >= size)
                return;
        }

        for(int i = 1; i < block.getSize(); i++)
        {
            int newX = firstBox.x + firstBox.y - block.getPieces().elementAt(i).getY();
            int newY = firstBox.y + block.getPieces().elementAt(i).getX() - firstBox.x;
            block.getPieces().elementAt(i).setX(newX);
            block.getPieces().elementAt(i).setY(newY);
        }
    }

    public void clearFig(Block block)
    {
        Vector<Box> pieces = block.getPieces();
        for(Box piece: pieces)
        {
            if(tableChecker[piece.getX()][piece.getY()] == 0)
            {
                table[piece.getX()][piece.getY()].setFill(Color.GRAY);
            }
        }
    }

    public void initTable()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                tableChecker[i][j] = 0;
            }
        }
    }

    public void putBlock(Player player, Block block)
    {
        Vector<Box> pieces = block.getPieces();
        for(Box piece: pieces)
        {
            tableChecker[piece.getX()][piece.getY()] = player.getIndex();
        }
    }

    public void refreshBoard()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if( tableChecker[i][j] == 1)
                {
                    table[i][j].setFill(player1.getColor());
                }
                else if( tableChecker[i][j] == 2)
                {
                    table[i][j].setFill(player2.getColor());
                }
                else
                {
                    table[i][j].setFill(Color.GRAY);
                }
            }
        }
    }

    public void moveFig(Player player, Block block, Destination dest)
    {
        switch(dest)
        {
            case LEFT:
            {
                if(checkBounds(block, Destination.LEFT))
                {
                    Vector<Box> pieces = block.getPieces();
                    for(Box piece: pieces)
                    {
                        if(tableChecker[piece.getX()][piece.getY()] == 0)
                            table[piece.getX()][piece.getY()].setFill(Color.GRAY);
                    }
                    for(Box piece: pieces)
                    {
                        piece.decX();
                        table[piece.getX()][piece.getY()].setFill(player.getColor());
                    }
                }
                break;
            }
            case RIGHT:
            {
                if(checkBounds(block, Destination.RIGHT))
                {
                    Vector<Box> pieces = block.getPieces();
                    for(Box piece: pieces)
                    {
                        if(tableChecker[piece.getX()][piece.getY()] == 0)
                            table[piece.getX()][piece.getY()].setFill(Color.GRAY);
                    }
                    for(Box piece: pieces)
                    {
                        piece.incX();
                        table[piece.getX()][piece.getY()].setFill(player.getColor());
                    }
                }
                break;
            }
            case UP:
            {
                if(checkBounds(block, Destination.UP))
                {
                    Vector<Box> pieces = block.getPieces();
                    for(Box piece: pieces)
                    {
                        if(tableChecker[piece.getX()][piece.getY()] == 0)
                            table[piece.getX()][piece.getY()].setFill(Color.GRAY);
                    }
                    for(Box piece: pieces)
                    {
                        piece.decY();
                        table[piece.getX()][piece.getY()].setFill(player.getColor());
                    }
                }
                break;
            }
            case DOWN:
            {
                if(checkBounds(block, Destination.DOWN))
                {
                    Vector<Box> pieces = block.getPieces();
                    for(Box piece: pieces)
                    {
                        if(tableChecker[piece.getX()][piece.getY()] == 0)
                            table[piece.getX()][piece.getY()].setFill(Color.GRAY);
                    }
                    for(Box piece: pieces)
                    {
                        piece.incY();
                        table[piece.getX()][piece.getY()].setFill(player.getColor());
                    }
                }
                break;
            }

        }
    }

    public boolean checkIfClear(Block block)
    {
        Vector<Box> boxes = block.getPieces();
        for(Box box : boxes)
        {
            if(tableChecker[box.getX()][box.getY()] != 0)
                return false;
        }
        return true;
    }

    public boolean checkBounds(Block block, Destination destination)
    {
        Vector<Box> pieces = block.getPieces();
        switch(destination)
        {
            case UP:
            {
                for(Box piece: pieces)
                {
                    if(piece.getY() - 1 < 0 || piece.getX() >= size || piece.getX() < 0)
                        return false;
                }
                break;
            }
            case DOWN:
            {
                for(Box piece: pieces)
                {
                    if(piece.getY() + 1 >= size || piece.getX() >= size || piece.getX() < 0)
                        return false;
                }
                break;
            }
            case LEFT:
            {
                for(Box piece: pieces)
                {
                    if(piece.getY() < 0 || piece.getY() >= size || piece.getX() - 1 < 0)
                        return false;
                }
                break;
            }
            case RIGHT:
            {
                for(Box piece: pieces)
                {
                    if(piece.getY() < 0 || piece.getY() >= size || piece.getX() + 1 >= size)
                        return false;
                }
                break;
            }
        }
        return true;
    }

}

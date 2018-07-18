package sample;

public class Box {

    public int size;
    public int x;
    public int y;

    public Box()
    {

    }

    public Box(int size, int x, int y)
    {
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return this.x;
    }

    public void incX()
    {
        x++;
    }

    public void decX()
    {
        x--;
    }

    public int getY()
    {
        return this.y;
    }

    public void incY()
    {
        y++;
    }
    public void decY()
    {
        y--;
    }

    public void setX(int newX)
    {
        x = newX;
    }

    public void setY(int newY)
    {
        y = newY;
    }



}

//direction.move(currentvector)

public interface Direction
{
    //public TwoDVector move(TwoDVector v);
    public Vector move(Vector v);
    public Vector turnLeft(Vector v);
    public Vector turnRight(Vector v);
}



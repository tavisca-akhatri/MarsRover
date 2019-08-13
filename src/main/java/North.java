public class North implements Direction
{

    @Override
    public Vector move(Vector v) {
        return new Vector(v.x,v.y+1 , new North());
    }

    @Override
    public Vector turnLeft(Vector v) {
        return new Vector(v.x,v.y,new West());
    }

    @Override
    public Vector turnRight(Vector v) {
        return new Vector(v.x,v.y,new East());
    }
}

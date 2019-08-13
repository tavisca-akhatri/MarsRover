public class West implements Direction
{

    @Override
    public Vector move(Vector v) {
        return new Vector(v.x-1,v.y , new West());
    }

    @Override
    public Vector turnLeft(Vector v) {
        return new Vector(v.x,v.y,new South());
    }

    @Override
    public Vector turnRight(Vector v) {
        return new Vector(v.x,v.y,new North());
    }
}

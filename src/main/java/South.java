public class South implements Direction
{

    @Override
    public Vector move(Vector v) {
        return new Vector(v.x,v.y-1 , new South());
    }

    @Override
    public Vector turnLeft(Vector v) {
        return new Vector(v.x,v.y,new East());
    }

    @Override
    public Vector turnRight(Vector v) {
        return new Vector(v.x,v.y,new West());
    }
}

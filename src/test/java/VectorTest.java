
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VectorTest
{
    @Test
   public void vectorInitializeWithGivenDetails()
    {
        //Direction direction = new North();
        Vector r = new Vector(10,10,new North());
        assertEquals(10,r.x);
        assertEquals(10,r.y);
        assert(r.direction instanceof North );
    }

    @Test
   public void vectorcanrotateleftfromnorth()
    {
        Vector r = new Vector(10,10,new North());
        Rover rover = new Rover(r);
        Vector newvector=rover.turnLeft();
        assert(newvector.direction instanceof West);

    }

    @Test
   public void vectorcanrotateleftfromwest()
    {
        Vector r = new Vector(10,10,new West());
        Rover rover = new Rover(r);
        Vector newvector=rover.turnLeft();
        assert(newvector.direction instanceof South);

    }

    @Test
    public void vectorcanrotateleftfromsouth()
    {
        Vector r = new Vector(10,10,new South());
        Rover rover = new Rover(r);
        Vector newvector=rover.turnLeft();
        assert(newvector.direction instanceof East);

    }

    @Test
    public void vectorcanrotateleftfromeast()
    {
        Vector r = new Vector(10,10,new East());
        Rover rover = new Rover(r);
        Vector newvector=rover.turnLeft();
        assert(newvector.direction instanceof North);

    }

    @Test
    public void vectorcanrotaterightfromnorth()
    {
        Vector r = new Vector(10,10,new North());
        Rover rover = new Rover(r);
        Vector newvector = rover.turnRight();
        assert(newvector.direction instanceof  East);
    }
    @Test
    public void vectorcanrotaterightfromwest()
    {
        Vector r = new Vector(10,10,new West());
        Rover rover = new Rover(r);
        Vector newvector = rover.turnRight();
        assert(newvector.direction instanceof North);
    }

    @Test
    public void vectorcanrotaterightfromsouth()
    {
        Vector r = new Vector(10,10,new South());
        Rover rover = new Rover(r);
        Vector newvector = rover.turnRight();
        assert(newvector.direction instanceof West);
    }

    @Test
    public void vectorcanrotaterightfromeast()
    {
        Vector v = new Vector(10,10,new East());
        Rover rover = new Rover(v);
        Vector newvector = rover.turnRight();
        assert(newvector.direction instanceof South);
    }

    @Test
    public void roverCanMoveForwardFromEast()
    {
        Vector v = new Vector(10,10,new East());
        Rover rover = new Rover(v);
        Vector newvector = rover.move();
        assertEquals(11, newvector.x);
        assertEquals(10, newvector.y);
        assert(newvector.direction instanceof East);
        //assertEquals(11,newvector.y);
    }
    @Test
    public void roverCanMoveForwardFromWest()
    {
        Vector r = new Vector(10,10,new West());
        Rover rover = new Rover(r);
        Vector newvector = rover.move();
        assertEquals(9, newvector.x);
        assertEquals(10,newvector.y);
        assert(newvector.direction instanceof West);
        //assertEquals(11,newvector.y);
    }

    @Test
    public void roverCanMoveForwardFromSouth()
    {
        Vector r = new Vector(10,10,new South());
        Rover rover = new Rover(r);
        Vector newvector = rover.move();
        assertEquals(10, newvector.x);
        assertEquals(9,newvector.y);
        assert(newvector.direction instanceof South);
        //assertEquals(11,newvector.y);
    }

    @Test
    public void roverCanMoveForwardFromNorth()
    {
        Vector r = new Vector(10,10,new North());
        Rover rover = new Rover(r);
        Vector newvector = rover.move();
        assertEquals(10, newvector.x);
        assertEquals(11,newvector.y);
        //assertEquals(11,newvector.y);
    }

    @Test
    public void roverCanMoveMultipleTimesFromNorth()
    {
        Vector r = new Vector(10,10,new North());
        Rover rover = new Rover(r);
        Vector newvector = null;
        for(int i = 0 ; i < 5 ; i++)
        {
            newvector = rover.move();
        }
        assertEquals(10, newvector.x);
        assertEquals(15,newvector.y);
    }

    @Test
    public void roverCanMoveMultipleTimesFromSouth()
    {
        Vector r = new Vector(10,10,new South());
        Rover rover = new Rover(r);
        Vector newvector = null;
        for(int i = 0 ; i < 5 ; i++)
        {
            newvector = rover.move();
        }
        assertEquals(10, newvector.x);
        assertEquals(5,newvector.y);
    }

    @Test
    public void roverCanMoveMultipleTimesFromEast()
    {
        Vector r = new Vector(10,10,new East());
        Rover rover = new Rover(r);
        Vector newvector = null;
        for(int i = 0 ; i < 5 ; i++)
        {
            newvector = rover.move();
        }
        assertEquals(15, newvector.x);
        assertEquals(10,newvector.y);
    }

    @Test
    public void roverCanMoveMultipleTimesFromWest()
    {
        Vector r = new Vector(10,10,new West());
        Rover rover = new Rover(r);
        Vector newvector = null;
        for(int i = 0 ; i < 5 ; i++)
        {
            newvector = rover.move();
        }
        assertEquals(5, newvector.x);
        assertEquals(10,newvector.y);
    }

    @Test
   public void roverCanMoveAndRotateLeft()
    {
        Vector r = new Vector(10,10,new East());
        Rover rover = new Rover(r);
        //rover.turnLeft();
        Vector newvector  = rover.move();
        newvector =  rover.turnLeft();
        assertEquals(11,newvector.x);
        assertEquals(10, newvector.y);
        assert(newvector.direction instanceof North);
       // assertEquals('S',newvector.direction);
    }
}

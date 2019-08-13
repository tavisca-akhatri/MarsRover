import java.util.HashMap;

public class Rover
{
    private Vector v;

    public Rover(Vector v)
    {
        this.v = v;
    }

    private static HashMap<Character,Character> leftMap = new HashMap<Character, Character>(){
        {
            put('N','W');
            put('S','E');
            put('W','S');
            put('E','N');
        }
    };

    private static HashMap<Character,Character> rightMap = new HashMap<Character, Character>(){
        {
            put('N','E');
            put('S','W');
            put('W','N');
            put('E','S');
        }
    };

    private static HashMap<Character,Character[]> lrMap = new HashMap<Character, Character[]>(){
        {
            put('N',new Character[]{'W','E'});
            put('S',new Character[]{'E','W'});
            put('W',new Character[]{'S','N'});
            put('E',new Character[]{'N','S'});
        }
    };


    public Vector turnLeft()
    {
     /*   char newdirection='\0';
        if(direction == 'N' )
            newdirection='W';
        else if(direction == 'S')
            newdirection='E';
        else if(direction == 'W')
            newdirection='S';
        else if(direction == 'E')
            newdirection='N';*/

        //return new Vector(this.v.x,this.v.y,leftMap.get(this.v.direction));
        this.v = this.v.direction.turnLeft(this.v);
        return this.v;
    }

    public Vector turnRight()
    {
        this.v = this.v.direction.turnRight(this.v);
        return this.v;
    }

    public Vector move()
    {
//        if(this.v.direction == 'W')
//        {
//            return new Vector(this.v.x-=1, this.v.y, this.v.direction);
//        }
//        else if(this.v.direction == 'E')
//        {
//
//            return new Vector(this.v.x+=1,this.v.y,this.v.direction);
//        }
//        else if(this.v.direction == 'S')
//        {
//            return new Vector(this.v.x,this.v.y-=1,this.v.direction);
//        }
//        else if(this.v.direction == 'N')
//        {
//            return new Vector(this.v.x,this.v.y+=1,this.v.direction);
//        }
//        return null;
        Direction d = this.v.direction;
        this.v = d.move(this.v);
        return this.v;
    }


}

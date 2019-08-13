public class MarsRover
{
    public static class Coordinates
    {
        public int x;
        public int y;
        public char dir;

        public Coordinates(int x , int y , char dir)
        {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

    }

    public static void main(String args[])
    {
        Coordinates coordinates = new Coordinates(3,3,'E');
        String commands = "MMRMMRMRRM";

        System.out.println("newPosition..." + coordinates.x + " " + coordinates.y + " " + coordinates.dir);
        for (char command : commands.toCharArray()) {
            rove(command,coordinates);
        }

       // System.out.println("currentPosition..." + currentPosition);
        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + coordinates.x + " " + coordinates.y + " " + coordinates.dir);

    }
    public static void rove(char command, Coordinates coordinates)
    {
        if(coordinates.dir == 'E')
        {
            switch (command) {
                case 'L':
                    coordinates.dir = 'W';
                    break;
                case 'R':
                   coordinates.dir = 'E';
                    break;
                case 'M':
                    coordinates.y++;
                    break;
            }

        }
        else if(coordinates.dir == 'N')
        {
            switch (command) {
                case 'L':
                    coordinates.dir = 'N';
                    break;
                case 'R':
                    coordinates.dir = 'S';
                    break;
                case 'M':
                    coordinates.x++;
                    break;
            }

        }
        else if(coordinates.dir == 'S')
        {
            switch (command) {
                case 'L':
                    coordinates.dir = 'E';
                    break;
                case 'R':
                    coordinates.dir = 'W';
                    break;
                case 'M':
                    coordinates.y--;
                    break;
            }

        }
        else if(coordinates.dir == 'W')
        {
            switch (command) {
            case 'L':
                coordinates.dir = 'S';
                break;
            case 'R':
                coordinates.dir = 'N';
                break;
            case 'M':
                coordinates.x--;
                break;
            }

        }

    }
}

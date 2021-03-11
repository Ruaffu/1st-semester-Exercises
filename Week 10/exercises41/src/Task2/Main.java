package Task2;

public class Main
{
    public static void main(String[] args)
    {
        Room room1 = new Room(4, 2, 5, 3);
        Room room2 = new Room(4, 1, 3, 1);
        Room room3 = new Room(6, 3, 1, 2);

        Room[] rooms = {room1, room2, room3};

        Building building1 = new Building(rooms, 2, 5, false);

        int numberOfLamps = 0;
        for (int i = 0; i < building1.rooms.size(); i++)
        {
            numberOfLamps += building1.rooms.get(i).getNumberOfLamps();
        }
        System.out.println(numberOfLamps);

        if (building1.numberOfFloors > building1.rooms.size())
        {
            System.out.println("This is an odd building");
        }
    }
}


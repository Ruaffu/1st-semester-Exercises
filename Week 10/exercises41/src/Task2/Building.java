package Task2;

import java.util.ArrayList;

public class Building
{
    final ArrayList<Room> rooms = new ArrayList<>();
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;

    public Building(Room[] rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding)
    {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;

        for (int i = 0; i < rooms.length; i++)
        {
            this.rooms.add(rooms[i]);
        }
    }

    public ArrayList<Room> getRooms()
    {
        return rooms;
    }

    public int getNumberOfBathrooms()
    {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors()
    {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding()
    {
        return isOfficeBuilding;
    }
}

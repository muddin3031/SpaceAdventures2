package Board;
import Rooms.Room;


public class Board {
    public Room[][] space;


    public Board(Room[][] space) {
        this.space = space;
    }

    public Board(int height, int width) {
        this.space = new Room[height][width];
    }

    public void addRoom(Room room, int row, int col) {
        space[row][col] = room;
    }

    public void printBoard()
    {
        for (Room[] i : space) {
            for (Room j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


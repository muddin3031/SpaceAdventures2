package Board;
import Rooms.Room;


public class Board {
    Room[][] space;
    String[][] planets;

    public Board(Room[][] space, String[][] planets){
        this.space = space;
        this.planets = planets;
    }

    public Board(int height, int width){
        space = new Room[height][width];
        planets = new String[height][width];
    }

    public void addRoom(Room room, int row, int col){
        space[row][col] = room;
    }


    public void printBoard(){
        for(Room[] i : space){
            for (Room j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

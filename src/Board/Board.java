package Board;
import Rooms.Room;


public class Board {
    Room[][] space;


    public Board(Room[][] space){
        this.space = space;
    }

    public Board(int height, int width){
        space = new Room[height][width];
    }

    public void addRoom(Room room, int row, int col){
        space[row][col] = room;
    }


    public void printBoard(){

        for(Room[] i : space){
            for (Room j : i){
                if(space== null){
            }
            System.out.println();
        }
    }
}

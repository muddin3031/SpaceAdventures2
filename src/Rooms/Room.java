package Rooms;
import Rocket.Ship;

public class Room {
    Ship apollo13;
    int xPos, yPos;

    public Room(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void enterRoom(Ship x){
        System.out.println("You are in the middle of the galaxy!!!");/// I want this to choose randomly from an array im ging to make in the
        apollo13 = x;
        x.setxPos(this.xPos);
        x.setyPos(this.yPos);
    }

    public void leaveRoom(Ship x){
        apollo13 = null;
    }



}

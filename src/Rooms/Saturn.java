package Rooms;
import Rocket.Ship;

public class Saturn extends Room {
    public Saturn( int x, int y){
        super(x,y);
    }

    public void enterRoom(Ship x){
        System.out.println("The beauty of saturn awes you as you pass it.");
        apollo13 = x;
        x.setxPos(this.xPos);
        x.setyPos(this.yPos);
    }

    public void leaveRoom(Ship x){
        apollo13 = null;
    }
}
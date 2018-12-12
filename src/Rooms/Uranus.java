package Rooms;
import Rocket.Ship;

public class Uranus extends Room {
    public Uranus( int x, int y){
        super(x,y);
    }

    public void enterRoom(Ship x){
        System.out.println("Ha Ha Ha it's Uranus");
        apollo13 = x;
        x.setxPos(this.xPos);
        x.setyPos(this.yPos);
    }

    public void leaveRoom(Ship x){
        apollo13 = null;
    }
}
package Rooms;
import Rocket.Ship;

public class Venus extends Room {
    public Venus( int x, int y){
        super(x,y);
    }

    public void enterRoom(Ship x){
        System.out.println("Your ship is being drawn in by the flames of venus... GET OUT!!!");
        apollo13 = x;
        x.setxPos(this.xPos);
        x.setyPos(this.yPos);
    }

    public void leaveRoom(Ship x){
        apollo13 = null;
    }
}

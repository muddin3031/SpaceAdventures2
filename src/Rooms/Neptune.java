package Rooms;
import Rocket.Ship;

public class Neptune extends Room {
    public Neptune( int x, int y){
        super(x,y);
    }

    public void enterRoom(Ship x){
        System.out.println("Why so blue?");
        apollo13 = x;
        x.setxPos(this.xPos);
        x.setyPos(this.yPos);
    }

    public void leaveRoom(Ship x){
        apollo13 = null;
    }
}

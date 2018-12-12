package Rooms;
import Rocket.Ship;

public class Jupiter extends Room {
    public Jupiter( int x, int y){
        super(x,y);
    }

    public void enterRoom(Ship x){
        System.out.println("You are being pulled in by the gravitational Force of Jupiter");
        apollo13 = x;
        x.setxPos(this.xPos);
        x.setyPos(this.yPos);
    }

    public void leaveRoom(Ship x){

        apollo13 = null;
        private static
    }
}

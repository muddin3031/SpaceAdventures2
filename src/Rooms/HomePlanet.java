package Rooms;
import Rocket.Ship;
import Game.Runner;

public class HomePlanet extends Room {
    public HomePlanet(int x, int y){
        super(x,y);
    }

    public void enterRoom(Ship x){
        System.out.println("You have entered your air space and have landed safely on your Home planet!!! CONGRAJULATIONS !!");
        apollo13 = x;
        x.setxPos(this.xPos);
        x.setyPos(this.yPos);
        Runner.gameOff();
    }

}

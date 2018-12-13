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



    public static void PlanetSwitch(Room[][] space, Ship ship1) {
        int r = ship1.getxPos();
        int c = ship1.getyPos();
        int x = (int)(Math.random()*space.length);
        int y = (int)(Math.random()*space.length);
        space[x][y] = new HomePlanet(x,y);
        space[x][y] = new Jupiter(x,y);
        space[x][y] = new Saturn(x,y);
        space[x][y] = new Neptune(x,y);
        space[x][y] = new Uranus(x,y);
        space[x][y] = new Venus(x,y);

        if (ship1.getyPos() == 0){
            space[r][c] = new Jupiter(r, c);
        }
        else if (ship1.getyPos() == 1) {
            space[r][c] = new Venus(r, c);
        }
        else if (ship1.getyPos() == 2) {
            space[r][c] = new Saturn(r, c);
        }
        else if (ship1.getyPos() == 3) {
            space[r][c] = new Neptune(r, c);
        }
        else {
            space[r][c] = new Uranus(r, c);
        }

    }
}

package Game;
import Rocket.Ship;
import Rooms.Room;
import Rooms.HomePlanet;
import Rooms.Jupiter;
import Rooms.Saturn;
import Rooms.Neptune;
import Rooms.Uranus;
import Rooms.Venus;

import java.util.Scanner;

public class Runner {

    private static boolean gameOn = true;

    public static void main(String[] args)
    {
	// write your code here

        Room[][] space = new Room[5][5];

        for (int x = 0; x < space.length; x++){
            for(int y = 0; y <space[x].length; y++){
                space[x][y] = new Room(x,y);
            }
        }

        int x = (int)(Math.random()*space.length);
        int y = (int)(Math.random()*space.length);
        space[x][y] = new HomePlanet(x,y);


        Ship ship1 = new Ship("RocketName", 0,0);
        space[0][0].enterRoom((ship1));
        Scanner in = new Scanner(System.in);

        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            int r = ship1.getxPos();
            int c = ship1.getyPos();
            String move = in.nextLine();
            if(validMove(move, ship1, space))
            {
                if(ship1.getxPos() == 0 && ship1.getyPos() > 0) {
                    space[r][c] = new Jupiter(r,c);
                }
                else if (ship1.getxPos() == 1) {
                    space[r][c] = new Venus(r,c);
                }
                else if (ship1.getxPos() == 2) {
                    space[r][c] = new Saturn(r,c);
                }
                else if(ship1.getxPos() == 3) {
                    space[r][c] = new Neptune(r,c);
                }
                else {
                    space[r][c] = new Uranus(r,c);
                }

                System.out.println("Your coordinates: row = " + ship1.getxPos() + " col = " + ship1.getyPos());

            }
            else {
                System.out.println("Please choose a valid move.");
            }

        }
        in.close();
    }

    /**
     * Checks that the movement chosen is within the valid game map.
     * @param move the move chosen
     * @param p person moving
     * @param map the 2D array of rooms
     * @return
     */
    public static boolean validMove(String move, Ship p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxPos() > 0)
                {
                    map[p.getxPos()][p.getyPos()].leaveRoom(p);
                    map[p.getxPos()-1][p.getyPos()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyPos()< map[p.getyPos()].length -1)
                {
                    map[p.getxPos()][p.getyPos()].leaveRoom(p);
                    map[p.getxPos()][p.getyPos() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxPos() < map.length - 1)
                {
                    map[p.getxPos()][p.getyPos()].leaveRoom(p);
                    map[p.getxPos()+1][p.getyPos()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyPos() > 0)
                {
                    map[p.getxPos()][p.getyPos()].leaveRoom(p);
                    map[p.getxPos()][p.getyPos()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }

}

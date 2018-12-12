package Game;
import Rocket.Ship;
import Rooms.Room;
import Rooms.HomePlanet;
import Rooms.Jupiter;
import Rooms.Saturn;
import Rooms.Neptune;
import Rooms.Uranus;
import Rooms.Venus;
import Board.Board;

import java.util.Scanner;

public class Runner {

    private static boolean gameOn = true;
    private static Board board1 = new Board[5][5];

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
	space[x][y] = new Jupiter(x,y);
	space[x][y] = new Saturn(x,y);
	space[x][y] = new Neptune(x,y);
	space[x][y] = new Uranus(x,y);
	space[x][y] = new Venus(x,y);

        Ship ship1 = new Ship("RocketName", 0,0);
        space[0][0].enterRoom((ship1));
        Scanner in = new Scanner(System.in);

        while(gameOn)
        {
            Room.PlanetSwitch(space, ship1);
	    board1.printBoard();
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, ship1, space))
            {

                System.out.println("Your coordinates: row = " + ship1.getxPos() + " col = " + ship1.getyPos());

            }
            else {
                System.out.println("Please choose a valid move.");
            }

        }
        in.close();
    }


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

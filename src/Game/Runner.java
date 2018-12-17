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
import Rooms.Burger;
import java.util.Scanner;

public class Runner {

    private static boolean gameOn = true;
    public static void main(String[] args)
    {
	// write your code here

//        Room[][] board.space = new Room[5][5];
//
//        for (int x = 0; x < board.space.length; x++){
//            for(int y = 0; y <board.space[x].length; y++){
//                board.space[x][y] = new Room(x,y);
//            }
//        }

        Board board = new Board(5,5);
        int r = (int)(Math.random()* board.space.length);
        int c = (int)(Math.random()* board.space.length);
        Burger burger1= new Burger("cheeseburger",2);
        Burger burger2= new Burger("hamburger",4);
        Burger burger3= new Burger("Big Mac",1);
        for (int x = 0; x < board.space.length; x++) {
            for (int y = 0; y < board.space[x].length; y++) {
                board.space[x][y] = new Room(x, y);
            }
        }
        board.addRoom(new HomePlanet(r,c),r ,c);
        board.addRoom(new Jupiter(r,c),r ,c);
        board.addRoom(new Venus(r,c),r ,c);
        board.addRoom(new Neptune(r,c),r ,c);
        board.addRoom(new Saturn(r,c),r ,c);
        board.addRoom(new Uranus(r,c),r ,c);



        Ship ship1 = new Ship("RocketName", 0,0);
        board.space[0][0].enterRoom((ship1));
        Scanner in = new Scanner(System.in);

        while(gameOn)
        {
            Room.PlanetSwitch(board.space, ship1);
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            board.printBoard();
            String move = in.nextLine();
            if(validMove(move, ship1, board.space))
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

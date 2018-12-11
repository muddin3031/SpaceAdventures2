package Rocket;

public class Ship {
    String RocketName;
    int xPos, yPos;

    public Ship(String RocketName, int xPos, int yPos){
        this.RocketName = RocketName;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos(){
        return xPos;
    }

    public int getyPos(){
        return yPos;
    }

    public void setxPos(int xPos){
        this.xPos = xPos;
    }

    public void setyPos(int yPos){
        this.yPos = yPos;
    }



}

package Rooms;
import Rooms.item;

public class Burger implements item {
    private String name;
    private int num;

    public Burger (String name, int num)
    {

        this.name=name;
        this.num=num;
    }

   public int getNum(){
        return num;
   }
    @Override
    public String getName() {
        return name;
    }
}

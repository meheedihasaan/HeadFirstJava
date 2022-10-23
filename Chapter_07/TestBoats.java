/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07;

/**
 *
 * @author User
 */

//Super Class
class Boat{
    private int length;
    
    public void setLength(int len){
        this.length = len;
    }
    
    public int getLength(){
        return length;
    }
    
    public void move(){
        System.out.print("drift ");
    }
}

//Sub Class-1
class RowBoat extends Boat{
    public void rowTheBoat(){
        System.out.print(" stroke natasha");
    }
}

//Sub Class-2
class SailBoat extends Boat{
    @Override
    public void move(){
        System.out.print(" hoist sail");
    }
}

//Driver Class
public class TestBoats {
    
    public static void main(String[] args) {
        Boat b1 = new Boat();
        SailBoat b2 = new SailBoat();
        RowBoat b3 = new RowBoat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
        System.out.println();
    }
    
}

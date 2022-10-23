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
class Bycycle{
    public int gear;
    public int speed;
    
    public Bycycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    
    public void applyBread(int decrement){
        speed-=decrement;
    }
    
    public void speedUp(int increment){
        speed+=increment;
    }
    
    public String showDetails(){
        return "Gear: "+gear+", Speed: "+speed;
    }
}

//Sub Class
class MountainBike extends Bycycle{
    public int seatHeight;
    public MountainBike(int gear, int speed, int seatHeight) {
        //Applying argument to the super class constructor
        super(gear, speed);
        this.seatHeight = seatHeight;                
    }
    
    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }
    
    @Override
    public String showDetails(){
        return super.showDetails()+", Seat Height: "+seatHeight+".";
    }    
}

//Driver Class
public class Inheritance {
    
    public static void main(String[] args) {
        MountainBike bike = new MountainBike(5, 25, 3);
        System.out.println(bike.showDetails());
    }
    
}

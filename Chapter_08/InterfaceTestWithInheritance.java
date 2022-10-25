/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_08;

/**
 *
 * @author User
 */

//Interface
interface PhysicalExercise{
    //Abstract Method
    public void advantage();
}

//Abstract Super Class
abstract class Game{
    public int ranking;
    public boolean isPopular;
    
    public Game(int ranking, boolean isPopular){
        this.ranking = ranking;
        this.isPopular = isPopular;
    }
    
    //Abstract Method
    public void details(){
        System.out.println("Ranking: "+ranking+", Is Populer ? - "+isPopular);
    }
}

//Sub Class which extends Super Class and implements Interface at a time
class Outdoor extends Game implements PhysicalExercise{
    public String name;
    
    public Outdoor(int ranking, boolean isPopular, String name){
        super(ranking, isPopular);
        this.name = name;
    }
    
    //Override From Interface
    @Override
    public void advantage(){
        System.out.println("By playing this game our heart rate will be increased.");
    }
    
    //Override From Abstract Super class
    @Override
    public void details(){
        //Adding Extra Feature in Super's details method
        System.out.println("This is "+this.name+" Game.");
        //Super's details
        super.details();        
    }
}

public class InterfaceTestWithInheritance {
    
    public static void main(String[] args) {
        Outdoor kabadi = new Outdoor(6, true, "Kabadi");
        kabadi.details();
        kabadi.advantage();
        System.out.println();
    }
    
}

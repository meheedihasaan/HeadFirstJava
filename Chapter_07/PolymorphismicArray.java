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
class Monster{
    public boolean frighten(int degree){
        System.out.println("arrrgh");
        return true;
    }
}

//Sub Class-1
class Vampire extends Monster{
    @Override
    public boolean frighten(int degree){
        System.out.println("a bite?");
        return true;
    }
}

//Sub Class-2
class Dragon extends Monster{
    @Override
    public boolean frighten(int degree){
        System.out.println("breathe fire");
        return true;
    }
}

//Driver Class
public class PolymorphismicArray {
    
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);
        }
    }
    
}

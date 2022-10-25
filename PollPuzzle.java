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
interface Nose {
    //Abstract Method
    public int iMethod();
}

//Abstract Super Class
abstract class Picasso implements Nose{
    @Override
    public int iMethod(){
        return 7;
    }
}

//Sub Class 1
class Clowns extends Picasso{
    
}

//Sub Class 2
class Acts extends Picasso{
    @Override
    public int iMethod(){
        return 5;
    } 
}

public class PollPuzzle extends Clowns {
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new PollPuzzle();
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod()+" "+i[x].getClass());
        }
    }
}

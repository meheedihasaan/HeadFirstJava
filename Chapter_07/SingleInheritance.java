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
class Person{
    public void printPerson(){
        System.out.println("Class Person");
    }
}

//Sub Class
class Student extends Person{
    public void printStudent(){
        System.out.println("Class Student");
    }
}

//Driver Class
public class SingleInheritance {
    
    public static void main(String[] args) {
        Person p = new Person();
        p.printPerson();
        
        Student s = new Student();
        s.printStudent();
    }
    
}

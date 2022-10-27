/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09;

/**
 *
 * @author User
 */

abstract class Person{
    public String name;
    public int weight;
    
    //Argumented Constructor
    public Person(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    //Abstract Method
    abstract public String details();
}

//Sub Class
class Employee extends Person{
    public int employeeId;
    
    //Constructor
    public Employee(String name, int weight, int employeeId){
        //Passing parameter to super class constructor
        super(name, weight);
        this.employeeId = employeeId;
    }
    
    //Overriding Abstract Method
    @Override
    public String details(){
        return "Employee Name: "+super.name+", Weight: "+super.weight+", Employee Id: "+employeeId+".";
    }
}

//Driver Class
public class SuperExample {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Md Mehedi Hasan", 52, 111941232);
        System.out.println(e1.details());
    }
    
}

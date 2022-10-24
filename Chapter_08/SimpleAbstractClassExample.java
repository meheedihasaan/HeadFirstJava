/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_08;

/**
 *
 * @author User
 */

//Super Class-1
abstract class People{
    public String name;
    public String address;
    
    public People(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    //Abstract Method
    abstract public String details();
    
}

//Sub Class-1
class Teacher extends People{
    public String subject;
    
    public Teacher(String name, String address, String subject){
        super(name, address);
        this.subject = subject;
    }
    
    //Override Abstract Method
    @Override
    public String details(){
        return "Teacher Name: "+super.name+", Address: "+super.address+", Subject: "+subject+".";
    }
}

//Sub Class2-2
class Student extends People{
    public int studentId;
    
    public Student(String name, String address, int studentId){
        super(name, address);
        this.studentId = studentId;
    }
    
    //Override Abstract Method
    @Override
    public String details(){
        return "Student Name: "+super.name+", Address: "+super.address+", Student Id: "+studentId+".";
    }    
}

public class SimpleAbstractClassExample {
    public static void main(String[] args) {
        Teacher t = new Teacher("Md Tahmid Sadik", "Rajshahi", "Digital Electronics");
        System.out.println(t.details());
        
        Student s = new Student("Md Mehedi Hasan", "Rangpur", 111941);
        System.out.println(s.details());
    }
}

package FileHandling;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int roll;
    private String name;
    private double marks;
    
    public Student(int roll, String name, double marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    
    public int getRoll(){
        return roll;
    }
    
    public String getName(){
        return name;
    }
    
    public double getMarks(){
        return marks;
    }
}
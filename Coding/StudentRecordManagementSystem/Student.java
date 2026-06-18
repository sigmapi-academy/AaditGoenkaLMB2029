
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNum;
    private String name;
    private double marks;
    
    public Student(int rollNum, String name, double marks){
        this.rollNum = rollNum;
        this.name = name;
        this.marks = marks;
    }
    
    public int getRollNum(){
        return rollNum;
    }
    
    public String getName(){
        return name;
    }
    
    public double getMarks(){
        return marks;
    }
    
    public void setMarks(double marks){
        this.marks = marks;
    }
    
    @Override
    public String toString(){
        return rollNum + ", " + name + ", " + marks;
    }
}
package FileHandling.BinaryFileHandling;
import java.io.*;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int roll;
    private String name;
    private double marks;

    public Student(int roll, String name, double marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "\nRoll: " + roll + "\nName: " + name + 
        "\nMarks: "+marks+"\n";
    }
}
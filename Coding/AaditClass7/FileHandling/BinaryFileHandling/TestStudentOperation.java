package FileHandling.BinaryFileHandling;
import java.util.*;


/**
 * Write a description of class TestStudentOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestStudentOperation
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fileName;
        StudentOperation so = new StudentOperation();
        System.out.print("\fEnter the file name: ");
        fileName = sc.nextLine();
        System.out.print("Enter roll number: ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String nm = sc.nextLine();
        System.out.print("Enter marks: ");
        double m = sc.nextDouble();
        so.writeObject(fileName, new Student(r, nm, m));
        so.readObject(fileName);
        
    }
}
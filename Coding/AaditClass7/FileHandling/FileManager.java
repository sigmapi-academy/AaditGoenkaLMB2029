package FileHandling;
import java.util.*;
import java.io.*;

/**
 * Write a description of class FileManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileManager
{
    private static Scanner sc = new Scanner(System.in);
    public static void saveStudent(Student stu[]){
        String fileName, path = "./DataFiles/";
        System.out.print("\nEnter file name with .txt extension: ");
        fileName = sc.nextLine();
        try(FileWriter fw = new FileWriter(path+fileName, true);
            BufferedWriter bw = new BufferedWriter(fw)    
            ){
            int i;
            for(i = 0; i < stu.length; i++){
                bw.write("Roll no:"+Integer.toString(stu[i].getRoll()));
                bw.newLine();
                bw.write("Name: "+stu[i].getName());
                bw.newLine();
                bw.write("Marks: "+Double.toString(stu[i].getMarks()));
                bw.newLine();
            }
            System.out.print("\n" + stu.length + " records saved in the file.");
            
        }catch(IOException io){
            System.out.print("\nFile is not created");
        }

    }

    public static void main(String[] args){
        int howMany;
        System.out.print("\fEnter number of Students: ");
        howMany = sc.nextInt();
        Student st[] = new Student[howMany];
        int i;

        for(i = 0; i < howMany; i++){
            System.out.print("Enter Roll Number: ");
            int rn = sc.nextInt();
            sc.nextLine(); //clearning keyboard buffer.
            System.out.print("Enter name: ");
            String nm = sc.nextLine();
            System.out.print("Enter marks: ");
            double m = sc.nextDouble();    
            sc.nextLine();//clearning keyboard buffer.
            st[i] = new Student(rn, nm, m); //creating objects
        }
        saveStudent(st);
    }
}
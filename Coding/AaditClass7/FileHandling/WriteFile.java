package FileHandling;
import java.io.*;
import java.util.*;

/**
 * Write a description of class WriteFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteFile
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fileName, path = "./DataFiles/";
        System.out.print("\fEnter file name with .txt extension: ");
        fileName = sc.nextLine();
        try{
            FileWriter fw = new FileWriter(path+fileName, true);
            System.out.print("\nEnter Roll number: ");
            int rollNum = sc.nextInt();
            sc.nextLine(); //clears the keyboard buffer
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            float marks = sc.nextFloat();
            fw.write("Roll no: " + rollNum+"\n");
            fw.write("Name: " + name + "\n");
            fw.write("Marks: " + marks + "\n");
            
            fw.close();
            System.out.print("\nData Written");
        }catch(IOException ioe){
            System.err.print("\nFile is not created");
        }
        
    }
}
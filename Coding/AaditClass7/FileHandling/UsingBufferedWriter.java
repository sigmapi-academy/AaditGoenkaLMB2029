package FileHandling;
import java.util.*;
import java.io.*;


/**
 * Write a description of class UsingBufferedWriter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsingBufferedWriter
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fileName, path = "./DataFiles/";
        System.out.print("\fEnter file name with .txt extension: ");
        fileName = sc.nextLine();
        try{
            FileWriter fw = new FileWriter(path+fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.print("\nEnter Roll number: ");
            int rollNum = sc.nextInt();
            sc.nextLine(); //clears the keyboard buffer
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            float marks = sc.nextFloat();
            bw.write("Roll no: " + rollNum);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Marks: " + marks);
            bw.newLine();
    
            bw.close();
            System.out.print("\nData Written");
        }catch(IOException ioe){
            System.err.print("\nFile is not created");
        }
        
    }
}
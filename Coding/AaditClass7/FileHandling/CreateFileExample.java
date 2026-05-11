package FileHandling;
import java.io.*;

/**
 * Write a description of class CreateFileExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateFileExample
{
    public static void main(String[] args){
        System.out.print("\fEnter File Name: ");
        String fileName = new java.util.Scanner(System.in).nextLine();
        String path = "./DataFiles/";
        try{
            File file = new File(path+fileName);
            if(file.createNewFile()){
                System.out.print("\nFile created successfully.");
                System.out.print("\nFile name: " + file.getName());
            }
            else{
                System.out.print("\nFile already exists.");
            }
        }catch(IOException e){
            System.err.print("\nError while creating a file.");
            e.printStackTrace();
        }
    }
}
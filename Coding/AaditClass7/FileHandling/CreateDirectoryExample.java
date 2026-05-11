package FileHandling;
import java.io.*;

/**
 * Write a description of class CreateDirectoryExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateDirectoryExample
{

    public static void main(String[] args){
        System.out.print("\fEnter directory Name: ");
        String directoryName = new java.util.Scanner(System.in).nextLine();
        String path = "./";
        try{
            File file = new File(path+directoryName);
            if(file.mkdirs()){
                System.out.print("\nDirectorycreated successfully.");
                System.out.print("\nFile name: " + file.getAbsolutePath());
            }
            else{
                System.out.print("\nFile already exists.");
            }
        }catch(SecurityException e){
            System.err.print("\nError while creating a file.");
            e.printStackTrace();
        }
    }
}

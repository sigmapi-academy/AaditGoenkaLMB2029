package FileHandling.BinaryFileHandling;
import java.util.*;
import java.io.*;


/**
 * Write a description of class WriteBinary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteBinary
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter file name: ");
        String path = "./BinaryFiles/";
        String fileName = sc.nextLine();
        try(FileOutputStream fos = new 
        FileOutputStream(path+fileName+".dat", true)){
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(68);
            
            fos.close();
            System.out.print("\nData Written in File Successfully");
        }
        catch(FileNotFoundException fnfe){
            System.err.print("\nFile is not present on the specified directory.");
        }
        catch(IOException ioe){
            System.err.print("\nInput/Output network jam.");
        }
    }
}
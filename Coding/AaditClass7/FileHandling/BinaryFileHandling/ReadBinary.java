package FileHandling.BinaryFileHandling;
import java.util.*;
import java.io.*;


/**
 * Write a description of class ReadBinary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadBinary
{
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter file name: ");
        String path = "./BinaryFiles/";
        String fileName = sc.nextLine();
        int ch;
        try(FileInputStream fis = new FileInputStream(path+fileName)){
            while((ch = fis.read()) != -1){
                System.out.print((char)ch);
            }
        }
        catch(IOException ioe){
            System.out.print("\nNetwork error!");
        }
    }
}
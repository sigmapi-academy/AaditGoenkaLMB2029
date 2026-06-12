package FileHandling;
import java.util.*;
import java.io.*;

/**
 * Write a description of class ReadFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadFile
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String path="./DataFiles/", fileName;
        System.out.print("\fEnter file name as .txt extension: ");
        fileName = sc.nextLine();
        try{
            FileReader fr = new FileReader(path+fileName);
            int ch;
            while((ch = fr.read())!= -1){
                System.out.print((char)ch);
            }
            fr.close();
        }catch(FileNotFoundException fnfe){
            System.err.print("\nFile nahi mila.");
        }
        catch(IOException ioe){
            System.err.print("\nNetwork Error!");
        }
    }
}
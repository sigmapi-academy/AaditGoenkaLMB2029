package FileHandling;
import java.util.*;
import java.io.*;

/**
 * Write a description of class UsingBufferedReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsingBufferedReader
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fileName, path = "./DataFiles/";
        System.out.print("\fEnter file name with .txt extension: ");
        fileName = sc.nextLine();
        try{
            FileReader fr = new FileReader(path+fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!= null){
                System.out.print("\n"+line);
            }
            br.close();
            sc.close();
        }catch(FileNotFoundException fnfe){
            System.err.print("\nFile not found on the specified path!");
        }catch(IOException ioe){
            System.err.print("\nFile is not accessible!");
        }
    }
}
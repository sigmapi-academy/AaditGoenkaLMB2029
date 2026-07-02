package FileHandling.BinaryFileHandling;
import java.io.*;
import java.util.*;

/**
 * Write a description of class ReadPrimitiveData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadPrimitiveData
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter file name: ");
        String path = "./BinaryFiles/";
        String fileName = sc.nextLine();
        String pathAndFile = path + fileName;
        try(FileInputStream fis = new FileInputStream(pathAndFile);
        DataInputStream dis = new DataInputStream(fis)){
            boolean more = false;
            int rn;
            String name;
            float marks;

            try{
                while(true){
                    rn = dis.readInt();
                    name = dis.readUTF();
                    marks = dis.readFloat();
                    System.out.print("\n"+rn+", "+name+", "+marks);
                }
            }
            catch(EOFException eofe){
                System.out.print("\n=================");
                System.out.print("\nEnd of file.");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

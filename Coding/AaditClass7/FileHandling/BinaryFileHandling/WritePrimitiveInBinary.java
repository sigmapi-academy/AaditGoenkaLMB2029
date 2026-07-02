package FileHandling.BinaryFileHandling;
import java.io.*;
import java.util.*;


/**
 * Write a description of class WritePrimitiveInBinary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WritePrimitiveInBinary
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter file name: ");
        String path = "./BinaryFiles/";
        String fileName = sc.nextLine();
        String pathAndFile = path + fileName;
        try(FileOutputStream fos = new FileOutputStream(pathAndFile, true);
        DataOutputStream dos = new DataOutputStream(fos)){
            boolean more = false;
            int rn;
            String name;
            float marks;
            
            do{
                System.out.print("\nEnter Roll Number: ");
                rn = sc.nextInt();
                sc.nextLine(); 
                System.out.print("\nEnter name: ");
                name = sc.nextLine();
                System.out.print("\nEnter marks: ");
                marks = sc.nextFloat();
                System.out.print("\nYou want to enter more records (Y/N): ");
                more = sc.next().toUpperCase().charAt(0) == 'Y'? true: false;
                dos.writeInt(rn);
                dos.writeUTF(name);
                dos.writeFloat(marks);
            }while(more);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
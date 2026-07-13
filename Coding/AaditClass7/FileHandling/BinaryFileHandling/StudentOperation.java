package FileHandling.BinaryFileHandling;
import java.io.*;

/**
 * Write a description of class StudentOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentOperation
{
    private String path = "./BinaryFiles/";
    
    public void writeObject(String fileName, Student obj){
        
        try(ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream(path+fileName))){
            oos.writeObject(obj);
            System.out.print("\nObject saved successfully.");
        }
        catch(IOException ioe){
            System.err.print("\n" + ioe);
        }
    }
    
    public void readObject(String fileName){
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(path+fileName))){
             try
             {
                 Student s = (Student)ois.readObject();
                 System.out.print("\n" + s);
             }
             catch (ClassNotFoundException cnfe)
             {
                 cnfe.printStackTrace();
             }    
             
        }
        catch(FileNotFoundException fnfe){
            System.err.print("\nFile is not found on Specified location.");
        }
        catch(IOException ioe){
            System.err.print("\n" + ioe);
        }
    }
}
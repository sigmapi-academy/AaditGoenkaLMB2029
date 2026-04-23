package ExceptionHandling;
import java.io.*;


/**
 * Write a description of class ThrowingCheckedException1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThrowingCheckedException1
{
    public static void method() throws IOException {
        int x;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\fEnter the value of x: ");
        x = Integer.parseInt(br.readLine());
        throw new IOException("Data entered in String format, converted into an int format");
    }
    
    public static void main(String[] args){
        try
        {
            method();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
package ExceptionHandling;
import java.io.*;


/**
 * Write a description of class UnCheckedExceptionPropagation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnCheckedExceptionPropagation
{
    // Method m throws a checked exception, so it must declare it with throws. 
    public void m() throws IOException{
        // Explicitly throwing a checked exception. 
        throw new IOException("Device error"); 
    }
    
    // Method n(), calls m() so it must also declare the same exception. 
    public void n()throws IOException{
        m(); //   No handling here, so the exception is passed up the chain. 
    }
    
    //  Method P () catches the exception using a try-catch block. 
    public void p(){
        try
        {
            n(); //  Exception propagates here and is caught. 
        }
        catch (IOException ioe)
        {
            System.err.print("\nException handles");
        } 
    }
    
    public static void main(String[] args){
        UnCheckedExceptionPropagation ob = new UnCheckedExceptionPropagation();
        System.out.print("\f");
        ob.p(); //  Triggers the method chain. 
        // Will be printed only if an exception is properly handled. 
        System.out.print("\nNormal flow...");
    }
}
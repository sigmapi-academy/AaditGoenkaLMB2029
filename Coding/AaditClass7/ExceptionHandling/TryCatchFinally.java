package ExceptionHandling;


/**
 * Write a description of class TryCatchFinally here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TryCatchFinally
{
    public static void main(String[] args){
        System.out.print("\f");
        try{
            int data = 25/0; //May throw ArithmeticException
            System.out.print("\ndata = " + data);
        }
        catch(ArithmeticException e){
            System.err.print("\nError: Division by zero not allowed.");
        }
        finally{
            System.out.print("\nI am the finally block, and I always executes");
        }
        System.out.print("\nProgram continues after finally block...");
    }
}
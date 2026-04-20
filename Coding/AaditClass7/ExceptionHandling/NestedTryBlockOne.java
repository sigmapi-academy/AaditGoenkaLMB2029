package ExceptionHandling;
import java.util.InputMismatchException;


/**
 * Write a description of class NestedTryBlockOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedTryBlockOne
{
    public static void main(String[] args){
        try{
            try{
                try{
                    int arr[] = {1, 2, 3, 4};
                    System.out.print("\n"+arr[10]);
                }
                catch(ArithmeticException e){
                    System.err.print("\nArithmetic exception");
                }
            }
            catch(InputMismatchException e){
                System.err.print("\nInput mismatch exception");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.print("\n Array index out of bounds exception");
        }
        catch(Exception e){
            System.err.print("\nException");
            System.err.print("\nHandled the main try-block");
        }
    }
}
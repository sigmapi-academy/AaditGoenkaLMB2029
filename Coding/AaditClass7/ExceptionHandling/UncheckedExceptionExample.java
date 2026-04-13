package ExceptionHandling;

/**
 * Write a description of class UncheckedExceptionExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UncheckedExceptionExample
{
    public static void main(String[] args){
        String str = null;
        System.out.print("\f");
        try{
            System.out.print("Length of str: "+ + str.length());
        }
        catch(NullPointerException npe){
            System.err.print("\nYou have an empty string.");
        }

        int[] arr = {1,2,3};
        try{
            System.out.print("\n"+arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.err.print("\nInvalid index.");
        }

        try{
            int r = 10/0;
        }
        catch(ArithmeticException ae){
            System.err.print("\nDivision by zero error.");
        }
        System.out.print("\nWe are learning Unchecked exceptions");
    }
}
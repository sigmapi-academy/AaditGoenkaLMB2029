package ExceptionHandling;


/**
 * Write a description of class FinallyBlockone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FinallyBlockOne
{
    public static void main(String[] args){
        System.out.print("\f");
        try{
            int data = 100/7;
            System.out.print("\nQuotient: " + data);
        }catch(ArithmeticException e){
            System.err.print("\nDivide by 0 is not valid in maths");
        }finally{
            System.out.print("\nFinally Block Executed: Clean up code runs here.");
        }
        System.out.print("\nRest if the program continues...");
    }
}
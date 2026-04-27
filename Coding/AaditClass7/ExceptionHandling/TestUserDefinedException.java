package ExceptionHandling;


/**
 * Write a description of class TestUserDefinedException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestUserDefinedException
{
    public static void main(String[] args){
        System.out.print("\f");
        try
        {
            throw new UserDefinedException("This is user defined exception");
        }
        catch (ExceptionHandling.UserDefinedException ude)
        {
            System.err.print("\nCaught the exception");
            System.err.print("\n" + ude.getMessage());
        }
        
    }
}
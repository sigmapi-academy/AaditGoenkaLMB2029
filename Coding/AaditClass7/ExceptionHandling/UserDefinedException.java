package ExceptionHandling;


/**
 * Write a description of class UserDefinedException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserDefinedException extends Exception
{
    public UserDefinedException(String msg){
        super(msg);
    }
}
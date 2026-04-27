package ExceptionHandling;


/**
 * Write a description of class CheckedException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckedException
{
    public static void main(String[] args) throws InterruptedException {
        int i;
        System.out.print("\f");
        for(i = 0; i < 10; i++){
            System.out.print("\nSecond: " + i);
            Thread.sleep(1000);
        }
        System.out.print("\nSecond: " + i);
    }
}
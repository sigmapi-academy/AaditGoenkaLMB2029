package Chapter4.forLoop;
import java.util.*;


/**
 * Write a description of class Q10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q10
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int num, revNum = 0, absDiff, rem, t;
        System.out.print("Enter any integer value: ");
        num = sc.nextInt();
        
        for(t = num; num > 0;rem = num % 10,revNum = revNum*10 + rem, num /= 10);
        
        System.out.print("\nReverse: " + revNum);
        absDiff = Math.abs(t - revNum);
        System.out.print("\nAbsolute Difference = " + absDiff);
    }
}
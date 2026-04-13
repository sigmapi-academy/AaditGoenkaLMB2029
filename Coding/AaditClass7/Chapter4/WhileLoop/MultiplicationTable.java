package Chapter4.WhileLoop;
import java.util.*;

/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    public static void main(String args[]){
        //Print multiplication table of a number up to N times
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        int p, num , start = 1, endPoint;
        System.out.print("\nEnter your number: ");
        num = sc.nextInt();
        System.out.print("\nEnter end point: ");
        endPoint = sc.nextInt();
        while(start <= endPoint){
            p = num * start;
            System.out.print("\n"+num + " * " + start + " = " + p);
            start++;
        }
        System.out.print("\nValue of start after the loop: " + start);
    }
}
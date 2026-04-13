package Inheritance.ProblemsOfISC;
import java.util.*;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of terms: ");
        Series ser = new Series(sc.nextInt());
        ser.calsum();
        ser.display();
    }
}
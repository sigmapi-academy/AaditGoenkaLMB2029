package Chapter3;
import java.util.*;


/**
 * Write a description of class DemoOfIf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoOfIf
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("\fEnter your age: ");
        age = sc.nextInt();
        if(age >= 18){
            System.out.print("\nYou are elligible to learn driving." );
        }
        else{
            System.out.print("\nYou are not elligible to learn driving.");
        }
    }
}
package ExceptionHandling;

import java.util.*;


/**
 * Write a description of class ThrowingExceptionObject1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThrowingExceptionObject1
{
    public static void main(String[] args)  {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter the age: ");
        age = sc.nextInt();
        
        if(age < 18){
            throw new RuntimeException("Not eligible to vote.");
        }
        
        System.out.print("\nEligible to vote");
    }
}
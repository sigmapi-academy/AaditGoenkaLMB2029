package Recursion;


/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
    public static void main(String args[]){
        System.out.print("\fEnter any integer value: ");
        int f = fact(new java.util.Scanner(System.in).nextInt());
        System.out.print("\nFactorial = " + f);
    }
    
    public static int fact(int n){
        if(n == 1 || n == 0){ //base case or exit case
            return 1; 
        }
        else{
            return n * fact(n-1); //recursive call
        }
    }
}
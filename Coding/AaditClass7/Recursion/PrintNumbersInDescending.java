package Recursion;
/**
 * Write a description of class PrintNumbersInDescending here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintNumbersInDescending
{
    public static void printDescending(int n){
        if(n == 1){ //base case or exit case
            System.out.print(n);
            return; 
        }
        System.out.print(n+", ");
        printDescending(n-1);  //recursive call
    }
    
    public static void main(String args[]){
        System.out.print("\fEnter any positive integer: ");
        printDescending(new java.util.Scanner(System.in).nextInt());
    }
}
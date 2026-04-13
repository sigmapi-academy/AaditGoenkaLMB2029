package Recursion;
import java.util.*;


/**
 * Write a description of class DigitFrequency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitFrequency
{
    private static int frequencyOfDigit(int N, int d){
        if(N > 0){
            if(N%10 == d){
                return 1 + frequencyOfDigit(N/10, d);
            }
            else{
                return frequencyOfDigit(N/10, d);
            }
        }
        else{
            return 0;
        }
    }
    
    public static void countDigitFrequency(int n, int c){
        if(c<10){
            int f = frequencyOfDigit(n, c);
            if(f>0){
                System.out.print("\nThe frequency of " + c + " is: " + f);
            }
            countDigitFrequency(n, c+1);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any integer value: ");
        int n = sc.nextInt();
        countDigitFrequency(n, 0);
    }
}
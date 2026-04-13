package Chapter5Functions;
import java.util.*;


/**
 * Write a program to accept a number and display the frequency 
 * of each digit present in the number.
 * Sample Input: 341124 
 * Sample Output:
   The frequency of 1 = 2 
   The frequency of 2 = 1 
   The frequency of 3 = 1
   The frequency of 4 = 2
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitFrequency
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N, D;
        System.out.print("\fEnter any number: ");
        N = sc.nextInt();
        D = 0;
        while(D < 10){
            int freq = digitFrequency(N, D);
            if (freq > 0){
                System.out.print("\nThe frequency of " + D + " = " + freq);
            }
            D++;
        }
    }
    
    public static int digitFrequency(int N, int digit){
        int f = 0;
        while( N > 0){
            if (N % 10 == digit){
                f++;
            }
            N /= 10; //chopping out the last digit
        }
        return f;
    }
}
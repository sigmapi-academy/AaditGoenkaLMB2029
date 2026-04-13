package Chapter4.forLoop;
import java.util.*;

/**
 * Write a description of class Digitfrequency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/**
 * WAP in Java to input a number and print the frequency of each digit in the number:

Example: 
Input: Enter a number: 355126
Output: 
Digit Frequency
1       1
2       1
3       1
5       2
6       1
 */
public class Digitfrequency
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any positive integer value: ");
        long N = sc.nextLong(), M;
        int i, j;
        System.out.print("\nDigit\tFrequency\n");
        for(i = 0; i < 10; i++){
            M = N;
            j = 0; //counting frequency of i digit
            while(M > 0){
                if(M % 10 == i){
                    j++;
                }
                M = M/10;
            }
            if(j > 0){
                System.out.print("   "+i+"\t   "+j+"\n");
            }
        }
    }
}
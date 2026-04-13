package Recursion;
import java.util.*;

/**
 * Write a description of class Questionj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Questionj
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfTerms;
        System.out.print("\fEnter number of terms: ");
        numOfTerms = sc.nextInt();
        printSeries(numOfTerms, 2, 1, 1, 0);
    }

    public static void printSeries(int n, int numer, int sign, 
    int start, double sum){
        if(start < n){
            if(start%2 != 0){
                System.out.print("("+numer+"/"+(numer+1)+") - ");
            }
            else{
                System.out.print("("+numer+"/"+(numer+1)+") + ");
            }
            sum += ((double)numer/(numer+1)) * sign;
            printSeries(n, numer+2, sign*(-1), start + 1, sum);
        }
        else{
            sum += ((double)numer/(numer+1)) * sign;
            System.out.print("("+numer+"/"+(numer+1)+") = " + 
                String.format("%.2f",sum));
        }
    }
}

package Recursion;
import java.util.*;

/**
 * Write a description of class Q8Pg164 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8Pg164
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of terms: ");
        int n = sc.nextInt();
        printSeriesAndSum(n,1, 1, 0, 0, 1, "(", "(");
    }

    public static void printSeriesAndSum(int n, int i, int j,double sum, 
    int ns, int dp, String numerOutput, String denoOutput){
        if (i < n){
            if(j <= i){
                numerOutput += j + " + ";
                denoOutput += j + " * ";
                ns += j; 
                dp *= j;
                printSeriesAndSum(n, i, j+1, sum, ns, dp, numerOutput, denoOutput);
            }
            else{
                numerOutput += j + ")";
                denoOutput += j + ")";
                ns += j; 
                dp *= j;
                System.out.print(numerOutput+"/"+denoOutput + " + ");
                sum += ns/(double)dp;
                printSeriesAndSum(n, i+1, 1, sum, 0, 1, "(", "(");
            }
        }
        else{
            if(j <= i){
                numerOutput += j + " + ";
                denoOutput += j + " * ";
                ns += j; 
                dp *= j;
                printSeriesAndSum(n, i, j+1, sum, ns, dp, numerOutput, denoOutput);
            }
            else{
                numerOutput += j + ")";
                denoOutput += j + ")";
                ns += j; 
                dp *= j;
                sum += ns/(double)dp;
                System.out.print(numerOutput+"/"+denoOutput + " = " + 
                    String.format("%.2f",sum));
            }
        }
    }
}
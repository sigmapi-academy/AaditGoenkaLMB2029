package Chapter4.WhileLoop;
import java.util.*;


/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N;
        double ns = 1, nsu = 1, dp = 1, dpu = 1,sum = 0;
        System.out.print("\fEnter number of terms: ");
        N = sc.nextInt();
        while(N > 0){
            nsu++;
            ns += nsu;
            dpu++;
            dp *= dpu;
            sum += ns/dp;
            N--;
        }
        System.out.print("\nsum = " + sum);
    }
}
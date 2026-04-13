package Chapter4.WhileLoop;
import java.util.*;

/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N, f = 1;
        System.out.print("\fEnter any number: ");
        N = sc.nextInt();
        System.out.print("\n Factors are : " + f + " ");
        f++;
        while(f <= N/2){
            if(N % f == 0){
                System.out.print(f + " ");
            }
            f++;
        }
        if(N > 1){
            System.out.print(N);
        }
    }
}
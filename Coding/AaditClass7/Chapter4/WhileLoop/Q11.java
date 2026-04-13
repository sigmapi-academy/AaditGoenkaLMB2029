package Chapter4.WhileLoop;
import java.util.*;

/**
 * Write a description of class Q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q11
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N, i, j, count;
        System.out.print("\fEnter any number: ");
        N = sc.nextInt();
        i = 0;
        while(i < 10){
            j = N;
            count = 0;
            while(j > 0){
                int r = j % 10;
                if(r == i){
                    count++;
                }
                j /= 10;
            }
            if(count > 0){
                System.out.print("\nFrequency of " + i + " = " + count);
            }
            i++;
        }
    }
}
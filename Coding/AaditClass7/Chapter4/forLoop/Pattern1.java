package Chapter4.forLoop;
import java.util.*;


/**
 * Write a description of class Pattern1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattern1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int L, i, j, countD = 0;
        System.out.print("Enter number of Lines: ");
        L = sc.nextInt();
        
        for(i = 0; i < L; i++){
            //loop for initial spaces.
            for(j = 0; j < L - i; j++){
                
                System.out.printf("%4s", " ");
                
            }
            //loop for printing the digits.
            for(j = L-i; j <= L; j++){
                
                System.out.printf("%4d", j);
                
            }

            System.out.print("\n");
        }
        
    }
}
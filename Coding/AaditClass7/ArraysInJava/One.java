package ArraysInJava;
import java.util.*;


/**
 * Write a description of class One here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class One
{
    public static void main(String args[]){
        int A[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("\fEnter values in Array A[] \n");
        for(i = 0; i < 5; i++){
            System.out.print("Enter value in A["+i+"]: ");
            A[i] = sc.nextInt();
        }
        
        System.out.print("\nArray A[]:\n[");
        for(i = 0; i < 4; i++){
            System.out.print(A[i]+", ");
        }
        System.out.print(A[i]+"]\n");
    }
}
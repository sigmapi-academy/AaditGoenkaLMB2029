package ArraysInJava;
import java.util.Scanner;


/**
 * Write a description of class Two here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Two
{
    public static void input(Scanner sc, int A[],String msg){
        int i;
        System.out.print("\n"+msg+"\n");
        for(i = 0; i < A.length; i++){
            System.out.print("Enter value in ["+i+"]: ");
            A[i] = sc.nextInt();
        }
    }
    public static void printArray(int A[], String msg){
        int i;
        System.out.print("\n"+msg+"\n[");
        for(i = 0; i < A.length - 1; i++){
            System.out.print(A[i]+", ");
        }
        System.out.print(A[i]+"]\n");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fHow many elements you want: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        input(sc, A,"\nEnter values in Array A[] \n");
        printArray(A,"\nArray A[]:");
    }
}

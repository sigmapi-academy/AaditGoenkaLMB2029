package ArraysInJava;
import java.util.Scanner;

/**
 * Write a description of class Three here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Three
{
    public static void inputArray(int M[], String msg, Scanner sc){
        System.out.print("\n"+msg+"\n");
        int i;
        for(i = 0; i < M.length; i++){
            System.out.print("["+i+"]: ");
            M[i] = sc.nextInt();
        }
    }

    public static void printArray(int M[], String msg){
        System.out.print("\n"+msg+"\n[");
        int i;
        for(i = 0; i < M.length-1; i++){
            System.out.print(M[i]+", ");
        }
        System.out.print(M[i]+"]\n");
    }

    public static void findMaxAndMinInArray(int M[]){
        int i, max = M[0], min = M[0];
        for(i = 1; i < M.length; i++){
            if (max < M[i]){
                max = M[i];
            }

            if (min > M[i]){
                min = M[i];
            }
        }
        System.out.print("\nMaximum = " + max +
            "\nminimum = " + min);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N, A[];
        System.out.print("\fEnter number of elements: ");
        N = sc.nextInt();
        //Allocating memory for array
        A = new int[N]; //N- number of cells allocated in the heap memory.
        //call by reference
        inputArray(A, "Input values in A[]", sc); //delegating task to another function
        printArray(A,"Array A[]:");
        findMaxAndMinInArray(A);
    }
}
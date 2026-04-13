package ArraysInJava;
import java.util.*;

/**
 * Write a description of class ArrayUtility here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayUtility
{
    public static int filled = -1;
    public static void insertAtPosition(int A[], int idx, int ele){
        if(idx >= A.length || idx < 0){
            System.out.print("\nInvalid position.");
            return;
        }
        if(filled == A.length - 1){
            System.out.print("\nArray is full!");
            return;
        }

        int i;
        for(i = filled; i >= idx; i--){
            A[i+1] = A[i];
        }
        A[i+1] = ele;
        filled++;
        System.out.print("\nElement inserted successfully at " + (i+1) + " position.");
    }

    public static void deleteAtPosition(int A[], int idx){
        if(filled == -1){
            System.out.print("\nEmpty Array.");
            return;
        }
        if(idx >= A.length || idx < 0 || idx > filled){
            System.out.print("\nInvalid position.");
            return;
        }
        int i=idx;
        System.out.print("\nDeleted element: "+A[idx]+" successfully at "+(i+1) + " position.");
        for(; i < filled; i++){
            A[i] = A[i+1];
        }
        filled--;
    }

    public static void inputRandomValues(int A[]){
        int i;
        Random R = new Random();
        for(i = 0; i < A.length; i++){
            A[i] = R.nextInt(10, 100);
        }
    }

    public static void printFilledArray(int A[], String msg){
        if(filled == -1){
            System.out.print("\nEmpty array.");
            return ;
        }
        System.out.print("\n" + msg + "\n[");
        int i;
        for(i = 0; i < filled; i++){
            System.out.print(A[i] + ", ");
        }
        System.out.print(A[i]+"]\n");
    }

    public static void printArray(int A[], String msg){
        System.out.print("\n" + msg + "\n[");
        int i;
        for(i = 0; i < A.length - 1; i++){
            System.out.print(A[i] + ", ");
        }
        System.out.print(A[i]+"]\n");
    }
}
package ArraysInJava;
import java.util.*;


/**
 * Write a description of class TestSorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestSorting
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of elements: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        ArrayUtility.inputRandomValues(A);
        ArrayUtility.printArray(A, "Array A[] before sorting: ");
        //SortingAlgorithms.bubbleSort(A); 
        SortingAlgorithms.selectionSort(A);
        ArrayUtility.printArray(A, "Array A[] after sorting: ");
    }
}
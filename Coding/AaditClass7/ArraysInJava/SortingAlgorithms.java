package ArraysInJava;

/**
 * Write a description of class SortingAlgorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingAlgorithms
{
    public static void bubbleSort(int A[]){
        int i, j, t;
        for(i = 0; i < A.length - 1; i++){
            for(j = 0; j < A.length - 1 - i; j++){
                if(A[j] > A[j+1]){
                    t = A[j];
                    A[j] = A[j+1];
                    A[j+1] = t;
                }
            }
        }
    }
    
    public static void selectionSort(int A[]){
        int i, j, t, minp;
        for(i = 0; i < A.length - 1; i++){
            for(minp = i, j = i+1; j < A.length; j++){
                if(A[minp] > A[j]){
                    minp = j;
                }
            }
            //we got the minp, so we swap the minp with i'th position
            t = A[i];
            A[i] = A[minp];
            A[minp] = t;
        }
    }
}
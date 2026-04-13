package ArraysInJava;
import java.util.*;


/**
 * Write a description of class MyArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArray
{
    private int arr[], n;
    
    public MyArray(){}
    
    public void readArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        int i, j;
        System.out.print("\nInserting element in sorted order: \n");
        for(i = 0; i < n; i++){
            System.out.print("Enter integer value in arr[]: ");
            int t = sc.nextInt();
            for(j = i-1; j >= 0 && arr[j] > t;j--){
                arr[j+1] = arr[j]; //shifting values to next cell and creating empty space
            }
            arr[j+1] = t; //inserting t in the empty space created by above logic
        }
    }
    
    public void displayArray(){
        int i;
        System.out.print("\narr[]: [");
        for(i = 0; i < n-1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[i] + "]\n");
    }
    
    public int binarySearch(int se){
        int lb = 0;
        int ub = n - 1;
        int mid;
        while(lb <= ub){
            mid = (lb + ub) / 2;
            if(arr[mid] == se){
                return mid; //returning the index when data is found in the array
            }
            if(arr[mid] > se){
                ub = mid-1; //searching the information in left side of the array
            }
            else{
                lb = mid + 1; //searching the information in the right side of the array
            }
        }
        return -999; //when search element is not found.
    }
    
    public static void main(String args[]){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        int se;
        MyArray ob = new MyArray();
        ob.readArray();
        System.out.print("\nEnter search element: ");
        se = sc.nextInt();
        int indx = ob.binarySearch(se);
        if(indx == -999){
            System.out.print("\nElement is not present in the array.");
        }
        else{
            System.out.print("\nElement is present in index: " + indx);
        }
        ob.displayArray();
    }
}
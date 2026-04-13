package ArraysInJava;
import java.util.*;


/**
 * Write a description of class ArrayOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayOperations
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A[], size, ele, ch;
        System.out.print("\fEnter size of array: ");
        size = sc.nextInt();
        A = new int[size];
        while(true){
            System.out.print("\nPress 1 to insert element at specified position."
            +"\nPress 2 to delete element at specified position."
            +"\nPress 3 to display array."
            +"\nPress 0 to exit."
            +"\nEnter your choice (0-3) : ");
            ch = sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.print("\nEnter index to insert: ");
                    int pos = sc.nextInt();
                    System.out.print("\nEnter element to insert: ");
                    ele = sc.nextInt();
                    ArrayUtility.insertAtPosition(A, pos, ele);
                    break;
                }
                case 2:{
                    System.out.print("\nEnter index to delete: ");
                    int pos = sc.nextInt();
                    ArrayUtility.deleteAtPosition(A, pos);
                    break;
                }
                case 3:{
                    ArrayUtility.printFilledArray(A, "Array A[]: ");
                    break;
                }
                case 0:{
                    System.exit(ch);
                }
                
            }
        }
    }
}
package ExceptionHandling;
import java.util.*;

/**
 * Write a description of class x here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
    public static void main(String args[]){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i;
        try{

            for(i=0;i<10;i++){

                try{
                    System.out.print("\nEnter A Number ");
                    arr[i] = sc.nextInt(); 
                }
                catch(InputMismatchException IME){
                    System.err.print("\nIncorrect Data Type ");
                    System.err.print("\nSuggestion: Insert Data in Integer Format ");
                    i--;
                    sc.nextLine();
                }
            }
            int maxno = arr[0], minno = arr[0], sum = arr[0];
            for(i=1;i<10;i++){
                if(arr[i]>maxno){
                    maxno = arr[i];
                }
                if(arr[i]<minno){
                    minno = arr[i];
                }
                sum+= arr[i];
            }
            double avg = sum/10.0;
            System.out.print("\nLargest Number : " + maxno + 
                "\nSmallest Number : " + minno + 
                "\nAverage : " + avg); 
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.err.print("\nIncorrect Index Value ");
        }       
        catch(ArithmeticException ae){
            System.err.print("\nArithmetical Error ");
        }
    }
}
 
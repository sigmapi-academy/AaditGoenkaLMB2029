package Chapter5Functions;
import java.util.*;


/**
 * Write a description of class DigitsPayGround here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitsPlayGround
{
    public int sumOfDigits(int x){
        //write your code here and change the return statement
        return 0;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N, sod;
        //Object creation 
        DigitsPlayGround ob = new DigitsPlayGround();
        System.out.print("\fEnter any integer: ");
        N = sc.nextInt();
        sod = ob.sumOfDigits(N);
        System.out.print("\nSum of digits of " + N + " is : " + sod);
    }
}
package Chapter4.WhileLoop;
import java.util.*;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    public static void main(String args[]){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        int howManyInts, cp = 0, cn = 0, sp = 0, sn = 0, n;
        System.out.print("How many integers you have? ");
        howManyInts = sc.nextInt();
        while(howManyInts > 0 ){
            System.out.print("Enter any integer value: ");
            n = sc.nextInt();
            if(n < 0){
                cn++;
                sn += n;
            }
            else {
                cp++;
                sp += n;
            }
            howManyInts--;
        }
        System.out.print("\nCount of positive numbers: " + cp);
        System.out.print("\nCount of negative numbers: " + cn);
        System.out.print("\nSum of positive numbers: " + sp);
        System.out.print("\nSum of negative numbers: " + sn);
    }
}
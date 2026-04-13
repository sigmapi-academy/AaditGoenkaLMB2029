package Chapter3;
import java.util.*;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c, s;
        System.out.print("\fEnter first angle: ");
        a = sc.nextInt();
        System.out.print("Enter second angle: ");
        b = sc.nextInt();
        System.out.print("Enter third angle: ");
        c = sc.nextInt();
        if(a <= 0 || b <= 0 || c <= 0){
            System.out.print("\nTriangle is not possible!");
        }
        else{
            s = a + b + c;
            if(s == 180){
                if(a == 90 || b == 90 || c == 90){
                    System.out.print("\nRight angled triangle.");
                }
                else if(a < 90 && b < 90 && c < 90){
                    System.out.print("\nAcute angled triangle.");
                }
                else{
                    System.out.print("\nObtused angled triangle.");
                }
            }
            else{
                System.out.print("\nConstruction of triangle is not possible.");
            }
        }
    }
}
package ClassAndObjects;
import java.util.*;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    int a, b;
    void inputdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter A Value : ");
        a = sc.nextInt();
        System.out.print("\nEnter A Value : ");
        b = sc.nextInt();
    }
    void calculate(){
        int sum, dif;
        sum = a + b;
        dif = a -b;
        System.out.print("\nSum : " + sum);
        System.out.print("\nDifference : " + dif);
    }
    void outputdata(){
        System.out.print("\nFirst Number : " + a);
        System.out.print("\nSecond Number : " + b);
        calculate();

    }
    public static void main(String args[]){
        Q1 obj= new Q1();
        obj.inputdata();
        obj.outputdata();
    }
}

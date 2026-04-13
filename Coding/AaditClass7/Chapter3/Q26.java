package Chapter3;
import java.util.*;

/**
 * Write a description of class Q26 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q26
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter the Basic Salary of an Employee: ");
        int ba = sc.nextInt();
        double da=0,sa=0,gs=0;
        if(ba<=10000){
            da = 0.1*ba;
            sa = 0.05*ba;
        }
        else if(ba<=20000){
            da = 0.12*ba;
            sa = 0.08*ba;
        }
        else if(ba<=30000){
            da = 0.15*ba;
            sa = 0.1*ba;
        }
        else{
            da = 0.2*ba;
            sa = 0.12*ba;
        }
        gs = ba + da + sa;

        System.out.printf("\n%20s%15s%20s%15s","Basic Salary","DA","Spl. Allowance",
            "Gross Salary");
        System.out.printf("\n%20d%15.2f%20.2f%15.2f",ba,da,sa,gs);
    }
}

package Chapter3;
import java.util.*;


/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int dis, amt;
        String taxiNum;
        System.out.print("\fEnter taxi number: ");
        taxiNum = sc.next();
        System.out.print("Enter distance: ");
        dis = sc.nextInt();
        if(dis <= 5){
            amt = 100;
        }
        else if (dis <= 15){
            amt = 100 + (dis - 5) * 10;
        }
        else if (dis <= 25){
            amt = 200 + (dis - 15) * 8;
        }
        else{
            amt = 280 + (dis - 25) * 5;
        }
        System.out.print("\n************BILL************");
        System.out.print("\nTaxi No. " + taxiNum);
        System.out.print("\nDistance covered: " + dis);
        System.out.print("\nAmount to paid: " + amt);
        System.out.print("\n**********Thank you************");
    }
}
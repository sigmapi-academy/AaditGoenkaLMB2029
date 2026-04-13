package ClassAndObjects;
import java.util.Scanner;


/**
 * Write a description of class CreatingBikes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreatingBikes
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int cn, rn;
        String mn;
        System.out.print("Enter registration number: ");
        rn = sc.nextInt();
        System.out.print("Enter chasis number: ");
        cn = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter manufacturer name: ");
        mn = sc.nextLine();
        Bike honda = new Bike(rn, cn, mn);
        System.out.print("\n" +  honda);
        Bike hero = new Bike(5254, 3456, "Hero");
        System.out.print("\n" + hero);
    }
}
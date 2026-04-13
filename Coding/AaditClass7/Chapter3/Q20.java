package Chapter3;
import java.util.*;


/**
 * Write a description of class Q20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q20
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter name: ");
        String name = sc.nextLine();
        System.out.print("Enter purchase amount: \u20b9 ");
        double amt = sc.nextDouble();
        System.out.print("\nPress 'L' for Laptop"+
        "\nPress 'D' for Desktop"+
        "\nEnter your choice: ");
        char ch = sc.next().charAt(0);
        double dis = 0.0, na;
        switch(ch){
            case 'L': case 'l':{
                if(amt <= 25000){
                    dis = 0.05;
                }
                else if(amt <= 50000){
                    dis = 0.075;
                }
                else if(amt <= 100000){
                    dis = 0.1;
                }
                else{
                    dis = 0.15;
                }
                break;
            }
            case 'D': case 'd':{
                if(amt <= 25000){
                    dis = 0.0;
                }
                else if(amt <= 50000){
                    dis = 0.05;
                }
                else if(amt <= 100000){
                    dis = 0.075;
                }
                else{
                    dis = 0.1;
                }
                break;
            }
            default:
                System.out.print("\nWrong option selected.");
        }
        if(ch == 'D' || ch == 'd' || ch == 'L' || ch == 'l'){
            na = amt - amt*dis;
            System.out.print("\nName: " + name + "\nAmount to be paid: \u20b9 " + na);
        }
    }
}
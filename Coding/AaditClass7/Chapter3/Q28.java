package Chapter3;
import java.util.*;


/**
 * Write a description of class Q28 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q28
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        double amount, disRate = 0, discount, finalAmount;
        char C;
        String name, address;
        System.out.print("Enter name of customer: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter Amount: ");
        amount = sc.nextDouble();
        System.out.print("Enter 'L' for Laptop and 'D' for Desktop: ");
        C = sc.next().charAt(0);
        switch(C){
            case 'L' : case 'l':{
                if(amount <= 25000){
                    disRate = 0.0;
                }
                else if(amount <= 57000){
                    disRate = 0.05;
                }
                else if(amount <= 100000){
                    disRate = 0.075;
                }
                else{
                    disRate = 0.1;
                }
                break;
            }
            case 'D': case 'd':
            {
                if(amount <= 25000){
                    disRate = 0.05;
                }
                else if(amount <= 57000){
                    disRate = 0.075;
                }
                else if(amount <= 100000){
                    disRate = 0.1;
                }
                else{
                    disRate = 0.15;
                }
                break;
            }
            default:
                System.out.print("\nWrong option Selected!!!");
                System.exit(1); // function to terminate the code.
        }
        discount = amount*disRate;
        finalAmount = amount - discount;
        System.out.print("\nName: " + name);
        System.out.print("\nAddress: " + address);
        System.out.print("\nNet amount payable: \u20b9"+finalAmount);
    }
}
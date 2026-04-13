package ClassAndObjects;
import java.util.*;


/**
 * Write a description of class TestAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAccount
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, acnum;
        String name;
        float amt;
        System.out.print("\f");
        Account aob[] = new Account[3]; //it will create 5 Account reference variable
        //now we have to allocate memory for the objects.
        for(i = 0; i < aob.length; i++){
            System.out.print("Enter Account Number: ");
            acnum = sc.nextInt();
            sc.nextLine(); //clear keyboard buffer
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Account Balance: ");
            amt = sc.nextFloat();
            aob[i] = new Account(acnum, name, amt); //allocating memory for the object
        }
        
        System.out.print("\nAccount details of Customers of Jan Dhan Bank");
        for(i = 0; i < aob.length; i++){
            System.out.print("\nAccount number: " + aob[i].getAcc_num());
            System.out.print("\nName: " + aob[i].getName());
            System.out.print("\nBalance: " + aob[i].getAmount());
        }
    }
}
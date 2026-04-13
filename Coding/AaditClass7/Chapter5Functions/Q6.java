package Chapter5Functions;
import java.util.*;


/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.print("\f");
        for(;;){
            System.out.print("\n1. BUZZ Number"+
            "\n2. GCD"+
            "\n0. Exit"+
            "\nEnter your choice(0-2)? : ");
            ch = sc.nextInt();
            if(ch == 0){
                System.out.print("\nThank you for using our software.");
                System.out.print("\nPlease provide the feedback on bluejteacher@gmail.com");
                return; //exit from main(...) method
            }
            else if (ch == 1){
                
            }
            else if(ch == 2){
                
            }
            else{
                System.out.print("\nWrong option selected from menu");
            }
        }
    }
}
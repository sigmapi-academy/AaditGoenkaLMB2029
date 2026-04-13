package Chapter3;
import java.util.*;


/**
 * Write a description of class BasicCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasicCalculator
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x, y, r = 0;
        String op;
        System.out.print("\f(+,-, *, /, %, ^, max, min) : ");
        op = sc.next();
        switch(op){
            case "+":{
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                r = x + y;
                break;
            }
            case "-":{
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                r = x - y;
                break;
            }
            case "*":{
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                r = x * y;
                break;
            }
            case "/":{
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                r = x / y;
                break;
            }
            case "%":{
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                r = x % y;
                break;
            }
            case "max": case "Max": case "MAX":{
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                r = Math.max(x, y);
                break;
            }
            case "min": case "Min": case "MIN":{
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                r = Math.min(x, y);
                break;
            }
            
            case "^":{
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                r = (int)Math.pow(x, y); //type-casting is done here from double to int
                break;
            }
            default:
                System.out.print("\nYou have selected wrong option from the menu.");
        }
        System.out.print("\nResult: " + r);
    }
}
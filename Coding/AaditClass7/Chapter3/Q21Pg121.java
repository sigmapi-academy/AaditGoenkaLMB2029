package Chapter3;
import java.util.*;


/**
 * Write a description of class Q21Pg121 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q21Pg121
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double tempInC, tempInF;
        System.out.print("\fPress 'C' or 'c' to convert temperature in Celcius."+
        "\nPress 'F' or 'f' to convert temperature in Farenheit."+
        "\nEnter your choice: \n");
        char c = sc.next().charAt(0);
        switch(c){
            case 'C': case 'c':{
                System.out.print("\nEnter temperature in Farenheit: ");
                tempInF = sc.nextDouble();
                tempInC = 5.0 *(tempInF-32)/9;
                System.out.print("\nTemperature in Celcius: " + tempInC);
                break;
            }
            
            case 'F': case 'f':{
                System.out.print("\nEnter temperature in Celcius: ");
                tempInC = sc.nextDouble();
                tempInF = ((9.0 *tempInC)/5) +32;
                System.out.print("\nTemperature in Farenheit: " + tempInF);
                break;
            }
            default:
                System.out.print("\nWrong option selected.");
        }
    }
}
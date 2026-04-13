package ExceptionHandling;
import java.util.*;

/**
 * Write a description of class MultipleException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultipleException
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = null;
        int num[] = {1,0,3};
        try{
            //System.out.print("\fnum[10]: "+num[10]); 
            System.out.print("\fnum[2]: "+num[2]);
            System.out.print("\nEnter any value in num[2]: ");
            num[2] = sc.nextInt();
            name = "Joy";
            System.out.print("\nname =" + name.length());
            System.out.print("\nQuotient by dividing " + num[2] + "/" + num[1] + 
            " = " + num[2]/num[1]);    
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.print("\nInvalid index value.\n ");
            //e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.err.print("\nYou have not entered integer value.");
        }
        catch(NullPointerException e){
            System.err.print("\nYou have not entered any data in String variable");
        }
        catch(ArithmeticException e){
            System.err.print("\n Divide by zero error!");
        }
    }
}
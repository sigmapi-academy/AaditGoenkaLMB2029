package Chapter5Functions;
import java.util.*;

/**
 * Write a description of class TypeOfNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TypeOfNumbers
{
    public boolean isPrime(int x){
        int count = 1;
        if(x == 1 || (x>2 && x % 2 == 0)){
            System.out.print("\nNumber of steps: " + count);
            return false;
        }
        
        for(int d = 3; d <= Math.sqrt(x); d += 2, count++){
            if(x % d == 0){
                System.out.print("\nNumber of steps: " + count);
                return false;
            }
        }
        System.out.print("\nNumber of steps: " + count);
        return true;
    }

    public boolean isEvenOdd(int x){
        //if the number is even this method will return true
        //otherwise false
        return (x % 2 == 0);
    }
    
    public static void main(String args[]){
        //Object creation
        TypeOfNumbers ob = new TypeOfNumbers();
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any number: ");
        N = sc.nextInt();
        
        if (ob.isPrime(N)){ //function call or invocatio of method
            System.out.print("\nPrime number.");
        }
        else if(ob.isEvenOdd(N)){//function call or invocatio of method
            System.out.print("\nEven number.");
        }
        else{
            System.out.print("\nOdd number.");
        }
    }
}
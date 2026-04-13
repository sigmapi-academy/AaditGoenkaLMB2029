package Chapter5Functions;
import java.util.*;


/**
 * Write a description of class UniqiueNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniqiueNumber
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("\fEnter any integer: ");
        N = sc.nextInt();
        if (N < 0){
            N = N*(-1);
        }
        if(isUnique(N)){
            System.out.print("\nUnique number.");
        }
        else{
            System.out.print("\nNot a unique number.");
        }
    }
    
    public static boolean isUnique(int x){
        int d, y,c;
        for(d = 0; d < 10; d++){
            for(c = 0, y = x; y > 0; y/=10){
                if(y%10 == d){
                    c++;
                }
                if(c == 2){
                    return false;
                }
            }
        }
        return true;
    }
}
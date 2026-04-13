package Recursion;


/**
 * Write a description of class Q18dPg166 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q18dPg166
{
    /**
     * @param start = 1
     * @param sign = 1 
     */
    public static double sumOfSeries(int start, int a, int n, int sign){
        if(start < n){
            if(start % 2 != 0){
                System.out.print(start);
                return start + sumOfSeries(start+1, a, n, sign*(-1));    
            }
            else{
                System.out.print((sign*a)+"/"+start+"+");
                return (sign*a/(double)start) + sumOfSeries(start + 1, a, n, sign*(-1));
            }
        }
        else{
            //last value
            if(start % 2 != 0){
                System.out.print(start);
                return start;
            }
            else{
                System.out.print((sign*a)+"/"+start);
                return (sign*a/(double)start);
            }
        }
    }
}
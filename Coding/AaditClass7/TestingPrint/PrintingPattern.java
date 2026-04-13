package TestingPrint;
import AbstractionInJava.InterfacesInJava.*;
import java.util.*;

/**
 * Write a description of class PrintingPattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintingPattern
{
    /**
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4 
     * 1 2 3 4 5
     */
    
    public static void main(String[] args){
        P p = new P();
        p.print("\f");
        int i, n;
        Scanner sc = new Scanner(System.in);
        p.print("Enter number of lines: " );
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                p.print(j+" ");
            }
            p.println();
        }
    }
}
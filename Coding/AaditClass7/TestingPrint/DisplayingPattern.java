package TestingPrint;
import AbstractionInJava.InterfacesInJava.*;
import java.util.*;

/**
 * Write a description of class DisplayingPattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DisplayingPattern implements Displayable
{
    /**
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4 
     * 1 2 3 4 5
     */
    
    public static void main(String[] args){
        Displayable.print("\f");
        int i, n;
        Scanner sc = new Scanner(System.in);
        Displayable.print("Enter number of lines: " );
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                Displayable.print(j+" ");
            }
            Displayable.println();
        }
        
        Displayable d = DisplayableClass.createObject();
        d.msg();
    }
}
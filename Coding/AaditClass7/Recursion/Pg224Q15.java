package Recursion;
import java.util.*;


/**
 * Write a description of class Pg224Q15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg224Q15
{
    public static String printInitials(String str, int start){
        if(str.length() > 0){
            int spcPos = str.indexOf(" ", start);
            String word = str.substring(start, spcPos);
            return word.charAt(0) + printInitials(str.substring(spcPos+1), 0);
        }
        else{
            return "";
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any sentence: ");
        String sent = sc.nextLine().trim() + " ";
        System.out.print("\nInitials: " + printInitials(sent, 0));
    }
}
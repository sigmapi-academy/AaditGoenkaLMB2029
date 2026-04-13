package StringProgramming;
import java.util.*;


/**
 * Write a description of class StringDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringDemo
{
    public static void main(String args[]){
        String str;
        Scanner sv = new Scanner(System.in);
        System.out.print("\fEnter any string: ");
        str = sv.nextLine();
        int len = str.length();
        int i;
        for(i = 0; i < len; i++){
            char c = str.charAt(i);
            System.out.print("\n" + c + " at index: " + i);
        }
    }
}
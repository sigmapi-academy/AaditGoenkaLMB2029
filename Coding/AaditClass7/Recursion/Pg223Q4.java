package Recursion;
import java.util.*;

/**
 * Write a description of class Pg223Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg223Q4
{
    public static String removeVowels(String str){
        String vowels = "aeiouAEIOU";
        if(str.length() > 0){
            char c = str.charAt(0);
            if(vowels.indexOf(c)== -1){
                return c + removeVowels(str.substring(1));
            }
            else{
                return removeVowels(str.substring(1));
            }
        }
        else{
            return "";
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("\fEnter any string or word: ");
        str = sc.nextLine();
        String newStr = removeVowels(str);
        System.out.print("\nString after removing all the vowels: " + newStr);
    }
}
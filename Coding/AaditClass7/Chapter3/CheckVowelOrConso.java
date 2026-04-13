package Chapter3;
import java.util.*;

/**
 * Write a description of class CheckVowelOrConso here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckVowelOrConso
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.print("\fEnter any alphabet: ");
        c = sc.next().charAt(0);
        if((c >='A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            switch(c){
                case 'A': case 'E': case 'I': case 'O': case 'U':  
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.print("\nEntered character is a vowel.");
                    break;
                default:
                    System.out.print("\nEntered character is a consonant.");
            }
        }
        else{
            System.out.print("\nEntered character is not an alphabet.");
        }
    }
}
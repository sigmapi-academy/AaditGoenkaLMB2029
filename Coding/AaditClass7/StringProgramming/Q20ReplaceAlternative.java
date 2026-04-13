package StringProgramming;
import java.util.*;


/**
 * Write a description of class Q20ReplaceAlternative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q20ReplaceAlternative
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str, word, replaceWord, w="", newSent = "";
        System.out.print("\fEnter any sentence: ");
        str = sc.nextLine().trim() + " ";
        System.out.print("Enter a word to be replace: ");
        word = sc.next();
        System.out.print("Enter a relacement word: ");
        replaceWord = sc.next();
        char x;
        int i, len = str.length();
        for(i = 0; i < len; i++){
            x = str.charAt(i);
            if(x != ' '){
                w += x; //concatenating char to create a word
            }
            else{
                //word is ready;
                if(w.equalsIgnoreCase(word)){
                    newSent += replaceWord + x;
                }
                else{
                    newSent += w + x;
                }
                
                w = ""; //removed the content of the word, for another word.
            }
        }
        System.out.print("\nNew Sentence: " + newSent);
    }
}
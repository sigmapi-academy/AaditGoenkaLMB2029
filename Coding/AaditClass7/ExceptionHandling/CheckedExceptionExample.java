package ExceptionHandling;


/**
 * Write a description of class CheckedExceptionExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckedExceptionExample
{
    public static void main(String[] args) throws java.io.IOException {
        char c;
        String v="aeiouAEIOU";
        System.out.print("\fEnter any character: ");
        c = (char)System.in.read();
        if(Character.isAlphabetic(c)){
            System.out.print("\n" + c + " is an alphabet");
            if(Character.isUpperCase(c)){
                System.out.print("\n" + c + " is an uppercase alphabet.");
            }
            else{
                System.out.print("\n" + c + " is an lowercase alphabet.");
            }
            if(v.indexOf(c) > -1){
                System.out.print("\n" + c + " is a vowel.");
            }
            else{
                System.out.print("\n" + c + " is not a vowel");
            }
        }
        else if(Character.isWhitespace(c)){
            System.out.print("\n it is a white space." );
        }
        else if(Character.isDigit(c)){
            System.out.print("\n" + c + " is a digit.");
        }
        else{
            System.out.print("\n" + c + " is an other character.");
        }
        
    }
}
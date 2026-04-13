package StringProgramming;


/**
 * Write a description of class ReplacingString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReplacingString
{
    public static void main(String args[]){
        /**
         * String str = "Java is a programming language. Java is a platform. Java is an island.";
        String p = str.replaceAll("Java", "Python");
        System.out.print("\fOriginal String: "+ str);
        System.out.print("\nAfter replacing 'Java' with 'Python': " + p);
         */
        
        String name = "     Shiv    Mishra     ";
        String nm = name.trim();
        System.out.print("\fString with leading and trailing spaces: " + name);
        System.out.print("\nString without leading and trailing spaces: "+nm);
        
    }
}
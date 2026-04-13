package StringProgramming;


/**
 * Write a description of class SearchStringsInJava here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SearchStringsInJava
{
    public static void main(String args[]){
        String s = "Sachin";
        System.out.print("\f" + s.startsWith("Sa")); //true
        System.out.print("\n"+s.endsWith("in")); //true
        System.out.print("\n"+s.endsWith("iN")); //false
    }
}
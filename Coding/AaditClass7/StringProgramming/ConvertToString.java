package StringProgramming;


/**
 * Write a description of class ConvertToString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConvertToString
{
    public static void main(String args[]){
        String s = String.valueOf(3.1416); //double to string
        String PI = s;
        System.out.print("\fPI = " + s);
        
        char A[] = {'1', '$', '2','$'};
        String t = String.valueOf(A);
        System.out.print("\n" + t);
    }
}
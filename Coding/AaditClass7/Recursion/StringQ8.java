package Recursion;
import java.util.*;


/**
 * Write a description of class StringQ8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringQ8
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter A Sentence : ");
        String sen = sc.nextLine();
        System.out.print("\nEnter A Character : ");
        char c = sc.next().charAt(0);
        int f = Frq(sen, c);
        System.out.print("The Frequency of " + c + " is = " + f);
    }
    public static int Frq(String sen, char c){
        if(sen.length() > 0){
            if(Character.toLowerCase(sen.charAt(0))== Character.toLowerCase(c) ){
                return 1 + Frq(sen.substring(1), c);   
            }
            else{
                return Frq(sen.substring(1), c);   
            }
        }
        else{
           return 0; 
        }
    }
}
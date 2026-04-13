package StringProgramming;
import java.util.*;


/**
 * Write a description of class StringConcat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringConcat
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fname, mname, lname;
        System.out.print("\fEnter first name: ");
        fname = sc.next();
        System.out.print("Enter middle name: ");
        mname = sc.next();
        System.out.print("Enter last name: ");
        lname = sc.next();
        //String fullName = fname.concat(" ").concat(mname).concat(" ").concat(lname);
        String fullName = fname + " " + mname + " " + lname;
        System.out.print("\nFull name: " + fullName);
        
    }
}
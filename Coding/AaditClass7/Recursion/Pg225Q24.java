package Recursion;

/**
 * Write a description of class Pg225Q24 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg225Q24
{
    public static void removeNextDuplicateChar(String str, String newstr){
        if(str.length() > 0){
            char c = str.charAt(0);
            int i = str.indexOf(c, 1);
            if(i > -1){ //removal step
                newstr = str.substring(0, i) + str.substring(i+1);
            }
            removeNextDuplicateChar(str.substring(1), newstr);
        }
        else{
            System.out.print("\n" + newstr);
        }
    }
}
package ClassAndObjects;
import java.util.*;

/**
 * Write a description of class Q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Caseconvert
{
    private String str;
    public void getstr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        str = sc.nextLine();
    }

    public void convert(){
        int i;
        String con = "";
        for(i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isLetter(c)){
                if(Character.isLowerCase(c)){
                    con += Character.toUpperCase(c);
                }
                else{
                    con += Character.toLowerCase(c);
                }
            }
        }
        str = con;
    }

    public void display(){
        System.out.print("\nOriginal String: " + str);
        convert();
        System.out.print("\nAfter conversion: " + str);
    }
    
    public static void main(String args[]){
        System.out.print("\f");
        Caseconvert cc = new Caseconvert();
        cc.getstr();
        cc.display();
    }
}
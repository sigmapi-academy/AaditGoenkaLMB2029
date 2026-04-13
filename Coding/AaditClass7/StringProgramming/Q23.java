package StringProgramming;
import java.util.*;


/**
 * Write a description of class Q23 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q23
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str, uniStr = "";
        System.out.print("\fEnter any string: ");
        str = sc.nextLine().trim();
        int i, j;
        char x, y;
        for(i = 0; i < str.length(); i++){
            x = str.charAt(i);
            for(j = 0; j < uniStr.length(); j++){
                y = uniStr.charAt(j);
                if(Character.toLowerCase(x) == Character.toLowerCase(y)){
                    break;
                }
            }
            if(!(j < uniStr.length())){
                uniStr += x;
            }
        }
        System.out.print("\n"+uniStr);
    }
}

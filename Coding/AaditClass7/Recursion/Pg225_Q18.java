package Recursion;
import java.util.*;

/**
 * Write a description of class Pg225_Q18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg225_Q18
{
    public static void findMaxFreqOfAChar(String str, int freq[]){
        if(str.length() > 0){
            char c = str.charAt(0);
            if(Character.isLetter(c)){
                freq[c - 'a']++; 
            }
            findMaxFreqOfAChar(str.substring(1), freq);
        }
        else{
            System.out.print("\nThe character with maximum number of times: "+
                ((char)(findMaximum(freq, 0, 0)+'a')));
        }
    }

    public static int findMaximum(int a[], int i, int maxi){
        if(i < a.length){
            if( a[i] > a[maxi]){
                return findMaximum(a, i+1, i);
            }
            else{
                return findMaximum(a, i+1, maxi);
            }   
        }
        else{
            return maxi;
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any sentence: ");
        String sent = sc.nextLine();
        int A[] = new int[26];
        findMaxFreqOfAChar(sent.toLowerCase(), A);
    }
}
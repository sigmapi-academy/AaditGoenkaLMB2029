package Recursion;
import java.util.Random;

/**
 * Write a description of class Q21 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q21
{
    public static void main(String args[]){
        int candidates[] = new int[5], nov = 1249, vv = 861;
        System.out.print("\fNumber of invalid votes: "+(nov-vv));
        System.out.print("\nNumber of valid votes: " + vv);
        Random r = new Random();
        votingCalculations(candidates, vv, r);
        printPercentOfValidVotes(candidates, 0, 5, vv);
    }

    public static void votingCalculations(int[] c, int vv, Random r){
        if(vv > 0){
            int candidate = r.nextInt(5);
            c[candidate]++;
            System.out.print("\nCandidate: " + (candidate+1) + 
                " has currently received votes: " + c[candidate]);
            votingCalculations(c, vv-1, r);
        }
    }

    public static void printPercentOfValidVotes(int[] c, int start, int n, int vv){
        if(start < n){
            System.out.print("\nNumber of votes received by candidate "+(start+1) + " is : " + c[start]);
            System.out.print("\nPercentage of votes: " + String.format("%.2f",((double)c[start]/vv)*100));
            printPercentOfValidVotes(c, start+1, n, vv);
        }
    }
}
package Chapter4.forLoop;
import java.util.*;


/**
 * Write a description of class Q20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q20
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double sale, commRepresentative, commDistributor;
        int count = 1;
        System.out.print("\f");
        String output = "\n Sl.No Commission of Representative Commission of Distributor";
        while(count <= 2){
            System.out.print("\nEnter Sale: ");
            sale = sc.nextDouble();
            if(sale <= 10000){
                commRepresentative = sale * 0.05;
                commDistributor = sale * 0.02;
            }
            else if(sale <= 20000){
                commRepresentative = sale * 0.08;
                commDistributor = sale * 0.03;
            }
            else if(sale <= 30000){
                commRepresentative = sale * 0.1;
                commDistributor = sale * 0.04;
            }
            else {
                commRepresentative = sale * 0.12;
                commDistributor = sale * 0.05;
            }
        
            output += String.format("\n%5d%25.2f% 18.2f", count, commRepresentative,commDistributor);
            count++;
        }
        System.out.print("\n" + output);
    }
}
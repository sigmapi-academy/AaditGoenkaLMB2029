package ClassAndObjects;
import java.util.*;

/**
 * Write a description of class Q13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q13
{
    String title, author, pub; int noc;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Book's Title : ");
        title = sc.nextLine();
        System.out.print("\nEnter the Author's Name : ");
        author = sc.nextLine();
        System.out.print("\nEnter the Publisher's Name : ");
        pub = sc.nextLine();
        System.out.print("\nEnter the Number of Copies : ");
        noc = sc.nextInt();
    }

    void purchase(int n, String t, String p,String a){
        if(title.equalsIgnoreCase(t) && author.equalsIgnoreCase(a) && pub.equalsIgnoreCase(p)){
            if(noc>=n){
                noc-=n;
                System.out.print("\nYour Order is Placed ");
            }
            else{
                System.out.print("\nStock is Underflowing ");
            }
        }
    }

    public static void main(String args[]){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        int n;String t, p, a;
        System.out.print("\nStoring Information\n");
        Q13 obj = new Q13();
        obj.input();
        System.out.print("\nPlacing order: ");
        System.out.print("\nEnter the Book's Title : ");
        t = sc.nextLine();
        System.out.print("\nEnter the Author's Name : ");
        a = sc.nextLine();
        System.out.print("\nEnter the Publisher's Name : ");
        p = sc.nextLine();
        System.out.print("\nEnter the Number of Copies : ");
        n = sc.nextInt();
        obj.purchase(n, t, p, a);
    }
}
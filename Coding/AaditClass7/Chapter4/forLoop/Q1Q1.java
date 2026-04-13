package Chapter4.forLoop;
import java.util.*;

/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1Q1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter a Number(m) : ");
        int m = sc.nextInt();
        System.out.print("\nEnter a Number(n)(m<n) : ");
        int n = sc.nextInt();
        int i =2, x =0, y=0, l=1, m2, y2, z=0, b=0, c=0;
        if(m>=n){
            System.out.print("\nIt is an Error");
            System.exit(0);
        }
        else{
            for(;m<=n;){
                i =2;
                for(;i<m;){
                    if(m%i !=0){
                        i++;

                    }
                    else{
                        break;
                    }

                }
                l=m;
                for(;m==i && l>0; ){
                    x = l%10;
                    y = y*10+x;
                    l = l/10;
                }
                m2 = m*m;
                y2= y*y;
                b=m2;
                for(;m==i && b>0;){
                    z = b%10;
                    c = c*10+z;
                    b = b/10;
                }
                if(y2 == c && y2!=0 && c!=0){
                    System.out.print("\nIt is a Prime Adam Number : " + m);
                }
                y=0;
                c=0;
                m++;
            }
        }
    }
}

package StringProgramming;

/**
 * Write a description of class StringComparisonDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringComparisonDemo
{
    public static void main(String args[]){
        System.out.print("\f");
        String x = "abc";
        String y = "abc";
        String m = "ABC";
        String z = new String("abc");
        System.out.print((x == y)); //true because memory allocation is same
        System.out.print("\n"+(x == z)); //false because memory is allocated outside the String pool
        //"==" is comparing memory reference not data. So we need to use String functions
        System.out.print("\n"+ (x.equals(z))); //true, because it compares data
        System.out.print("\n"+ (x.equals(m))); //flase, because it compares data
        System.out.print("\n" + (x.equalsIgnoreCase(m))); //true; because cases are ignored
        
        String name1 = "Aadit";
        String name2 = "Aarav";
        String name3 = "Arnav";
        System.out.print("\nString comparison using compareTo(): ");
        System.out.print("\n" + name1.compareTo(name2));
        System.out.print("\n" + name2.compareTo(name3));
        String name4 = "AADIT";
        System.out.print("\n" + name1.compareToIgnoreCase(name4)); //0
        
        System.out.print("\nUpper case: " + name1.toUpperCase());
        System.out.print("\nLower case: " + name4.toLowerCase());
    }
}
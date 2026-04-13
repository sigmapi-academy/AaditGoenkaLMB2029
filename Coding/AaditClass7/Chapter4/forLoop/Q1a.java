package Chapter4.forLoop;


/**
 * Write a description of class Q1a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1a
{
    public static void main(String args[]){
        int start;
        System.out.print("\f");
        for(start = 1; start < 10; start++){
            System.out.print(start*start+", ");
        }
        System.out.print(start*start+"\n");
    }
}
package StringProgramming;


/**
 * Write a description of class Q30a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q30a
{
    public static void main(String args[]){
        int numOfLines = 6, i;
        char c;
        System.out.print("\f");
        for(i = 0;i < numOfLines; i++, System.out.print("\n")){
            for(c = (char)('A' + i); c < 'A' + numOfLines; c++){
                System.out.print(c+" ");
            }
        }
    }
}
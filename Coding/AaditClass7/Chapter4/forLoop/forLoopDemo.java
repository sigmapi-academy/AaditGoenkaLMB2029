package Chapter4.forLoop;


/**
 * Write a description of class forLoopDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class forLoopDemo
{
    public static void main(String args[]){
        System.out.print("\f");
        int x = 0;
        for(System.out.print("\nFeeling infinite!!!!");;System.out.print("\nFeeling infinite!!!!")){
            
            x++;
            if(x == 10){
                break;
            }
        }
        System.out.print("\nx = " + x);
    }
}
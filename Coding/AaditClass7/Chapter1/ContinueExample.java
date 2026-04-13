package Chapter1;


/**
 * Write a description of class ContinueExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContinueExample
{
    public static void main(String[] args){
        int i;
        System.out.print("\f");
        for(i = 1 ; i < 50; i++){
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                break; //will terminate the loop,
            }
            System.out.print(i+" ");
        }
    }
}
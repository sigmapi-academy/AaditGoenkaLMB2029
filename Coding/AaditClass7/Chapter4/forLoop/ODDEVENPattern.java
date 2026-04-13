package Chapter4.forLoop;
import java.util.*;


/**
 * Write a description of class ODDEVENPattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ODDEVENPattern
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int line, i, j;
        System.out.print("\fEnter number of lines (3-8): ");
        line = sc.nextInt();
        if(line < 3 || line > 8){
            System.out.print("\nERROR: Invalid input");
        }
        else{
            for(i = 1; i <= line; i++){
                //loop for printing spaces
                for(j = 0; j < line - i; j++){
                    System.out.printf("%4s", " ");
                }
                //loop for printing odd terms.
                for(j = 1; j <= i*2-1; j++){
                    if(j % 2 == 1){
                        System.out.printf("%4d",(line+1));
                    }
                    else{
                        System.out.printf("%4d",line);
                    }
                }
                System.out.println();
            }
        }
    }
}